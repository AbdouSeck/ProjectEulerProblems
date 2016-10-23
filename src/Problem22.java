import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] allnames = new String[5163];

		try (BufferedReader buffer = new BufferedReader(
				new FileReader("/Users/aseck-mit/Documents/Personal/workspace/ProjectEulerProblems/data/names.txt"))) {
			String names = buffer.readLine();
			allnames = names.replace("\"", "").split(",");

			Arrays.sort(allnames);

			int total = 0;
			for (int i = 0; i < allnames.length; i++) {
				total += NameScore(allnames[i].toString()) * (i + 1);
			}

			System.out.println(total);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static int LetterScore(String let) {
		String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		int letterscore = 0;

		for (int i = 0; i < letters.length; i++) {
			if (let.equals(letters[i])) {
				letterscore = i + 1;
			}
		}
		return letterscore;
	}

	public static int NameScore(String Name) {
		int namescore = 0;
		String[] elements = Name.split("");
		for (int i = 0; i < elements.length; i++) {
			namescore = namescore + LetterScore(elements[i].toString());
		}
		return namescore;
	}

}
