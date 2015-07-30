import java.math.BigInteger;


public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//		What is the sum of the digits of the number 2^1000?
		
		long time1 = System.currentTimeMillis();
		
		BigInteger num1 = BigInteger.valueOf(2).pow(1000);
		
		String str = num1.toString();
		String[] arrayint = str.split("");
		
		int sum = 0;
		
		for (String nums : arrayint) {
			sum += Integer.parseInt(nums);
		}
		
		System.out.println(sum);
		
		long time2 = System.currentTimeMillis();
		
		System.out.println("This program took "+(time2-time1)+"ms to run!");

	}

}
