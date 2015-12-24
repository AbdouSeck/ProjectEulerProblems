

public class Problem26 {

	public static void main(String[] args) {
		//The algo works this way: initially the remainder of 1 over the integer is 1
		//Multiply it by 10 and then find the remainder of 10 over the integer
		//Multiply this new integer by 10 again and proceed to conduct a recursion until you get a remainder of 1 again
		
		System.out.println(lengthofpattern(2));
		
    }
	public static long lengthofpattern(long num) {
		long counter = 1;
		long n = 10;
		
		if(n%num==1) {
			return 1;
		} else {
			while(n%num>1) {
				n = n*10;
				n = n%num;
				counter++;
			}
			return counter;
		}
	}
}

