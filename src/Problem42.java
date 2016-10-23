//https://projecteuler.net/problem=42
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem42 {

	public static void main(String[] args) throws IOException {
		double time1 = System.currentTimeMillis();
		int counter = 0;
		String str = null;
		String currentLine;
		BufferedReader bf = new BufferedReader(new FileReader("data/words.txt"));

		while ((currentLine = bf.readLine()) != null) {
			str = currentLine;
		}

		ArrayList<String> arrlist = new ArrayList<>(Arrays.asList(str.replace("\"", "").split(",")));
		for (String string : arrlist) {
			if (isTriangleNumber(namescore(string))) {
				counter++;
			}
		}
		System.out.println(counter);
		bf.close();
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took " + (time2 - time1) + " ms.");
	}

	public static int namescore(String name) {
		int score = 0;
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String[] arr = name.split("");
		for (String string : arr) {
			score += (letters.indexOf(string.toLowerCase()) + 1);
		}
		return score;
	}

	public static boolean isTriangleNumber(int num) {

		for (double i = 0; 0.5 * i * (i + 1) <= num; i++) {
			if (0.5 * i * (i + 1) == num) {
				return true;
			}
		}

		return false;
	}

}
