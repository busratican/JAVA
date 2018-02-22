import java.util.Scanner;

public class Student {

	int failures;
     int passes;
      int studentCounter;
       int grade;
         
           Scanner inputs=new Scanner(System.in);
           
          public void countStudentGrades(){
        	  while(studentCounter <= 10){
        		  System.out.printf("Please press 1 for passes and 0 for failures:");
        		  grade=inputs.nextInt();
        		  System.out.println();
        		  
        	
        		  studentCounter++;
        		  
        	  if(grade == 1){
        		  passes++;
        	  }
        	  
        	  else if(grade== 0){
        		failures++;
        	  }
        	  }
        	  if(passes == 8){
          		System.out.println("Conguralitons!! You have a bonus !");
          	  }
         
        	  
        	  System.out.printf(" .....%d student failes and %d student passes......", failures, passes);
        	  }
        	
          
        	  

        	
}
