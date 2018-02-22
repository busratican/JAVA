package Müzisyen;

public class TestClasss {

	public static void main(String[] args){
	
	Film film = new Film("Saw", 1999, "Sinema", 20000);
  
	
	 Müzik müzik=new Müzik("Bethoveen", 1942, "Müzik", 50000);
   
   
	 film.MedyaBaslýk();
	 film.satýsAdedi();
	 film.Yýl();
	 
	 System.out.println(film.toString());
	 
	 müzik.MedyaBaslýk();
	 müzik.satýsAdedi();
	 müzik.Yýl();
	 
	 
	 System.out.println(müzik.toString());
	 
	 
   
}
}