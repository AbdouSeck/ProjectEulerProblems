
public class Problem34 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 10; i < factorial(10); i++) {
			String[] temp = Integer.toString(i).split("");
			int tempsum = 0;
			for (String string : temp) {
				tempsum = tempsum + factorial(Integer.parseInt(string));
			}
			if(i == tempsum) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);

	}
	
	public static int factorial(int num) {
		if(num == 1 | num == 0) {
			return 1;
		}
		return num*factorial(num-1);
	}

}
