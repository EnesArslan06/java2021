package day10_SwitchCase;

public class C08_StringManipulationCharAt {

	public static void main(String[] args) {
		// charAt(0) parantezin arasýna Stringde mevcut olan karekterlerden brini almamýza yarar
		
String kurs="Techproeducation";
System.out.println(kurs.charAt(5));  //r yazdýrýr. index sýfýrdan baslar.
System.out.println(kurs.charAt(16)); //16 yazarsak hata verir. 
//Cunku sýfýrdan baslar cunku 16 harf varsa 15 yazarsak son harfi verir.


	}

}
