import java.math.BigInteger;

public class Problem15 {

	public static void main(String[] args) {
		// this problem is solved using a binomial coefficient method
		// Since this is a 20 by 20 grid we are going to use nC2n = (2n!)/(n!n!)
		double time1 = System.currentTimeMillis();
		System.out.println(factorial(new BigInteger(Long.toString(2 * 20))).divide(
				factorial(new BigInteger(Long.toString(20))).multiply(factorial(new BigInteger(Long.toString(20))))));
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took " + (time2 - time1) + " ms.");
	}

	public static BigInteger factorial(BigInteger num) {
		if (num.compareTo(BigInteger.ONE) == -1 | num.compareTo(BigInteger.ONE) == 0) {
			return BigInteger.ONE;
		} else {
			return num.multiply(factorial(num.subtract(BigInteger.ONE)));
		}
	}

}
