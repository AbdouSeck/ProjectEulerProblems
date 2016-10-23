import java.util.ArrayList;

public class Problem10 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		ArrayList<Long> primes = new ArrayList<>();
		primes.add(2L);
		for (long i = 3; i < 2000000; i = i + 2) {
			if (Problem3.isPrime(i)) {
				primes.add(i);
			}
		}

		System.out.println(sum(primes));
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took " + (time2 - time1) + " ms.");
	}

	public static long sum(ArrayList<Long> arrlist) {
		long sum = 0;
		for (Long long1 : arrlist) {
			sum += long1;
		}
		return sum;
	}

}
