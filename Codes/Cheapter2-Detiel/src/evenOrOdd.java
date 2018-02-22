import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args){
		int num1;
		int num2;
		
		
		System.out.println("Please enter two integer:");
		
		Scanner input=new Scanner(System.in);
		num1=input.nextInt();
		num2=input.nextInt();
		
		if(num1 %2 == 0 ){
			System.out.printf("%d is even number\n", num1);
			
		}
		else
			System.out.printf("%d is odd number", num1);
	
	
	

	if(num2 %2 == 0 ){
		System.out.printf("%d is even number", num2);
		
	}
	else 
		System.out.printf("%d is odd number", num2);
}

	
	
	
}
