package Exceptionhandling_Example;

public class Exceptionexample {
	
	public static void mian(String[] args) {
	try {
		int a[]= {6,7,8,4};
		System.out.println(a[5]);
	}
	catch (ArrayIndexOutOfBoundsException ae)
	{
		System.err.println("Exception occured:"+ae.getMessage());
	}
    System.out.println("next line");
}
}