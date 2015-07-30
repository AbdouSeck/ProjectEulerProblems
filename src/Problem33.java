

public class Problem33 {

	public static void main(String[] args) {
//		non-trivial fractions
		System.out.println(NonTrivial(49,98));
		int producti = 1;
		int productj = 1;
		int count = 0;
		
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 99; j++) {
				if(NonTrivial(i,j)) {
					System.out.println(i+" and "+j);
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean NonTrivial(int numer, int denom) {
		if((Double.parseDouble(Integer.toString(numer))/Double.parseDouble(Integer.toString(denom)))<1) {
			if(Double.parseDouble(Integer.toString(numer).substring(0, 1))/Double.parseDouble(Integer.toString(denom).substring(0, 1))==(Double.parseDouble(Integer.toString(numer))/Double.parseDouble(Integer.toString(denom)))|Double.parseDouble(Integer.toString(numer).substring(0, 1))/Double.parseDouble(Integer.toString(denom).substring(1, 2))==(Double.parseDouble(Integer.toString(numer))/Double.parseDouble(Integer.toString(denom)))|Double.parseDouble(Integer.toString(numer).substring(1, 2))/Double.parseDouble(Integer.toString(denom).substring(0, 1))==(Double.parseDouble(Integer.toString(numer))/Double.parseDouble(Integer.toString(denom)))|Double.parseDouble(Integer.toString(numer).substring(1, 2))/Double.parseDouble(Integer.toString(denom).substring(1, 2))==(Double.parseDouble(Integer.toString(numer))/Double.parseDouble(Integer.toString(denom)))) {
				if(!(Integer.toString(numer).contains("0"))&!Integer.toString(denom).contains("0")) {
					if(String.valueOf(numer).contains(String.valueOf(denom).split("")[0])|String.valueOf(numer).contains(String.valueOf(denom).split("")[1])) {
						if(numer%11!=0 & denom%11!=0) {
							return true;
						}
					}
				}
			}
		}
		
		return false;
	}

}
