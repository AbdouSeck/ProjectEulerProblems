import java.util.ArrayList;
import java.util.Arrays;


public class Problem37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(truncatable(10));
	}
	
	public static boolean truncatable(int number) {
		if(Problem35.isPrime(number)) {
			String teststr = Integer.toString(number);
			int [] truncatedright = new int [teststr.length()];
			int [] truncatedleft = new int [teststr.length()];
			for (int j = 0; j < truncatedright.length; j++) {
				if(Problem35.isPrime(Integer.parseInt(teststr))) {
					truncatedright[j] = Integer.parseInt(teststr);
					teststr = teststr.substring(0, teststr.length()-1);
				} else {
					truncatedright[j] = 0;
				}
			}
			
			String teststr1 = Integer.toString(number);
			for (int j = 0; j < truncatedleft.length; j++) {
				if(Problem35.isPrime(Integer.parseInt(teststr1))) {
					truncatedleft[j] = Integer.parseInt(teststr1);
					teststr1 = teststr1.substring(1, teststr1.length());
				} else {
					truncatedleft[j] = 0;
				}
			}
			if(!Arrays.asList(truncatedright).contains(0) & !Arrays.asList(truncatedleft).contains(0)) {
					return true;
				}
		}
		
		return false;
	}

}
