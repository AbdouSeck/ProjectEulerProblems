
public class Problem40 {

	public static void main(String[] args) {
		double starttime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		int prod = 1;
		for (int i = 0; i <= 1000000; i++) {
			sb.append(Integer.toString(i));
		}
	
		for (int i = 10; i <= 1000000; i=i*10) {
			prod = prod * Integer.parseInt(String.valueOf(sb.toString().charAt(i)));
		}
		
		System.out.println(prod);
		double endtime = System.currentTimeMillis();
		System.out.println("Running time is "+(endtime-starttime)+" ms!");
	}

}
