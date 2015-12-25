import java.util.ArrayList;


public class Problem39 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < i; j++) {
				int a = i*i-j*j;
				int b = 2*i*j;
				int c = i*i+j*j;
				int k = 1;
				while(k*(a+b+c) <= 1000) {
					if(Problem3.isPrime(a) || Problem3.isPrime(b) || Problem3.isPrime(c)) {
						nums.add(k*(a+b+c));
					}
					k++;
				}
			}
		}
		System.out.println(most_common(nums));
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took "+(time2-time1)+" ms.");
	}
	
	public static int most_common(ArrayList<Integer> arrlist) {
		ArrayList<Integer> temp = new ArrayList<Integer>(arrlist);
		int common = 0;
		int largest = 0;
		
		for (Integer integer : temp) {
			int counter = 0;
			while(arrlist.contains(integer)) {
				counter++;
				arrlist.remove(integer);
			}
			if(counter>largest) {
				largest = counter;
				common = integer;
			}
		}
		if(largest == 1) return -1;
		return common;
		
	}

}
