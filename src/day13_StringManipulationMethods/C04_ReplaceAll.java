package day13_StringManipulationMethods;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		//System.out.println(str.replaceAll(str, "enes")); //replace all butun harfleri degistirir. 
		//yani atadıgımız str yi komple yenisi ile degiştirir.butun harf ve sayıları butun harf olmayan sayıları vs kullanılır
		//mesela butun harfleri butuun sayıları degiştir.
		//replace de char kullanılmaz.. \\ yazarsak 

		String str= "*Java 98ogrenmek c..ok k876olay";
		//bunu replaceall kullanarak Java Ogrenmek Cok Kolay" a getirelim.
		
		
		str=str.replaceAll("\\d", ""); //burada \\ ters slach koyarak digitleri yanı sayıları hiclik ile degistirerek
										//atama yaparak rakamların tamamından kurtulduk.
		System.out.println(str); //sonuc:*Java ogrenmek c..ok kolay
		
		str=str.replaceAll("\\s", "x"); //bu sekilde yazarsak bosluklara x degerini atamıs olduk.  \\s bosluk yani space demektir.sonrasında x harflerini space haline getirecez.
		str=str.replaceAll("\\W", ""); //yazarsak butun harfleri degiştirdi ve butun harfleri sildi ve deger atadı
										//ancak bunu buyuk W yaparsak harf olmayan anlamına gelir.
		System.out.println(str); //en son hali ile "Javaxogrenmekxcokxkolay" bu sekilde oldu simdi x leri bosluk ile degiştirelim.
		
		str=str.replace("x", " "); //yaparsak x ler bosluk olur.
		System.out.println(str); //Java ogrenmek cok kolay sonuc bu sekilde oldu artık.
		
		//regular expression diye googleda aratırsak ozel karakterleri anlamlarını "w" "W" bunları bulabiliriz.
		/*			\\s==> bosluk /Space
		        \\S==> bosluk disi hersey
		        \\w==> tum harfler ve rakamlar
		        \\W==> harfler ve rakamlar disi hersey 
		        \\d==> Rakamlar
		        \\D==>Rakamlar disi hersey  */

}}
