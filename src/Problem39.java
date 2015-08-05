import java.util.ArrayList;


public class Problem39 {

	public static void main(String[] args) {
			double time1 = System.currentTimeMillis();
			ArrayList<Integer> ps = new ArrayList<>();
			for (int i = 10; i <= 1000; i=i+2) {
				for (int j = 10; j < i; j++) {
					for (int j2 = 10; j2 < j; j2++) {
						for (int k = 10; k < j2; k++) {
							if(k+j2+j==i && k*k+j2*j2-j*j==0) {
								ps.add(i);
							}
						}
					}
				}
			}
			for (Integer integer : ps) {
				System.out.println(integer);
			}
			double time2 = System.currentTimeMillis();
			System.out.println("The runtime is "+(time2-time1)/1000+" seconds!");
//			I went ahead and imported and the list created into R to determine the mode of it. That gave me 840.
	}

}
