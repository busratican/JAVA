package phonebook;

public class Contact {

	private String name;
	private String telNo;
	
	public Contact(String name, String telNo){
		this.name=name;
		this.telNo=telNo;
	}
	
	public Contact(String name){
		this.name=name;
	}
	
	@Override
	public String toString(){
		return name+""+telNo;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setTelNo(String telNo){
		this.telNo=telNo;
	}
	
	public String getTelNo(){
		return telNo;
	}
}


