
public class satisElemani implements calisan {
	
	double ucretSabiti;
	double komisyon;
	
	final double komisyonOran=0.3;
	
	@Override
	
	public double ucret(){
		return ((ucretSabiti*oran)+komisyon);
	}

	@Override
	
	public void calisanBolumu(){
		System.out.println("Sat�� Eleman�");
	}
	
	@Override
	
	public void ucretBelirle(double ucretSabiti){
		this.ucretSabiti=ucretSabiti;
	}
	
	public void satisKomisyonBelirle(int adet){
		komisyon=adet*komisyonOran;
	}
}
