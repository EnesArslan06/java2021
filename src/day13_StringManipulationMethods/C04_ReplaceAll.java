package day13_StringManipulationMethods;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		//System.out.println(str.replaceAll(str, "enes")); //replace all butun harfleri degistirir. 
		//yani atad�g�m�z str yi komple yenisi ile degi�tirir.butun harf ve say�lar� butun harf olmayan say�lar� vs kullan�l�r
		//mesela butun harfleri butuun say�lar� degi�tir.
		//replace de char kullan�lmaz.. \\ yazarsak 

		String str= "*Java 98ogrenmek c..ok k876olay";
		//bunu replaceall kullanarak Java Ogrenmek Cok Kolay" a getirelim.
		
		
		str=str.replaceAll("\\d", ""); //burada \\ ters slach koyarak digitleri yan� say�lar� hiclik ile degistirerek
										//atama yaparak rakamlar�n tamam�ndan kurtulduk.
		System.out.println(str); //sonuc:*Java ogrenmek c..ok kolay
		
		str=str.replaceAll("\\s", "x"); //bu sekilde yazarsak bosluklara x degerini atam�s olduk.  \\s bosluk yani space demektir.sonras�nda x harflerini space haline getirecez.
		str=str.replaceAll("\\W", ""); //yazarsak butun harfleri degi�tirdi ve butun harfleri sildi ve deger atad�
										//ancak bunu buyuk W yaparsak harf olmayan anlam�na gelir.
		System.out.println(str); //en son hali ile "Javaxogrenmekxcokxkolay" bu sekilde oldu simdi x leri bosluk ile degi�tirelim.
		
		str=str.replace("x", " "); //yaparsak x ler bosluk olur.
		System.out.println(str); //Java ogrenmek cok kolay sonuc bu sekilde oldu art�k.
		
		//regular expression diye googleda arat�rsak ozel karakterleri anlamlar�n� "w" "W" bunlar� bulabiliriz.
		/*			\\s==> bosluk /Space
		        \\S==> bosluk disi hersey
		        \\w==> tum harfler ve rakamlar
		        \\W==> harfler ve rakamlar disi hersey 
		        \\d==> Rakamlar
		        \\D==>Rakamlar disi hersey  */

}}
