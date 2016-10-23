//https://projecteuler.net/problem=37
import java.util.ArrayList;
import java.util.Arrays;

public class Problem37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double starttime = System.currentTimeMillis();
		int sum = 0;
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 11; i < 1000000; i++) {
			if (Problem35.isPrime(i)) {
				primes.add(i);
			}
		}
		for (Integer integer : primes) {
			if (truncatedleft(integer) & truncatedright(integer)) {
				sum = sum + integer;
			}
		}
		System.out.println(sum);
		double endtime = System.currentTimeMillis();
		System.out.println("The runtime is " + (endtime - starttime) / 1000 + " seconds");
	}

	public static boolean truncatedright(int test) {
		String teststring = String.valueOf(test);
		int[] truncateright = new int[teststring.length()];
		int primecount = 0;
		for (int i = 0; i < truncateright.length; i++) {
			truncateright[i] = Integer.parseInt(teststring.substring(0, teststring.length() - i));
		}
		for (int i = 0; i < truncateright.length; i++) {
			if (Problem35.isPrime(truncateright[i])) {
				primecount = primecount + 1;
			}
		}
		if (!Arrays.asList(truncateright).contains(0)) {
			if (primecount == truncateright.length) {
				return true;
			}
		}

		return false;
	}

	public static boolean truncatedleft(int test) {
		int primecount = 0;
		String teststring1 = String.valueOf(test);
		int[] truncateleft = new int[teststring1.length()];
		for (int i = 0; i < truncateleft.length; i++) {
			truncateleft[i] = Integer.parseInt(teststring1.substring(i, teststring1.length()));
		}
		for (int i = 0; i < truncateleft.length; i++) {
			if (Problem35.isPrime(truncateleft[i])) {
				primecount = primecount + 1;
			}
		}
		if (!Arrays.asList(truncateleft).contains(0)) {
			if (primecount == truncateleft.length)
				return true;
		}

		return false;
	}
}
