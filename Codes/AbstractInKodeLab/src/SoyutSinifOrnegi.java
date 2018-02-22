
public class SoyutSinifOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ucgen ucgen=new ucgen();
		dikdortgen dikdortgen=new dikdortgen();
		daire daire = new daire();
		
		daire.bilgi(2.0);
		ucgen.bilgi(5.0, 3.0);
		dikdortgen.bilgi(2.0, 3.0);
		
		System.out.println(daire.isimGetir()+":");
		System.out.println(daire.alanHesap());
		
		System.out.println(ucgen.isimGetir()+":");
		System.out.println(ucgen.alanHesap());
		
		
		System.out.println(dikdortgen.isimGetir()+":");
		System.out.println(dikdortgen.alanHesap());
		
	}

}
