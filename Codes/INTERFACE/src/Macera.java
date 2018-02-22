
public class Macera implements Kitap {

	public String yazar = "Namýk Kemal";
	public int fiyat = 40;
	public String tür = "Macera";
	
	public void yazdýr(){
		System.out.printf("Yazar: %s\nFiyat: %d\nTür: %s\n\n", yazar, fiyat, tür);
	}
}
