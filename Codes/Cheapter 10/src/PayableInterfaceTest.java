
public class PayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payable[] payableObjects= new Payable[4];
		
		payableObjects[0]= new Invoice("01234", "seat",2,375.00);
		payableObjects[1]= new Invoice("56789", "tire",4,95.00);
		payableObjects[2]= new SalariedEmployee1("John", "Smith", "111-11-1111", 800.00);
		payableObjects[3]= new SalariedEmployee1("Lisa", "Smith", "112-31-1111", 1500.00);
		
		System.out.println("Invoices and Employees processed polymorphically:\n");
		
		for(Payable currentPayable : payableObjects){
			System.out.printf("%s \n%s:  %.2f\n\n", currentPayable.toString(),
					"Payment due ", currentPayable.getPaymentAmount());
		}
	}

}
