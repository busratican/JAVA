import java.util.Scanner;

public class SeparatingtheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int dig5;
		int dig4;
		int dig3;
		int dig2;
		int dig1;
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		
		System.out.println("Please enter the 5-digit number:");
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		
		
		dig5=number % 10000;
		dig4=dig5 % 1000;
		dig3=dig4 % 100;
		dig2=dig3 % 10;
		dig1=dig2 % 1;
		
		num5=dig5/1000;
		num4=dig4/100;
		num3=dig3/10;
		num2=dig2;
		num1=number/10000;
		System.out.printf("Sepated number and the result is \n");
		System.out.printf("%d\t%d\t%d\t%d\t%d",num1, num5, num4, num3, num2);

	}

}
