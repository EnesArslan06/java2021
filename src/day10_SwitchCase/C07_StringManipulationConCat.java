package day10_SwitchCase;

public class C07_StringManipulationConCat {

	public static void main(String[] args) {
		// turkcesi String ile oynama anlam�na gelir, her zaman kars�m�za c�kacakt�r.
		//Sadece String olarak verilen metinle kullan�l�r ve String olarak belirtilen
		//verileri degistirmeye uzerinde oynamaya yarar.
/*String olarak verilen bir degisken + ile baska bir i�leme sokulursa java bunlar� yanyana ekler
1- "Ali" + "Can" bunu AliCan olarak yazd�r�r. buna concatenation denir.		
		*/
	String isim="Ali";
	String Soyisim="Can";
	System.out.println(isim + " " + Soyisim);//Ali Can yazd�r�r. Bunu birlestirmek istersek concat ile yapabiliriz
	isim.concat(Soyisim); //bunu syso i�ine yaparsak birlestirir.
	System.out.println(isim.concat(Soyisim));  // isim yan�na gelip . koyarsak concat c�kacak
	System.out.println(isim.concat("  ").concat(Soyisim)); //burada iki bosluk b�rakacak //Ali  Can yazd�r�r.
	
	
	}

}
