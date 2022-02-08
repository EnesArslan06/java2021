package day10_SwitchCase;

public class C07_StringManipulationConCat {

	public static void main(String[] args) {
		// turkcesi String ile oynama anlamýna gelir, her zaman karsýmýza cýkacaktýr.
		//Sadece String olarak verilen metinle kullanýlýr ve String olarak belirtilen
		//verileri degistirmeye uzerinde oynamaya yarar.
/*String olarak verilen bir degisken + ile baska bir iþleme sokulursa java bunlarý yanyana ekler
1- "Ali" + "Can" bunu AliCan olarak yazdýrýr. buna concatenation denir.		
		*/
	String isim="Ali";
	String Soyisim="Can";
	System.out.println(isim + " " + Soyisim);//Ali Can yazdýrýr. Bunu birlestirmek istersek concat ile yapabiliriz
	isim.concat(Soyisim); //bunu syso içine yaparsak birlestirir.
	System.out.println(isim.concat(Soyisim));  // isim yanýna gelip . koyarsak concat cýkacak
	System.out.println(isim.concat("  ").concat(Soyisim)); //burada iki bosluk býrakacak //Ali  Can yazdýrýr.
	
	
	}

}
