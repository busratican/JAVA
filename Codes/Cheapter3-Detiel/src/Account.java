import java.util.Scanner;


public class Account {
	private double AccountBalance=2.000;
	public double debitAmount;
	
	
public void Debit(double AccountBalance,double debitAmount){
    if(AccountBalance < debitAmount){
    	
    	System.out.printf("-%.2f\n",(debitAmount-AccountBalance));
    }
    else
   
    	System.out.printf("%.2f",(AccountBalance-debitAmount));
}
/*public void setAccountBalance(double AccountBalance){
	this.AccountBalance=AccountBalance;
}
public double getAccountBalance(){
	return AccountBalance;
}

public void setDebitAmount(double debitAmount){
	this.debitAmount=debitAmount;
}
public double getDebitAmount(){
	return AccountBalance;*/
//}
public void displayMessage(){
	System.out.println("Enter the debit amount:");
	Scanner input=new Scanner(System.in);
	debitAmount=input.nextDouble();
	
	

	Account a = new Account();
	
	System.out.printf("You entered the debit: %.2f\n and your Account Balance is:%.2f\n", debitAmount, AccountBalance);
	a.Debit(AccountBalance, debitAmount);
}
}
