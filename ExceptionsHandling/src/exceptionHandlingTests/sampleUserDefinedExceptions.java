package exceptionHandlingTests;


	/**
	 * @author vicente.cruz
	 *
	 */
	class sampleUserDefinedExceptions {
		
		public static void main(String args[] ){
			// 'try' block 'throws' user-defined exception
			try {
				
				// 'throw' keyword creates new exception 
				// throws it to the 'catch' block
				throw new MyException(5); 
			} 
			
			// 'catch' block catches and handles user-defined exception 
			// also prints the exception that is caught
			catch(Exception e) {
				System.out.println(e); 
			}
			
		}

}


	class MyException extends Exception{
		
		/**
		 SerialVersionUID is used to ensure that during 
		 Deserialization the same class 
		 (that was used during serialize process) is loaded. ... 
		 */
		
		private static final long serialVersionUID = 1L;
		int a;
		MyException(int b){
			a=b;
		}
		public String toString() {
			return("Exception number = " + a);
		}
	}