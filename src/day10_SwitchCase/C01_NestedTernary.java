package day10_SwitchCase;



public class C01_NestedTernary {

	public static void main(String[] args) {
		// içiçe demek nested if gibi, "emekli sorusu cözülevilir mi?
	
	//Eger calýsan kadýnsa 60 yasýndan buyuk oldugunda emekli olabilir,
	// calýsan erkekse 65 yasýndan buyukse emeklý olabilir.
		/* her seferinde scanner olusturmak yerine test datalarýmýzývariable olarak plusturabilriz
		 * ve kod yazýmý bittiginde bu test datalarýný degiþtirerek kodlarýmýzý gireriz.
		 * syso ve scanner olusturmamak için bu sekilde yapabiliriz.
		 */
	
	char cinsiyet='K';	
	int yas=57;
	String sonuc=cinsiyet=='K' ?   (yas>=60 ? "Emekli Olabilirsin" : "Emekli olamazsýn") :
										(yas>=65 ? "Emekli Olabilirsin" : "Emekli olamazsýn");
	System.out.println(sonuc);
	}

}
