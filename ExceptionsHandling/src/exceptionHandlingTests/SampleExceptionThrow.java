package exceptionHandlingTests;

public class SampleExceptionThrow {
	
	static void avg() {
		// Throwing an 'ArithmeticException'
		try {
			throw new ArithmeticException("Demo");
		}
		
		//Handle 'ArithmeticException' with 'catch'block
		catch(ArithmeticException e) {
		System.out.println("ArithmeticExpression caught.. ");
		}
	}

// Call function in 'main' method
public static void main(String args[]) {
	avg();
	}
}