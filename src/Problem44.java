
//https://projecteuler.net/problem=44
//https://en.wikipedia.org/wiki/Pentagonal_number

public class Problem44 {

	public static void main(String[] args) {
		// Define a function to determine whether or not a given number is Pentagonal (using wikipedia article)
		//Run a double loop (for-loop inside a while-loop) to find a number that meets
		//the criteria defined in the question
		
		double time1 = System.currentTimeMillis();
		int number = 0;
		boolean found = false;
		while (!found) {
			number++;
			int n = number * (3 * number - 1) / 2;
			for (int i = number - 1; i > 0; i--) {
				int m = i * (3 * i - 1) / 2;
				if(isPentagonal(n + m) && isPentagonal(Math.abs(n - m))) {
					System.out.println("D = "+ Math.abs(n - m));
					System.out.println("It took "+(System.currentTimeMillis() - time1)+" ms.");
					found = true;
					break;
				}
			}
		}
		
	}
	
	public static boolean isPentagonal(double num) {
		double natural_number = (Math.sqrt(24*num + 1) + 1)/6;
		if ((int) natural_number == natural_number) {
			return true;
		}
		return false;
	}
}
