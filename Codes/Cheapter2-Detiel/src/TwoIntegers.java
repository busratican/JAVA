import java.util.Scanner;


public class TwoIntegers {
	
	public static void main(String[] args){
		
		
		int num1;
		int num2;
		int num3;
		int bigger = 0;
		
		System.out.println("Please enter three integers:");
		
		Scanner input=new Scanner(System.in);
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		System.out.printf("The sum is %d\n", (num1+num2+num3));
		System.out.printf("The average is %d\n", ((num1+num2+num3)/3));
		System.out.printf("The product is %d\n", (num1*num2*num3));
		
		if(num1 == num2){
			
		}
		
		if(num1 < num2){
			
			bigger=num2;
		}
		
		
		if(num1 > num2){
			
			bigger=num1;
		}
		
		if(bigger<num3){
			System.out.printf("The bigger number is %d\n", num3);
		}
		
		
		if(bigger>num3){
			System.out.printf("The bigger number is %d\n", bigger);
		}
		
		
	}

}
