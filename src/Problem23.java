import java.util.ArrayList;

public class Problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time1 = System.nanoTime()/1000000;
		
		ArrayList<Integer> abundants = new ArrayList<Integer>();
		ArrayList<Integer> sums = new ArrayList<Integer>();
		
		for (int j = 1; j <= 28123; j++) {
			
			if(Problem21.sumofdivisors(j)>j) {
				abundants.add(j);
			}
		}
		
		for (Integer integer : abundants) {
			for (Integer integer1 : abundants) {
				if((integer + integer1)<28123) {
					if(!sums.contains((integer+integer1))) {
						sums.add(integer + integer1);
					}
				
			  }
			}
		}
		
		System.out.println(sums.size());
		
		int sum = 0;
		
		for (int i = 1; i < 28123; i++) {
			if(!sums.contains(i)) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
		
		long time2 = System.nanoTime()/1000000;
		
		System.out.println("The runtime took "+(time2-time1)+" ms");

	}

}
