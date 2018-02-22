import java.util.Scanner;
public class StudentGrade {
	
	int StudentGrade;
   int studentGrade=0;
	double average;
	int total=0;

	
	
	
	Scanner input= new Scanner(System.in);
	public void GetAverage(){
		
		System.out.print("Please enter the grades or press -1 for quit or press 0 for continuing:");
		StudentGrade=input.nextInt();
	if(StudentGrade == -1){	
		System.out.println("Good bye");
	}
	else{
			while(studentGrade <= 10){
				System.out.println("Enter the grade:");
			StudentGrade=input.nextInt();
			studentGrade++;
		total=total+StudentGrade;
			
			}
			average=(double)total/10;
			System.out.printf("\nTotal of all 10 grades is %d\n", total);
			System.out.printf("Class average is %.2f\n", average);
			
		}

	
	}
}
