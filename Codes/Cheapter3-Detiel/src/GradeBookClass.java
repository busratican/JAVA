
public class GradeBookClass {
	private String insName;
	private String courseName;
	
	public GradeBookClass(String courseName, String insName){
		this.courseName=courseName;
		this.insName=insName;
	}
public void setİnsName(String insName){
	this.insName=insName;
}
public String getİnsName(){
	return insName;
}
public void setCourseName(String courseName){
	this.courseName=courseName;
}
public String getCourseName(){
	return courseName;
}
public void displayMessage(){
	System.out.printf("Constructor's name: %s and Course name: %s", insName, courseName);
}

}
