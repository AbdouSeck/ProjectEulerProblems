
public class Problem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long time1 = System.currentTimeMillis();
		
		String [] OnetoNine = {"one", "two", "three", "four", "five", "six", "seven","eight","nine"};
		String [] TentoNineteen = {"ten", "eleven", "twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String [] tens = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String [] hundreds = {"onehundred","twohundred", "threehundred","fourhundred","fivehundred","sixhundred","sevenhundred","eighthundred","ninehundred"};
		String OneThousand = "onethousand";
		
		int len10to19 = 0;
		int len1to9 = 0;
		int len1to999 = 0;
		int len1to99 = 0;
		int len1000 = OneThousand.length();
		
		for (String string : OnetoNine) {
			len1to9 += string.length();
		}
		
		for (String string : TentoNineteen) {
			len10to19 += string.length();
		}
		
		
		for (String string : tens) {
			len1to99 += (10*string.length()+len1to9);
		}
		
		len1to99 = +len1to99 + len1to9 + len10to19;
		
		System.out.println(len1to99);
		
		for (String string : hundreds) {
			//for each element multiply its length by 100 and add 99*3 for every "and"
			len1to999 += (100*string.length()+len1to99+3*99);
		}
		
		System.out.println(len1to999);
		
		//Adding number of characters from 1 to 99 to character from 100 to 999 together
		
		len1to999 = len1to999 + len1to99;
		
		System.out.println(len1to999);
		
		System.out.println("The number of characters is: "+(len1to999+len1000));
		
		long time2 = System.currentTimeMillis();
		
		System.out.println("This program took "+(time2-time1)+" ms");

	}

}
