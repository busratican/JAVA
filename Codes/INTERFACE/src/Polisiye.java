
public class Polisiye implements Kitap {

	public String yazar = "Oscar Wilde";
	public int fiyat = 40;
	public String tür = "Polisiye";
	
	public void yazdýr(){
		System.out.printf("Yazar: %s\nFiyat: %d\nTür: %s\n\n", yazar, fiyat, tür);
	}
}
