
public class Bilimkurgu implements Kitap {
	
	public String yazar = "Orhan Pamuk";
	public int fiyat = 40;
	public String t�r = "Bilimkurgu";
	
	public void yazd�r(){
		System.out.printf("Yazar: %s\nFiyat: %d\nT�r: %s\n\n", yazar, fiyat, t�r);
	}

}
