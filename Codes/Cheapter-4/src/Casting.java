
public class Casting {
	
	private int num1=3;
    private int num2=2;
    private int sum;
    
	public void setNum1(int num1){
		this.num1=num1;
	}
	
	public int getNum1(){
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public String getSum() {
		return "num1+num2:  "+sum;
	}

	public void setSum(int sum) {
		sum=num1+num2;
		this.sum = sum;
	}
	
	public void SumOfIntegers(int num1, int num2, int sum){
		this.num1=num1;
		this.num2=num2;
		this.sum=sum;
		
	}
	
	
	

}
