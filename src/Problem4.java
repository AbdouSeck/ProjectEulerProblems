import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> palindromes = new ArrayList<Integer>();
		double time1 = System.currentTimeMillis();
		for (int i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				if (isPalindrome(i * j)) {
					palindromes.add(i * j);
				}
			}
		}
		System.out.println(max(palindromes));
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took " + (time2 - time1) + " ms");
	}

	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equals(sb.toString())) {
			return true;
		}
		return false;
	}

	public static boolean isPalindrome(int num) {
		String str = Integer.toString(num);
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		if (str.equals(sb.toString())) {
			return true;
		}
		return false;
	}

	public static int max(ArrayList<Integer> pals) {
		int largest = pals.get(0);

		for (Integer integer : pals) {
			if (largest < integer) {
				largest = integer;
			}
		}

		return largest;
	}
}
