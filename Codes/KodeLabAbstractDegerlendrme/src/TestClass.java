
public class TestClass {

	public static void main(String[] args){
		
		Basketbol basketbol=new Basketbol("Isýl Alben", 12000, "Galatasaray", "World Cup" );
		
		Futbol futbolcu = new Futbol("Cristiano Ronaldo", 2400000, "Real Madrid", "World Cup FIFA");
		
		basketbol.BilgiAl();
		
		System.out.println(basketbol.toString());
		
		
		futbolcu.BilgiAl();
		
		System.out.println(futbolcu.toString());
	}
}
