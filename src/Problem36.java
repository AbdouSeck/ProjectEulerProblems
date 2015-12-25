
public class Problem36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i < 1000000; i++) {
			if(i == Palindromes.Palindrome(i) & Palindromes.Palindrome(Integer.toBinaryString(i)).equals(Integer.toBinaryString(i))) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}