
public class UsingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			throwException();
		}
		
		catch(Exception exception){
			System.err.println("Exception handled in main ");
		}
		
		doesNotThrowException();
	}
	
	public static void throwException() throws Exception{
		try{
			System.out.println("Method throw Exception.\n");
			throw new Exception();
		}
		catch(Exception exception){
			System.err.println("Exception handled in method throwException");
		}
		
		finally{
			System.err.println("Finally executed in throwException");
		}
	}
public static void doesNotThrowException(){

	try{
		System.out.println("Method doesNotThrowException");
	}
	
	catch(Exception exception){
		System.err.println(exception);
	}
	
	finally{
		System.err.println("Finally executed in doesNotThrowException");
	}
	System.out.println("End of metod doestNotException");
  }
}