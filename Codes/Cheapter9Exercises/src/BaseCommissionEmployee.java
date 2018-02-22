
public class BaseCommissionEmployee extends CommissionEmployee{

	public double commission;

	public BaseCommissionEmployee(String first, String last, String number,
			double pay, double commission) {
		super(first, last, number, pay);
		setCommission(commission);
		// TODO Auto-generated constructor stub
	}
	
	
	public double getCommission(){
		return commission;
	}
	
	
	public void setCommission(double commission){
		if(commission >= 0.0){
			this.commission=commission;
		}
		else
			throw new IllegalArgumentException("Commission must be >= 0.0");
	}
	
	
	
	public double DefineSalary(double commission){
		return getCommission()+getPayAmount();
	}
	
	@Override
	public String toString(){
		return String.format("%s\n%s: $%,.2f\n%s:", super.toString(), "Commission ", getCommission(),
				"Salary ");
	}
}
