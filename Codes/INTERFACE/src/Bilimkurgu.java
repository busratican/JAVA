
public class Bilimkurgu implements Kitap {
	
	public String yazar = "Orhan Pamuk";
	public int fiyat = 40;
	public String tür = "Bilimkurgu";
	
	public void yazdýr(){
		System.out.printf("Yazar: %s\nFiyat: %d\nTür: %s\n\n", yazar, fiyat, tür);
	}

}
