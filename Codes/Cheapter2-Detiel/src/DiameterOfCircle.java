import java.util.Scanner;
public class DiameterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 double r;//radius of circle
                 double pi=3.14159;
                double sum;
                double diameter;
                double circumference;
                
                System.out.println("Please enter the radius of circle:");
                
                Scanner input=new Scanner(System.in);
                r=input.nextDouble();
                
                sum=(pi)*(r)*(r);
                diameter=2*r;
                circumference=2*pi*r;
                
                System.out.printf("The area is %.2f\n", sum);
                System.out.printf("The diameter is %.2f\n", diameter);
                System.out.printf("The circumference is %.2f\n", circumference);
                
                 
	}

}
