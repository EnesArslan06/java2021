package day21_scopVeArrays;

public class C04_Arrays {

	public static void main(String[] args) {
		//// soru 1-Elemanlari �Ali� , Veli�, Ayse� ve Fatma� olan bir array olusturun bunu yazd�r�n

		String array[]=new String[4];
		array[0]="Ali";
		array[1]="Veli";
		array[2]="Ayse";
		array[3]="Fatma";
		
		@SuppressWarnings("unused")
		String array2[]={"Ali","Veli","Ayse","Fatma"}; //bu sekildede digger yaz�m�d�r daha koald�r
		
		//soru 2: Soru 1 deki ali yerine Can Ayse yeriine Gul atay�n
		
		array[0]="Can"; //burada atama yapt�k 
		array[2]="Gul";
		
		System.out.println(array[1]); //burada veliye yazd�rd�.
		//son elementi yazd�ral�m
		System.out.println(array[array.length-1]);//Stringdeli length() idi burada sadece length....
		//System.out.println(array[array.length]);//burada yazd�g�n index s�n�rlar�n d�s�nda uyar�s� verir.
		
		
		
		
		
		
	}

}
