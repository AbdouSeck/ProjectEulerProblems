

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 1;
		long sum = 0;
		while(fib(n) < 4000000) {
			if(fib(n)%2==0) sum += fib(n);
			n++;
		}
		
		System.out.println(sum);
	}
	
	private static long fib(long val) {
		if(val <= 1) {
			return 1;
		}
		
		long fibo = 1, fib1 = 1, fib2 = 1;
		
		for (int i = 2; i < val; i++) {
			fibo = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibo;
		}
		
		return fibo;
	}
}
