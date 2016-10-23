//https://projecteuler.net/problem=47
import java.util.ArrayList;
import java.util.HashSet;

public class Problem47 {

	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		int num = 667;

		while (!has4Consecutives(num)) {
			num += 1;
		}

		System.out.println(num);
		double end = System.currentTimeMillis();
		System.out.println("The runtime took " + (end - start) + " ms.");
	}

	public static boolean has4Consecutives(int num) {
		int counter = 0;
		for (int i = num; i < num + 4; i++) {
			if (primefactors(i).size() == 4) {
				counter++;
			}
		}
		if (counter == 4) {
			return true;
		}

		return false;
	}

	public static ArrayList<Integer> primefactors(int num) {
		ArrayList<Integer> factors = new ArrayList<>();
		for (int i = 2; i * i < num; i++) {
			while (num % i == 0) {
				factors.add(i);
				num /= i;
			}
		}
		if (num > 1)
			factors.add(num);

		return new ArrayList<Integer>(new HashSet<>(factors));
	}

}
