package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		//kullan�c�dan deger almak icin 3 ad�m takip edilir
		//1. ad�m scanner objesi olusturmak.
		
		Scanner scan=new Scanner(System.in); //scan�n alt�ndaki i�aret kaynak kacag� oldugunu belirtiyor.
		//scan� olusturdunuz ama i�lemi kapatmad�n�z. en sona gelip scan. close yapmak laz�m.
		//scan.close();
		
		//Scanner ilk basta k�rm�z� �st�ne yaklas�nca import scanner k�sm�na geliyoruz.
		//burada class�nda scanner olmad��� anlam�na gelir. oraya t�klay�nca yular�ya class�n oraya import olarak ekler
		//2. ad�m  kullan�c�ya ne istedigimizi soylememiz gerekir. Nas�l bilgi yazd�racag�z konsola?
		
		System.out.println("lutfen isminizi yaziniz");
		
		//kullan�c�dan istedi�im ismi string olusturuo oraya yazmam laz�m. scan k�sm�na t�klat�p next string
		//k�sm�na gidiyoruz konsola Mehmet ismini veriyor. sonra terminal �al���yor.
		
		String isim=scan.next();
		
		System.out.println("�sminiz..:" + isim);
		
		//scan bir scanner objesidir.
		//isim olarak farkl� bir isim yazsakda �al�s�r ancak biz scan demeyi tercih ederiz.
		//scan bir obje oldugu icin data t�r� non pirimitive dir.
		//primitive data t�rleri sadece deger icerirken,
		//non primitiveler degerin yan�nda birde methodlar bulundurur*****.
		//scan. yazarsak altta bircok method ��kar. non primitiver cok buyuk oranda method bar�nd�r�r.
		
		
		
		
		
		System.out.println("Lutfen esinin ad�n� soyle");
		String esisim=scan.nextLine();
		
		
		System.out.println("esinin ad�" + esisim);		
		
		
		
		scan.close();
		
		
		
		

	}

}
