package exceptionHandlingTests;

public class SampleExceptionTry {

	public static void main(String[] args) {
		//String str = null;
		//System.out.println(str.length());
		
		// Code above provides 'NullPointerException'
		
		
		try {
			int a =30; 
			int b =0;
			int c= a/b;
			// Can't raise a number by zero cause it raise ArithmeticException
		
			System.out.println("Result = " + c);
			System.out.println("****************************");
			System.out.println();
		
		}
		
		// Catch block handles ArtithmeticException
		catch(ArithmeticException e) {
			System.out.println("Can't divide a number by zero.. ArthimeticException handled..");
			System.out.println("****************************");
			System.out.println();
		
		}
		
		// Following code consist of nested 'try' methods
		// Main 'try' block not declaring anything
		try {
			// First nested 'try' block
			try {
			int num = Integer.parseInt("Edureka");
			System.out.println(num);
			System.out.println("****************************");
			System.out.println();
		}
		
		// Catch block handles NumberFormatException
		catch(NumberFormatException e) {
			System.out.println("Handling 1st nested 'try' block.. \n"
					+ "Can't take a String as a int.. NumberFormatException handled..");
			System.out.println("****************************");
			System.out.println();
		
		}
			// Second nested 'try' block
			try {
				int a[] = new int[5];
				a[7] = 9; 
			}
			catch (Exception e) {
				System.out.println("Handling 2nd nested 'try' block..");
				System.out.println("****************************");
				System.out.println();
			}
		
		System.out.println("Other Statement.. \n"
				+ "Skipped Main 'try' block due to not declaring anything..");
		System.out.println("****************************");
		System.out.println();
		
		}
		
		// End of Main 'try' block
		// Will not execute SOP due to block not 
		// Declaring anything 
		catch(Exception e) {
			System.out.println("Handled and recovered..");
		}
		
		// Non-nested 'try' statement
		try {
			int a[] = new int[5];
			a[7] = 9;
		}
		
		// Catch block handles 'ArrayIndexOutOfBoundsException'
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Non-nested 'try' block..\n"
					+ "Can't assign the the 7th index int 9.. \n"
					+ "Array 'a' only has 5 indexes.. ArrayIndexOutOfBoundsException handled..");
			System.out.println("****************************");
			System.out.println();
		
		}
	}

}
