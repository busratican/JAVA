
public class isci implements calisan {

	double ucretSabiti;
	
	@Override
	
	public double ucret(){
		return ucretSabiti*oran;
	}
	
	@Override
	
	public void calisanBolumu(){
	    System.out.println("Ucretli calisanlar ");
}
	
	@Override
	
	public void ucretBelirle(double ucretSabiti){
		this.ucretSabiti=ucretSabiti;
		
	}
}