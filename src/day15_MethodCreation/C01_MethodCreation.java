package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Kullan�c�dan ismini ve soyismini isteyin,
		//iki farkl� method olusturun, methodlardan biri  ilk harf buyuk 
		//olacak sekilde girilen kelimeleri birlestirsin.
		//ikinci method isim ve soyisimlerin ilk harflerini buyuk
		//geri kalan harfler *** olacak sekilde degi�tirsin.
		//kullan�c�ya isminin ac�k olarak yaz�lmas� veya gizlenmesi konusundaki tercihini sorun.
		//Program�n geri kalan�nda isim ve soyismi kullan�c�n�n istedigi sekilde yazd�r�n.
		
Scanner scan=new Scanner(System.in);	
System.out.println("Lutfen isminizi giriniz: \nLutfen soy isminizi giriniz: ");
String isim=scan.next();
String soyisim=scan.next();
		
//gizliIsim(isim,soyisim); bunu method call cag�rmak i�in yaz�yoruz

System.out.println("�sminizin ac�k sekilde yaz�lmas�n� istiyorsan�z 1: "
		+ "\nilk harf haric gizli yaz�lmas�n� istiyorsan�z 2 ye bas�n�z");	
int tercih=scan.nextInt();

String birlesmisisim=null;  //isim ve soy isimle ilgili i�lemleri yapt�k 
							//isim ve soyismi ay� ayr� duzenledik onun i�in yeni bir variable olusturuyoruz ve
	//burada null olarak kalacak degeri if else bolumunde atam�st�k.	
	//birle�tirilmi� isimleri kullanarak i�leme devam edecez.

if (tercih==1) {
	birlesmisisim=acikIsim(isim,soyisim);
} else if(tercih==2){
	birlesmisisim=gizliIsim(isim,soyisim);
}
else {System.out.println("Lutfen 1 veya 2 ye bas�n�z");
	
}
System.out.println("Kullan�c�n�n tercihi: "+ birlesmisisim);


scan.close();	
}
			
//bu sat�rdan itibaren kullan�c�n�n isim ve soyismi kullan�c� tercihine g�re kaydedildi.
	

	
				public static String gizliIsim(String isim, String soyisim) {
	
					//isminin ilharfi  buyuk harf yapt�k sonra y�ld�z koyduk
				isim=isim.substring(0, 1).toUpperCase() + isim.replaceAll("\\w", "*");
		
				soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.replaceAll("\\w", "*");
	
				return	isim+" "+soyisim;
					
			
}			
	//burada yazma istemiyor, i�lem yapacak sonuca bakacak sonuc String olacak 
	//void silinir ve String yap�l�r
	
	public static String acikIsim(String isim, String soyisim) {
		//ismin ilk harfini buyuk yapt�k ve diger harfleri kucuk ald�k ayn�s�n� soyisim i�in yapacaz
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
				
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
	
		return isim+" "+soyisim; //bize d�ndurecegi k�s�m. ilk methodda ilk harfleri buyuk diger harfleri kucuk yapt�k
			

	


}	
}	
