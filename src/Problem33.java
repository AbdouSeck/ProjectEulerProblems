
public class Problem33 {

	public static void main(String[] args) {
		for (double i = 11; i < 100; i++) {
			for (double j = 11; j < 100; j++) {
				if (String.valueOf(j).contains("" + String.valueOf(i).charAt(0))
						| String.valueOf(j).contains("" + String.valueOf(i).charAt(1)))
					CuriousFraction(i, j);
			}
		}
	}

	public static void CuriousFraction(double test1, double test2) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (test1 / test2 < 1 & !String.valueOf((int) test1).contains("0")
						& !String.valueOf((int) test2).contains("0")) {
					if ((double) Character.getNumericValue(String.valueOf(test1).charAt(i))
							/ (double) Character.getNumericValue(String.valueOf(test2).charAt(j)) == test1 / test2) {
						System.out.println((int) test1 + ":" + (int) test2);
						;
					}
				}
			}
		}
	}
}