

public class Employee {
	private String firstName;
	private double salary;
	private String lastName;
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	

	public String getLastName(){
		return lastName;
	}

	public void setSalary(double salary){
		if(this.salary<0.0){
			System.out.println("Error has occured....Salary is not positive number.\n");
		}
		else{
			this.salary=salary;
			System.out.printf("Salary:%.3f\n", salary);
	
	}
}

	public double getSalary(){
		return salary;
	}
public Employee(String firstName, String lastName, double salary){
	this.firstName=firstName;
	this.lastName=lastName;
	this.salary=salary;
}
	public void yearlySalary(double salary){
		if((salary*12) >0.0){
			System.out.printf("The yearly salary is the employee is %.4f\n", (salary*12));
	}
		else{
			System.out.println("ERROR !! The salary is not a positive number !\n");
		}
		}
	public void DisplayMessage(){
		System.out.printf("Name: %s\nLastName:%s\n", firstName, lastName);
}







}
