
public class CommissionEmployee {

	public String firstName;
	public String lastName;
	public String socialNumber;
    public double payAmount;
	
    public CommissionEmployee(String first, String last,
			String number, double pay) {
		
		 first = firstName;
		last = lastName;
		number = socialNumber;
		pay = payAmount;
	}
    
    
    public String getFirstName(){
    	return firstName;
    }
	
    public void setFirstName(String first){
    	first=firstName;
    }
	
  
    
    public String getLastName(){
    	return lastName;
    }
    
    public void setLastName(String last){
    	last=lastName;
    }
    
   
    
    public String getSocialNumber(){
    	return socialNumber;
    }
    
    public void setSocialNumber(String number){
    	number=socialNumber;
    }
    

    public double getPayAmount(){
    	return payAmount;
    }
    
    public void setPayAmount(double pay){
    	if(pay >= 0.0)
    		pay=payAmount;
    	else
    		throw new IllegalArgumentException("Pay amount must be >= 0.0");
    }
    
    
    public String toString(){
    	return String.format("%s: %s\n%s: %s\n%s: %s\n%s: $%,.2f", "Name ", getFirstName(),
    			"Last Name ", getLastName(), "Social Security Number ", getSocialNumber(),"Pay Amount ", getPayAmount());
    }
}
