
public class PayrollSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalariedEmployee salariedEmployee= new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		
		HourlyEmployee hourlyEmployee= new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		
		CommissionEmployee commissionEmployee= new CommissionEmployee("Sue", "Jones", "33-333-3333", 10000, .06);
		
		BaseCommissionEmployee basePlusCommissionEmployee= new BaseCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
		
		
		System.out.println("Employees processed individually ");
		
		System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
		
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());
		
		System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
		
		
		Employee[] employee = new Employee[4];
		
		employee[0]=salariedEmployee;
		employee[1]=hourlyEmployee;
		employee[2]=commissionEmployee;
		employee[3]=basePlusCommissionEmployee;
		
		
		for(Employee currentEmployee : employee){
			System.out.println(currentEmployee);
			
			if(currentEmployee instanceof BaseCommissionEmployee){
				BaseCommissionEmployee employees = (BaseCommissionEmployee) currentEmployee;
				
				employees.setBaseSalary(1.10*employees.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employees.getBaseSalary());
				System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
			}
			
			for(int j =0; j<employee.length; j++){
				System.out.printf("Employee %d is a %s\n", j, employee[j].getClass().getName());
			}
		}
	}
	


}
