package day10_SwitchCase;



public class C01_NestedTernary {

	public static void main(String[] args) {
		// i�i�e demek nested if gibi, "emekli sorusu c�z�levilir mi?
	
	//Eger cal�san kad�nsa 60 yas�ndan buyuk oldugunda emekli olabilir,
	// cal�san erkekse 65 yas�ndan buyukse emekl� olabilir.
		/* her seferinde scanner olusturmak yerine test datalar�m�z�variable olarak plusturabilriz
		 * ve kod yaz�m� bittiginde bu test datalar�n� degi�tirerek kodlar�m�z� gireriz.
		 * syso ve scanner olusturmamak i�in bu sekilde yapabiliriz.
		 */
	
	char cinsiyet='K';	
	int yas=57;
	String sonuc=cinsiyet=='K' ?   (yas>=60 ? "Emekli Olabilirsin" : "Emekli olamazs�n") :
										(yas>=65 ? "Emekli Olabilirsin" : "Emekli olamazs�n");
	System.out.println(sonuc);
	}

}
