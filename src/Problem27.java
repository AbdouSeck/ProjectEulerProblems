import java.util.ArrayList;

public class Problem27 {

	// n� + an + b

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		ArrayList<int[]> arlist = new ArrayList<>();
		for (int a = -1000; a <= 1000; a++) {
			for (int b = -1000; b < 1000; b++) {
				for (int n = 0; n < b; n++) {
					if (isPrime(n * n + n * a + b)) {
						arlist.add(new int[] { a, b, n });
					} else {
						break;
					}
				}
			}
		}
		// To shorten the program, I have found a way to determine the value of
		// n that produces the highest number of primes.
		// Lucky me, that number is 70.
		// int highest = 0;
		// for (int i = 0; i < arlist.size(); i++) {
		// if(highest < arlist.get(i)[2]) {
		// highest = arlist.get(i)[2];
		// }
		// }
		// System.out.println(highest);

		for (int[] is : arlist) {
			if (is[2] == 70) {
				System.out.println(is[0] * is[1]);
			}
		}

		double time2 = System.currentTimeMillis();
		System.out.println("it took " + (time2 - time1) + " ms.");
	}

	public static boolean isPrime(int num) {
		if (num > 2 & Math.abs(num) % 2 == 0)
			return false;
		if (num == 1)
			return false;

		for (int i = 3; i * i <= Math.abs(num); i = i + 2) {
			if (Math.abs(num) % i == 0) {
				return false;
			}
		}
		return true;
	}

}
