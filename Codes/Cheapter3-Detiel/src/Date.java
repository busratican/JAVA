
public class Date {
	public static int month;
	public static int year;
	public static int day;
	
	public Date(int dayP,int monthP, int yearP){
		month=monthP;
		year=yearP;
		day=dayP;
		
	
	}
	
	public static void setMonth(int monthP){
		month=monthP;
		
	}
	public static void setDay(int dayP){
		day=dayP;
		
	}
	public static void setYear(int yearP){
		year=yearP;
		
	}
	
	public int getDay(){
		return day;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
		return month;
	}

	public static void displayDate(){
		System.out.printf("%d/%d/%d", day, month, year);
	}
}
