import java.util.ArrayList;
import java.util.Collections;


public class Problem41 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		ArrayList<String> arrlist = new ArrayList<>();
		ArrayList<Integer> primes = new ArrayList<>();
		//Tested for 9 and 8 digit numbers and it didn't work and I moved to 7 digit numbers 
		arrlist = permutation("7654321");
		Collections.sort(arrlist);
		for (String string : arrlist) {
			if(Problem27.isPrime(Integer.parseInt(string))) {
				primes.add(Integer.valueOf(string));
			}
		}
		
		System.out.println(primes.get(primes.size()-1));
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took "+(time2 - time1)+" ms.");
	}
	
	//Use the merge function to determine all the permutations of a set of characters
	public static ArrayList<String> permutation(String str) {
		ArrayList<String> res = new ArrayList<>();
		if(str.length()==1) {
			res.add(str);
		} else if(str.length() > 1) {
			String last = str.substring(str.length()-1);
			String remaining = str.substring(0,str.length()-1);

			res = merge(permutation(remaining),last);
		}
		return res;
	}
	
	//Create a merge function that adds extra characters to an already designated string
	public static ArrayList<String> merge(ArrayList<String> list, String c) {
		ArrayList<String> res = new ArrayList<>();
		for (String s : list) {
			for (int i=0; i<s.length()+1;i++) {
				StringBuffer sb = new StringBuffer(s).insert(i,c);
				res.add(sb.toString());
			}
		}
		return res;
	}

}
