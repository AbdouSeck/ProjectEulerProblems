//https://projecteuler.net/problem=34

public class Problem34 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		int sum = 0;
		for (int i = 10; i < factorial(10); i++) {
			String[] temp = Integer.toString(i).split("");
			int tempsum = 0;
			for (String string : temp) {
				tempsum = tempsum + factorial(Integer.parseInt(string));
			}
			if (i == tempsum) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
		double time2 = System.currentTimeMillis();
		System.out.println("It took " + (time2 - time1) / 1000 + " seconds.");

	}

	public static int factorial(int num) {
		if (num == 1 | num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
