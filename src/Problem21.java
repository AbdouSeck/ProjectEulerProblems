

public class Problem21 {

	public static void main(String[] args) {		
		long time1 = System.currentTimeMillis();
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if(sumofdivisors(i)!=i && sumofdivisors(sumofdivisors(i))==i) {
				sum += sumofdivisors(i);
			}
		}
		System.out.println(sum);
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took "+(time2-time1)+" ms.");
	}
	
	public static int sumofdivisors(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
