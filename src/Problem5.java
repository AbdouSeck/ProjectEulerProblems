import java.math.BigInteger;

public class Problem5 {

	// Find the smallest number that is divisible by all integers between 1 and
	// 20

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		long rslt = 1;
		for (int i = 2; i <= 20; i++) {
			rslt = lcm(rslt, i);
		}
		System.out.println(rslt);
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took " + (time2 - time1) + " ms.");
	}

	// Create a method for the LCM
	public static long lcm(long a, long b) {
		long result = 0;
		BigInteger bia = new BigInteger(Long.toString(a));
		BigInteger bib = new BigInteger(Long.toString(b));
		long gcd = Long.parseLong(bia.gcd(bib).toString());
		result = (a * b) / gcd;
		return result;
	}
}
