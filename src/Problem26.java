//https://projecteuler.net/problem=26

import java.util.ArrayList;

public class Problem26 {

	public static void main(String[] args) {
		
		// Find the pattern length of every operation 1 % d
		// Save the pattern length in an array
		// Find the max of the array
		// Add 1 to the max to get the value
		
		double time1 = System.currentTimeMillis();
		ArrayList<Integer> pattern_lengths = new ArrayList<>();
		for (int i = 2; i < 1000; i++) {
			pattern_lengths.add(lengthofpattern(i));
		}
		
		System.out.println("The number is: "+(get_max(pattern_lengths)+1));
		System.out.println("Took: "+(System.currentTimeMillis() - time1)+" ms.");

	}
	
	public static int get_max(ArrayList<Integer> patterns) {
		int current_max = patterns.get(0);
		for (Integer integer : patterns) {
			if (current_max < integer) {
				current_max = integer;
			}
		}
		return current_max;
	}

	public static int lengthofpattern(int num) {
		ArrayList<Integer> pattern_elms = new ArrayList<Integer>();
		int current_remainder = 1 % num;
		while (true) {
			current_remainder = current_remainder * 10 % num;
			if (!pattern_elms.contains(current_remainder)) {
				pattern_elms.add(current_remainder);
			} else {
				break;
			}
		}
		
		return pattern_elms.size();
	}
}
