
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("Ali", "Karlý", -1.500);
		Employee e2 = new Employee("Aslan", "Aslangil", 2.500);
		
		e1.DisplayMessage();
		e1.setSalary(e1.getSalary());
		   e1.yearlySalary(e1.getSalary());
		
		e2.DisplayMessage();
		e2.setSalary(e2.getSalary());
	     e2.yearlySalary(e2.getSalary());

	}

}
