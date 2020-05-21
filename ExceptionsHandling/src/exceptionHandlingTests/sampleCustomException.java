package exceptionHandlingTests;

import java.util.Scanner;
class sampleCustomException {
	
	static void  validateInput(int number) throws InvalidInputException{
		
		// Declaring if integer is greater than 100 
		// To throw an exception 'InvalidInputException' 
		// Which we will create further below
		if(number > 100) {
			throw new InvalidInputException("Exception");
		}
		System.out.printf("Valid input..\n"
				+ "Thank You for participating and play again later!");
		System.out.println("************************************");
		System.out.println();
		System. exit(0); //exit program 
		
	
	}//validateInput

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Creating Scanner for user input 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number less than 100.. ");
		System.out.println("************************************");
		System.out.println();
		
		
		// This variable stores user integer input 
		int number = scanner.nextInt();
		System.out.println("************************************");
		System.out.println();
		
		// 'try' block validates integer input
		try {
			validateInput(number);
			
		}
		
		// 'catch' block catches and handles
		// The exception if thrown
		catch (InvalidInputException e) {
			System.out.println("Caught Exception.. \n"
					+ "Thank You for participating and play again later!");
			System.out.println("************************************");
			System.out.println();
			System. exit(0); //exit program 
		}
	}
	
}

// Here we create exception 'InvalidInputException'  
// And extends to super class 'Exception'
class InvalidInputException extends Exception{
	
	/**
	 SerialVersionUID is used to ensure that during 
	 Deserialization the same class 
	 (that was used during serialize process) is loaded. ... 
	 */
	
	private static final long serialVersionUID = 1L;

	InvalidInputException(String exceptionText){
		super(exceptionText);
	}
}