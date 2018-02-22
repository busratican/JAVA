import java.util.Scanner;

public class GradeBook {
   private int total;
   private int gradeCounter;
   private int aCount;
   private int bCount;
   private int cCount;
   private int dCount;
   private int fCount;
   
   public void inputGrades(){
   Scanner inputgrade=new Scanner(System.in);
   
   int grade;
   
   System.out.printf("%s\n%s\n   %s\n   %s\n",
		   "Enter the integer grades int the range 0-100:",
		   "Type the end-of-file indicator to determinate input:",
		   "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
		   "On Windows type <Ctrl> z then Enter");
   
   while(inputgrade.hasNext())
   {
	   grade=inputgrade.nextInt();
	   total += grade;
	   ++gradeCounter;
	   
   incrementLetterGradeCounter(grade);
   }
   }
private void incrementLetterGradeCounter(int grade)
{
	switch(grade/10)
	{
	case 9:
	case 10:
	++aCount;
	break;
	
	
	case 8:
		++bCount;
		break;
		
	case 7:
		++cCount;
		break;
		
	case 6:
		++dCount;
		break;
		
		default:
			++fCount;
			break;
	}
}
		public void displayGradeReport()
		{
			System.out.println("\nGrade Report:");
			
			if(gradeCounter != 0){
				double average=(double)total/gradeCounter;
				
				System.out.printf("Total of the %d grades enteres is %d\n",gradeCounter, total);
				System.out.printf("Class average is %.2f\n", average); 
				
				System.out.printf("%s \n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
						"Number of students who received each grade",
						"A", aCount,
						"B", bCount,
						"C", cCount,
						"D", dCount,
						"F", fCount);
	}
			else{
				System.out.println("No grades was entered !");
			}
}
}