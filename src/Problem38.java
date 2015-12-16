import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Problem38 {

	public static void main(String[] args) {
		double starttime = System.currentTimeMillis();
		ArrayList<String> concats = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 1; j <= i; j++) {
				if(sb.length()<9) {
					sb.append(i*j);
					if(sb.length()==9) {
						concats.add(sb.toString());
					}
				}
			}
		}
		System.out.println(largestPandigital(concats));
		double endtime = System.currentTimeMillis();
		System.out.println("Runtime took "+(endtime - starttime)/1000+" seconds!");
	}
	
	public static int largestPandigital (ArrayList<String> string) {
		int max = Integer.parseInt(string.get(0));
		for (int i = 0; i < string.size(); i++) {
			if(string.get(i).split("").length==new HashSet<String>(Arrays.asList(string.get(i).split(""))).size()) {
				if(max < Integer.parseInt(string.get(i)) & !string.get(i).contains("0")) {
					max = Integer.parseInt(string.get(i));
				}
			}
		}
		return max;
	}

}
