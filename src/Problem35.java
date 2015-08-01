import java.util.ArrayList;


public class Problem35 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		ArrayList<Integer> primes = new ArrayList<>();
		
		for (int i = 1; i < 1000000; i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		int count = 0;
		for (Integer integer : primes) {
			int primecount = 0;
			String check = Integer.toString(integer);
			for (int i = 0; i < check.length(); i++) {
				String check2 = check.substring(check.length()-1, check.length())+check.substring(0, check.length()-1);
				if(isPrime(Integer.parseInt(check2))) {
					primecount += 1;
				}
				check = check2;
			}
			if (primecount==integer.toString().length()) {
				count += 1;
			}
		}
		
		System.out.println(count);
		double time2 = System.currentTimeMillis();
		System.out.println("It took "+(time2-time1)/1000+" seconds");
	}
	
	public static boolean isPrime(int num) {
		if (num > 2 & Math.abs(num)%2 == 0) return false;
		if (num == 1 || num == 0) return false;
		
		for (int i = 3; i*i <= Math.abs(num); i=i+2) {
			if(Math.abs(num)%i==0) {
				return false;
			}
		}
		return true;
	}
}
