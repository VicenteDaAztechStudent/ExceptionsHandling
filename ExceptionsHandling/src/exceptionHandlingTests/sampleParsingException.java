package exceptionHandlingTests;

import java.util.*;
import java.text.SimpleDateFormat;


public class sampleParsingException {
	
	// Convert date
	static void convertDateFormat(String inputDate) {
		try {
			// Declaring date format in 'sdf' 
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			
			// Parse date/data we enter
			Date date = sdf.parse(inputDate);
			
			// Changes format after receiving valid input
			SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy-mm-dd");
			
			// Prints out new Changed format
			String outputDate = outputsdf.format(date);
			System.out.println("After changing date format to yyyy-mm-dd : " + outputDate );
		
		// Throws and handles exception 'java.text.ParseException' 
		// If format input is not valid
		}catch(java.text.ParseException e) {
			System.out.println("Some error occured while converting date formats \n"
					+ "Exception is : " + e );
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy format: ");
		String inputDate = scanner.nextLine();
		convertDateFormat(inputDate);
	}

}
