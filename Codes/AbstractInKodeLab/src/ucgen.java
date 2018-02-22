
public class ucgen extends geometrikSekil {
	
	private double yukseklik;
	private double taban;
	
	public void bilgi(double yukseklik, double taban){
		isimBelirle("Üçgen Nesnesi");
		this.yukseklik=yukseklik;
		this.taban=taban;
	}

	@Override
	
	public double alanHesap(){
		return (taban*yukseklik)/2;
	}
}
