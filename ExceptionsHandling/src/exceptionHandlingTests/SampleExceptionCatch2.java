package exceptionHandlingTests;

public class SampleExceptionCatch {

	public static void main(String[] args) {
			
			// Only 'try' block
			try {
			int num = Integer.parseInt("Edureka");
			System.out.println(num);
			System.out.println("****************************");
			System.out.println();
		}
		
		// Main 'catch' block handles NumberFormatException
		catch(NumberFormatException e) {
			System.out.println("Handling Main 'catch' block.. \n"
					+ "Can't take a String as a int.. NumberFormatException handled..");
			System.out.println("****************************");
			System.out.println();
		
		}
			
			// Only nested 'catch' block throws no exception
			// Which means it will be skipped/not display nothing
		
			catch (Exception e) {
				System.out.println("Handling only nested 'catch' block..");
				System.out.println("****************************");
				System.out.println();
			}
		
		System.out.println("Other Statement.. \n"
				+ "Skipped only Nested 'catch' block cause no other exception being \n"
				+ "thrown inside.. ");
		System.out.println("****************************");
		System.out.println();
		
	}
}


