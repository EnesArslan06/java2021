package day10_SwitchCase;

public class C08_StringManipulationCharAt {

	public static void main(String[] args) {
		// charAt(0) parantezin aras�na Stringde mevcut olan karekterlerden brini almam�za yarar
		
String kurs="Techproeducation";
System.out.println(kurs.charAt(5));  //r yazd�r�r. index s�f�rdan baslar.
System.out.println(kurs.charAt(16)); //16 yazarsak hata verir. 
//Cunku s�f�rdan baslar cunku 16 harf varsa 15 yazarsak son harfi verir.


	}

}
