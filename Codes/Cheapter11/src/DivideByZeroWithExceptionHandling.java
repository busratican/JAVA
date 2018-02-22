import java.util.InputMismatchException;
import java.util.Scanner;


public class DivideByZeroWithExceptionHandling {

	public static int quotient(int numerator, int dominator) throws ArithmeticException{
		return numerator/dominator;
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		
		do{
			try{
				System.out.print("Please enter an integer numerator: " );
				int numerator = scanner.nextInt();
				
				System.out.print("Please enter an integer dominator: " );
				int dominator = scanner.nextInt();
				
				int result=quotient(numerator, dominator);
				System.out.printf("\nResult: %d / %d = %d\n", numerator, dominator, result);
				continueLoop= false;
			}
			
			catch(InputMismatchException inputMismatchException){
				System.err.printf("\n Exception: %s\n", inputMismatchException);
				scanner.nextLine();
				System.out.println("You must enter integers. Please try again..\n ");
			}
			
			catch(ArithmeticException arithmeticException){
				System.err.printf("\n Exception : %s\n", arithmeticException);
				System.out.println("Zero is an invalid dominator.Please try again.\n");
			}
		}			
			while(continueLoop);
			
	}	
}	

