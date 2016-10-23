
public class Problem30 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		int start = 32;
		int end = 531441;
		int total = 0;

		for (int i = start; i < end; i++) {
			double test = 0;
			for (int j = 0; j < Integer.toString(i).length(); j++) {
				test = test + Math.pow(Double.parseDouble(Integer.toString(i).split("")[j]), 5);
			}
			if (test == i) {
				total = total + i;
			}
		}

		System.out.println(total);
		double time2 = System.currentTimeMillis();
		System.out.println("It took " + ((time2 - time1) / 1000) + " seconds");
	}

}
