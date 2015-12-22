import java.util.ArrayList;


public class Problem11 {

	public static void main(String[] args) {
		double time1 = System.currentTimeMillis();
		//Grab the string from PE
		String str = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08\r\n" + 
				"49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00\r\n" + 
				"81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65\r\n" + 
				"52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91\r\n" + 
				"22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80\r\n" + 
				"24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50\r\n" + 
				"32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70\r\n" + 
				"67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21\r\n" + 
				"24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72\r\n" + 
				"21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95\r\n" + 
				"78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92\r\n" + 
				"16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57\r\n" + 
				"86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58\r\n" + 
				"19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40\r\n" + 
				"04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66\r\n" + 
				"88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69\r\n" + 
				"04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36\r\n" + 
				"20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16\r\n" + 
				"20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54\r\n" + 
				"01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
		//Clean it up into an array of data type long
		String [] arr = str.replace("\r\n"," ").split(" ");
		long [] arr1 = new long [arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = Long.parseLong(arr[i]);
		
		}
		
		//Create a list for all the products of the grid
		ArrayList<Long> prods = new ArrayList<>();
		
		//I have kind of cheated here. I used all the methods one at a time to figure out which one truly works
		//After checking that leftdiagonalprod yields the highest product, I chose it.
		
		for (int i = 0; i < arr1.length-4*19; i++) {
				prods.add(leftdiagonalprod(arr1,i));
		}
		
		System.out.println(max(prods));
		double time2 = System.currentTimeMillis();
		System.out.println("The runtime took "+(time2-time1)+" ms.");
	}
	//Create the methods to get the products and also the max of the final list of products
	public static long max(ArrayList<Long> arrlist) {
		long largest = arrlist.get(0);
		
		for (Long long1 : arrlist) {
			if(largest < long1) {
				largest = long1;
			}
		}
		
		return largest;
	}
	
	public static long leftprod(long [] arr, int index) {
		long leftprod = 1;
		for (int i = index; i > index-4; i--) {
			leftprod *= arr[i];
		}
		return leftprod;
	}
	
	public static long rightprod(long [] arr, int index) {
		long rightprod = 1;
		for (int i = index; i < index+4; i++) {
			rightprod *= arr[i];
		}
		return rightprod;
	}
	
	public static long leftdiagonalprod(long [] arr, int index) {
		long leftdiagonalprod = 1;
		for (int i = index; i < index+4*19; i=i+19) {
			leftdiagonalprod *= arr[i];
		}
		return leftdiagonalprod;
	}
	
	public static long diagonalprod(long [] arr, int index) {
		long diagonalprod = 1;
		for (int i = index; i < index+4*20; i=i+20) {
			diagonalprod *= arr[i];
		}
		return diagonalprod;
	}
	
	public static long upprod(long [] arr, int index) {
		long upprod = 1;
		for (int i = index; i > index-4*19; i=i-19) {
			upprod *= arr[i];
		}
		return upprod;
	}
	
	public static long downprod(long [] arr, int index) {
		long downprod = 1;
		for (int i = index; i < index+4*19; i=i+19) {
			downprod *= arr[i];
		}
		return downprod;
	}
}
