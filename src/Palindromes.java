
public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MAMA";
		
		if(str.equalsIgnoreCase(Palindrome(str))) {
			System.out.printf("The string '%s' is a palindrome!\n", str);
		} else {
			System.out.printf("The string '%s' is not a palindrome!\n",str);
		}
		
		int num = 240;
		
		if(num == Palindrome(num)) {
			System.out.printf("The number'%d' is a palindrome!\n",num);
			System.out.println(Palindrome(num)+"\n");
		} else {
			System.out.printf("The number '%d'is not a palindome!\n",num);
			System.out.println(Palindrome(num)+"\n");
		}

	}
	
	public static String Palindrome (String str) {
		StringBuilder revstr = new StringBuilder();
		
		for (int i = str.length()-1; i >= 0; i--) {
			revstr = revstr.append(str.charAt(i));
		}
		
		return revstr.toString();
	}
	
	public static int Palindrome(int integer) {
		
		int revint = 0;
		
        while (integer > 0) {
            int rem = integer % 10;
            revint = (revint * 10) + rem;
            integer = integer / 10;
        }
		
		return revint;
	}
}
