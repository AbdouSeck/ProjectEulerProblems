import java.util.ArrayList;


public class Problem21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time1 = System.nanoTime()/1000000;
		
		int sum = 0;
		
		for (int i = 1; i < 10000; i++) {
			
			if(SumofDivisors(i) != i && SumofDivisors(SumofDivisors(i))==i) {
				sum += SumofDivisors(i);
			}
		}
		System.out.println(sum);
		
		long time2 = System.nanoTime()/1000000;
		
		System.out.println("The runtime took "+(time2-time1)+" ms");
	}
	
	public static int SumofDivisors(int x) {
		
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		int sum = 0;
		for (int i = 1; i < x; i++) {
			if((x%i)==0) {
				divisors.add(i);
			}
		}
		for (Integer integer : divisors) {
			sum = sum + integer;
		}
		
		return sum;
	}

}
