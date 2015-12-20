
public class Problem9 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		for (int c = 1; c < 1000; c++) {
			for (int b = 1; b < c; b++) {
				for (int a = 1; a < b; a++) {
					if(a*a+b*b==c*c && a+b+c==1000) {
						System.out.println(a*b*c);
					}
				}
			}
		}
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took "+(time2-time1)+" ms.");
	}

}
