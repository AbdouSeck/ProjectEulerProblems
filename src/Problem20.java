import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Finding the sum of the digits of the result of 100!

		long time1 = System.nanoTime();

		BigInteger num = factorial(BigInteger.valueOf(100));

		String str = num.toString();
		int sum = 0;

		String[] elements = str.split("");

		for (String string : elements) {
			sum = sum + Integer.parseInt(string);
		}

		System.out.println(sum);

		long time2 = System.nanoTime();

		System.out.println("The runtime took " + (time2 - time1) + "ns");
	}

	private static BigInteger factorial(BigInteger x) {
		BigInteger rslt = BigInteger.ONE;
		if (Integer.parseInt(x.toString()) < 2) {
			return BigInteger.valueOf(1);
		} else {
			rslt = BigInteger.valueOf(Integer.parseInt(x.toString())).multiply(factorial(x.subtract(BigInteger.ONE)));
			return rslt;
		}
	}

}
