
public class dikdortgen extends geometrikSekil {

	private double uzunKenar;
	private double kisaKenar;
	
	public void bilgi(double uzunKenar, double kisaKenar){
		isimBelirle("Dikdörtgen Nesnesi");
		this.kisaKenar=kisaKenar;
		this.uzunKenar=uzunKenar;
		
	}
	
	@Override
	
	public double alanHesap(){
		return uzunKenar*kisaKenar;
	}
}
