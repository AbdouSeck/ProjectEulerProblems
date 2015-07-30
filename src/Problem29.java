import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time1 = System.nanoTime()/1000000;
		ArrayList<Double> nums = new ArrayList<Double>();
		for (double i = 2; i < 101; i++) {
			for (double j = 2; j < 101; j++) {
				nums.add(Math.pow(i, j));
			}
		}
		
		Set<Double> checks = new HashSet<Double>(nums);
		System.out.println(checks.size());
		long time2 = System.nanoTime()/1000000;
		
		System.out.println("It took "+(time2-time1)+" ms.");

	}

}
