package soyutsýnýflar;

 abstract class Soyutsinif {

	abstract public void goster();
	
	public Soyutsinif(){
		System.out.println("Burasý soyut sýnýf yapýcýsý");
	}
	
	public void metod(){
		System.out.println("Soyut sýnýfa ait normal method");
	}
	public static void metod2(){
		System.out.println("Soyut sýnýfa ait static normal method");
	}
 }	
	class altSinif extends Soyutsinif{
	
		public void goster(){
			System.out.println("Burasý alt sýnýf");
		}
	}	
		class altSinif2 extends Soyutsinif{
			public void goster(){
				System.out.println("Burasý alt sýnýf 2");
			}
				
		}			
		

/*		public class Baslat {

	public static void main(String[] args){
			altSinif a1 = new altSinif();
				altSinif2 a2= new altSinif2();
				
				a1.goster();
					a2.goster();
					
					  Soyutsinif s1[] = new Soyutsinif[1];
					
					s1[0]=a1;
					 s1[0].metod();
					   Soyutsinif.metod2();
				}
			}
		
	*/

