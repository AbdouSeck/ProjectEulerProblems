import java.util.ArrayList;


public class Problem28 {

	public static void main(String[] args) {
		
		ArrayList<Long> nums = new ArrayList<>();
		nums.add(1L);
		for (int level = 1; level*2+1 <= 1001; level++) {
			for (int i = 1; i <= 4; i++) {
				nums.add(nums.get(nums.size()-1)+2*level);
			}
		}
		System.out.println(sum(nums));
	}
	
	public static long sum(ArrayList<Long> arrlist) {
		long sum = 0;
		for (Long long1 : arrlist) {
			sum += long1;
		}
		
		return sum;
	}

}
