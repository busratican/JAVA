
public class Ucgen implements GeometrikSekil{

	public int yükseklik = 4;
	public int taban = 8;
	public int cevre,alan;
	
	public String message(){
		return "Alan :";
	}
	public int alan(){
		return yükseklik*taban/2;
		
				
	
	}
	
	public int cevre(){
		return 3*taban;
	}
	
}
