package day12_StringManipulationMethods;

import java.util.Scanner;

public class C07_ContainsSoru {

	public static void main(String[] args) {
		//// Soru 2) Kullanicidan bir cumle isteyin. 
        //Cumle �buyuk� kelimesi iceriyorsa tum cumleyi buyuk harf olarak, 
		//�kucuk� kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
		// hem kucuk hem buyuk iceriyorsa "kucuk mu buyuk mu karar ver" yazd�r�n
        //  iki kelimeyi de icermiyorsa �Cumle kucuk yada buyuk kelimesi icermiyor� yazdirin.
       

	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir cumle belirtin");
	String cumle=scan.nextLine();
	
	/*if (cumle.toLowerCase().contains("buyuk")){System.out.println(cumle.toUpperCase());}
		
	 else ifcumle.contains("kucuk") && cumle.contains("buyuk")){System.out.println("kucuk mu buyuk mu karar ver");}
	 else if(cumle.contains("kucuk")){System.out.println("kucuk mu buyuk mu karar ver");}
	 else {System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");}

	//yazd�r�rken if else yap�s�nda yukar�dan asag� dogru gelmektedir. en basa en dar olan ifadeyi girmemiz laz�m.
	//mesala kucuk mu buyuk mu karar ver en basta olmal�, vunku kucugu  veya buyugu yukar�da gorunca direk yaz�yor.
	// yukar�daki durumu duzeltecem. "kucuk veya "buyuk kelimelerinin yazarken hatas�na bakmayacag� duruma getirecem.

//if (cumle.toLowerCase().contains("buyuk")) {} else {}  bu sekilde yazacam.*/


}}
