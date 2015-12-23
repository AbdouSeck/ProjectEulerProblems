import java.util.ArrayList;


public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double time1 = System.currentTimeMillis();
		long starter = 600851475143L;
		
		ArrayList<Long> primefacs = new ArrayList<Long>();
		
		for (long i = 2; i*i < starter; i++) {
			if(isPrime(i) & starter%i==0) {
				primefacs.add(i);
			}
		}
		
		System.out.println(primefacs.get(primefacs.size()-1));
		double time2 = System.currentTimeMillis();
		
		System.out.println("Runtime took "+(time2-time1)+" ms");
	}
	
	public static boolean isPrime(long num) {
		if (num > 2 & Math.abs(num)%2 == 0) return false;
		if (num == 1) return false;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
		
>>>>>>> 0f0a3b5f3228047fb7d686dce956fff4f2ab5e8c
>>>>>>> 4e59064f8751b0e7ce02608fbbd0cad7cf98cfd6
		for (long i = 3; i*i <= Math.abs(num); i=i+2) {
			if(Math.abs(num)%i==0) {
				return false;
			}
		}
		return true;
	}
}
