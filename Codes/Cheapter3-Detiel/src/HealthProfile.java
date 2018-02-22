
public class HealthProfile {
	private String firstName;
	private String lastName;
	private int age;
	private double BMI;
	private double weight;
	private double height;
	
	
	public HealthProfile(String firstName, String lastName, int age, double weight, double height){
		this.firstName=firstName;
		this.lastName=lastName;
		this.weight=weight;
		this.age=age;
		this.height=height;
	
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getBMI() {
		return BMI;
	}


	public void setBMI(double bMI) {
		BMI = bMI;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	public void calculateBMI(){
	BMI=(weight*height)/2;
	System.out.printf("The BMI: %.2f\n", BMI);
}
	
	public void displayMessage(){
		System.out.printf("Name: %s\nLastname:%s\nAge:%d\nWeight:%.2f\nHeight:%.2f\n\n", firstName, lastName, age, weight, height);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
