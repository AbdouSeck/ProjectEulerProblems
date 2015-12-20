
public class Problem6 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		System.out.println(Math.abs(sumofsqrs(100)-sqrofsum(100)));
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took "+(time2-time1)+" ms.");
	}
	
	public static long sumofsqrs(long num) {
		int sum = 0;
		for (long i = 1; i <= num; i++) {
			sum+=i*i;
		}
		return sum;
	}
	
	public  static long sqrofsum(long num) {
		int sum = 0;
		for (long i = 1; i <= num; i++) {
			sum+=i;
		}
		
		return sum*sum;
	}
}