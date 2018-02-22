import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int select;
System.out.println("Please press for...");
System.out.printf("1-Health Records:\n 2-BMI:\n");
System.out.println("*************************************************");
Scanner input=new Scanner(System.in);

select=input.nextInt();

HealthProfile profile1= new HealthProfile("Ali", "Salim", 22, 1.90, 45.2);
HealthProfile profile2= new HealthProfile("Ayse", "Adýgüzel", 48, 1.60, 75.0);
HealthProfile profile3= new HealthProfile("Selami", "Sahin", 55, 1.72, 99.9);
HealthProfile profile4= new HealthProfile("Behçet", "Necatigil", 35, 1.80, 72.0);


		if(select== 1){
			profile1.displayMessage();
			profile2.displayMessage();
			profile3.displayMessage();
			profile4.displayMessage();
		}
		
		else if(select == 2){
			profile1.calculateBMI();
			profile2.calculateBMI();
			profile3.calculateBMI();
			profile4.calculateBMI();
		}
	}

}
