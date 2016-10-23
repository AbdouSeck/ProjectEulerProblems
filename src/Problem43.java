//https://projecteuler.net/problem=43
public class Problem43 {

	public static void main(String[] args) {
		
		double start = System.currentTimeMillis();
		System.out.println(Problem41.permutation("1234567890").stream().filter(y -> SpecialPandigital(y))
				.mapToLong(z -> Long.parseLong(z)).sum());
		double end = System.currentTimeMillis();
		System.out.println("The runtime took " + (end - start) + " ms.");
	}

	public static boolean ZeroTo9(String pandigit) {
		if (pandigit.length() == String.valueOf(Long.parseLong(pandigit)).length()) {
			return true;
		}
		return false;
	}

	public static boolean SpecialPandigital(String pandigit) {
		if (Long.parseLong(pandigit.substring(1, 4)) % 2 == 0 && Long.parseLong(pandigit.substring(2, 5)) % 3 == 0
				&& Long.parseLong(pandigit.substring(3, 6)) % 5 == 0
				&& Long.parseLong(pandigit.substring(4, 7)) % 7 == 0
				&& Long.parseLong(pandigit.substring(5, 8)) % 11 == 0
				&& Long.parseLong(pandigit.substring(6, 9)) % 13 == 0
				&& Long.parseLong(pandigit.substring(7, 10)) % 17 == 0) {
			return true;
		}
		return false;
	}

}
