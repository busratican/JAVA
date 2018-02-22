
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	CommissionEmployee employee=new CommissionEmployee("Paul", "Jobs", "11-123-55", 1200);
		BaseCommissionEmployee employee1 =new BaseCommissionEmployee("Paul", "Jobs", "11-123-55", 1200, .89);
		
		employee1.DefineSalary(.89);
		
		//System.out.println(employee.toString());
		System.out.println(employee1.toString());
		
		
	}

}
