
public class Problem35 {

	public static void main(String[] args) {
		
	}
	
	public static boolean isPrime(int num) {
		if (num > 2 & Math.abs(num)%2 == 0) return false;
		if (num == 1) return false;
		
		for (int i = 3; i*i <= Math.abs(num); i=i+2) {
			if(Math.abs(num)%i==0) {
				return false;
			}
		}
		return true;
	}
}
