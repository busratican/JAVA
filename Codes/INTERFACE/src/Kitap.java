
public interface Kitap {

	
	public interface Tür extends Kitap{
		public void yazdýr();
	}
	
	public interface Yazar extends Kitap{
		public void yazdýr();
	}
	
	public interface Fiyat extends Kitap{
		public void yazdýr();
	}
	
	
	
}
