
public class Problem5 {
	
	//Find the smallest number that is divisible by all integers between 1 and 20
	
	public static void main(String[] args) {
		double time1 =  System.currentTimeMillis();
		long n = 20;
		//Loop from 20 until you get to the first number that is all20.
		while(!all20(n)) {
			n += 20;
		}
		

		
		System.out.println(n);
		double time2 =  System.currentTimeMillis();
		System.out.println("The runtime took "+(time2-time1)+" ms");
	}
	//Create Method to check if a number is divisible by all integers between 1 and 20
	public static boolean all20 (long num) {
		int counter = 0;
		for (long i = 1; i <= 20; i++) {
			if(num%i==0) counter++;
		}
		if(counter==20) {
			return true;
		}
		
		return false;
	}
}
