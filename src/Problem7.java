//https://projecteuler.net/problem=7
public class Problem7 {

	public static void main(String[] args) {
		int[] primes = new int[10001];

		int number = 2;
		int counter = 0;

		while (counter < 10001) {
			if (Problem3.isPrime(number)) {
				primes[counter] = number;
				counter++;
			}
			number++;
		}

		System.out.println(primes[primes.length - 1]);
	}

}
