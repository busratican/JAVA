
public class daire extends geometrikSekil
{
	private double yaricap;
	private double pi=Math.PI;
	
	public void bilgi(double yaricap){
		isimBelirle("Daire nesnesi");
		this.yaricap=yaricap;
	}
	
	@Override
	public double alanHesap(){
		return pi*yaricap*yaricap;
	}

}
