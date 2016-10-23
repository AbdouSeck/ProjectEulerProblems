import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem32 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		ArrayList<Integer> products = new ArrayList<>();
		for (int i = 1; i <= 3000; i++) {
			for (int j = 1; j <= 3000; j++) {
				String[] checkstring = (new String(Integer.toString(i) + Integer.toString(j) + Integer.toString(i * j)))
						.split("");
				Set<String> checkset = new HashSet<>(Arrays.asList(checkstring));

				if (checkstring.length == 9 & checkstring.length == checkset.size() & !checkset.contains("0")) {
					products.add(i * j);
				}
			}
		}
		Set<Integer> finalproducts = new HashSet<>(products);
		int sums = 0;
		for (Integer integer : finalproducts) {
			System.out.println(integer);
			sums = sums + integer;
		}
		System.out.println(sums);
		double time2 = System.currentTimeMillis();
		System.out.println("It took " + ((time2 - time1) / 1000) + " seconds");
	}

}
