package exceptionHandlingTests;

class SampleExceptionThrows {
	
	// USe 'throws' keyword with method
	static void avg() throws ArithmeticException{
		System.out.println("Inside avg function..\n");
		
		// USing 'throw'keyword to throw 'ArithmeticException'
		throw new ArithmeticException("Demo\n");
		
	}
	
	public static void main(String args[]) {
		
		// It will throw an exception when calling 'avg()' method
		// From 'try' block
		// Will not be handling exception
		try {
			avg();
		}
		
		// Say there's an exception in main method called 'Demo'
		// Since not handling exception, SOP will show 'finally' block
		finally {
			System.out.println("Caught.."
				+ "Thank You for participating and play again later!");
			System.out.println("************************************");
			System.out.println();
			System.exit(0); //exit program 
		}
	}
}
