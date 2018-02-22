import java.util.Scanner;

public class MaximumFinder {
	
	int number1;
	int number2;
	int number3;
	int result;
	int endResult;
	
	
	Scanner inputn= new Scanner(System.in);
	
	public void MaxmimumFinder(){
		
		System.out.println("Please enter three number: ");
		number1=inputn.nextInt();
		number2=inputn.nextInt();
		number3=inputn.nextInt();
		
		result=Math.max(number1, number2);
		endResult=Math.max(result, number3);
		
		System.out.printf("The maximum number is %d", endResult);
		
		
	}

}
