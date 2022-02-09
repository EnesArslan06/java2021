package day21_scopVeArrays;

public class C04_Arrays {

	public static void main(String[] args) {
		//// soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun bunu yazdýrýn

		String array[]=new String[4];
		array[0]="Ali";
		array[1]="Veli";
		array[2]="Ayse";
		array[3]="Fatma";
		
		@SuppressWarnings("unused")
		String array2[]={"Ali","Veli","Ayse","Fatma"}; //bu sekildede digger yazýmýdýr daha koaldýr
		
		//soru 2: Soru 1 deki ali yerine Can Ayse yeriine Gul atayýn
		
		array[0]="Can"; //burada atama yaptýk 
		array[2]="Gul";
		
		System.out.println(array[1]); //burada veliye yazdýrdý.
		//son elementi yazdýralým
		System.out.println(array[array.length-1]);//Stringdeli length() idi burada sadece length....
		//System.out.println(array[array.length]);//burada yazdýgýn index sýnýrlarýn dýsýnda uyarýsý verir.
		
		
		
		
		
		
	}

}
