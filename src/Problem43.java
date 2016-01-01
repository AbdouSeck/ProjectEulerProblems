import java.util.ArrayList;


public class Problem43 {

	public static void main(String[] args) {
		ArrayList<String> arrlist = Problem41.permutation("1234567890");
		ArrayList<Integer> pandigitals = new ArrayList<>();
		
		for (String string : arrlist) {
			if(string.length()<10) {
				pandigitals.add(Integer.valueOf(string));
			}
		}
	}
	public static boolean SpecialPandigital(int num) {
		String str = String.valueOf(num);
		for (int i = 0; i < str.length()-3; i++) {
			
		}
		return false;
	}

}
