package M�zisyen;

public class TestClasss {

	public static void main(String[] args){
	
	Film film = new Film("Saw", 1999, "Sinema", 20000);
  
	
	 M�zik m�zik=new M�zik("Bethoveen", 1942, "M�zik", 50000);
   
   
	 film.MedyaBasl�k();
	 film.sat�sAdedi();
	 film.Y�l();
	 
	 System.out.println(film.toString());
	 
	 m�zik.MedyaBasl�k();
	 m�zik.sat�sAdedi();
	 m�zik.Y�l();
	 
	 
	 System.out.println(m�zik.toString());
	 
	 
   
}
}