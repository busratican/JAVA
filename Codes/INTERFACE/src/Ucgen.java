
public class Ucgen implements GeometrikSekil{

	public int y�kseklik = 4;
	public int taban = 8;
	public int cevre,alan;
	
	public String message(){
		return "Alan :";
	}
	public int alan(){
		return y�kseklik*taban/2;
		
				
	
	}
	
	public int cevre(){
		return 3*taban;
	}
	
}
