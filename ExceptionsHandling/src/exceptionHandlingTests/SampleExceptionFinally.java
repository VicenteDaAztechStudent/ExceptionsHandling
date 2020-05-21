package exceptionHandlingTests;

public class SampleExceptionFinally {

	public static void main(String[] args) {
		
		// Only 'try' block
		try {
		int num = Integer.parseInt("Edureka");
		System.out.println(num);
		System.out.println("****************************");
		System.out.println();
		}
		
		// 'finally' block gets executed 
		// Exception still gets thrown
		// Won't disrupt the flow of app
		finally {
			System.out.println("'Finally' block is ALWAYS EXECUTED!! \n"
			+ "Still will throw an exception.. \n"
			+ "Flow will not be disrupted then..");
			System.out.println("****************************");
			System.out.println();
		}
	}
}