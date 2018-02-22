
public class arayuzOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isci ucretCalisan = new isci();
		
		ucretCalisan.calisanBolumu();
		ucretCalisan.ucretBelirle(865.70);

		
		System.out.println("Maaþý : "+ucretCalisan.ucret());
		
		
	mudur yönetici = new mudur();
		
		yönetici.calisanBolumu();
		yönetici.ucretBelirle(5519.71);

		
		System.out.println("Maaþý : "+yönetici.ucret());
	
		
		satisElemani pazarlama = new satisElemani();
		
		pazarlama.calisanBolumu();
		pazarlama.ucretBelirle(978.75);
		pazarlama.satisKomisyonBelirle(250);
		

		System.out.println("Komisyon : "+pazarlama.komisyon);

		System.out.println("Maaþý : "+pazarlama.ucret());
	
	}

}
