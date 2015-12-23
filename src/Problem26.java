import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Problem26 {

	public static void main(String[] args) throws IOException {
		
		String [] allnums = new String[999];

		try (BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\abdou.seck\\Documents\\Programming\\problem26.txt")))
		{

		String CurrentString;
		int counter = 0;
		while ((CurrentString = buffer.readLine()) != null) {
		allnums[counter++] = CurrentString;
		}
	  }
		for (String string : allnums) {
			System.out.println(string.substring(1,string.length()));
		}
    }
	
}

