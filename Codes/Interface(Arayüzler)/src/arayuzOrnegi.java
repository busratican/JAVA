
public class arayuzOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isci ucretCalisan = new isci();
		
		ucretCalisan.calisanBolumu();
		ucretCalisan.ucretBelirle(865.70);

		
		System.out.println("Maa�� : "+ucretCalisan.ucret());
		
		
	mudur y�netici = new mudur();
		
		y�netici.calisanBolumu();
		y�netici.ucretBelirle(5519.71);

		
		System.out.println("Maa�� : "+y�netici.ucret());
	
		
		satisElemani pazarlama = new satisElemani();
		
		pazarlama.calisanBolumu();
		pazarlama.ucretBelirle(978.75);
		pazarlama.satisKomisyonBelirle(250);
		

		System.out.println("Komisyon : "+pazarlama.komisyon);

		System.out.println("Maa�� : "+pazarlama.ucret());
	
	}

}
