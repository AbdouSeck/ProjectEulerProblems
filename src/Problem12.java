//https://projecteuler.net/problem=12

public class Problem12 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		long n = 1;
		while (!divisible500(trianglenumber(n))) {
			n++;
		}

		System.out.println(trianglenumber(n));
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took " + (time2 - time1) + " ms.");
	}

	public static long trianglenumber(long num) {
		long sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

	public static boolean divisible500(long num) {
		int counter = 0;
		long limit = num;
		// Not efficient
		// for (long i = 1; i <= num; i++) {
		// if(num%i==0) counter++;
		// }

		// A little less shitty
		if (num == 1)
			counter = 1;
		for (long i = 1; i < limit; ++i) {
			if (num % i == 0) {
				limit = num / i;
				if (limit != i) {
					counter++;
				}
				counter++;
			}
		}

		if (counter > 500) {
			return true;
		}

		return false;
	}
}
