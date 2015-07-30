
/* Name of the class has to be "Main" only if the class is public. */
class Problem25
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(fibonacci(5));
	}
	
	public static int fibonacci(int num) {
		if(num == 1 || num == 2) {
			return 1;
		} else {
			return (fibonacci(num-1)+fibonacci(num-2));
		}
		
	}
}