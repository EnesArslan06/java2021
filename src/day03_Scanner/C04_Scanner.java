package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		//kullanýcýdan deger almak icin 3 adým takip edilir
		//1. adým scanner objesi olusturmak.
		
		Scanner scan=new Scanner(System.in); //scanýn altýndaki iþaret kaynak kacagý oldugunu belirtiyor.
		//scaný olusturdunuz ama iþlemi kapatmadýnýz. en sona gelip scan. close yapmak lazým.
		//scan.close();
		
		//Scanner ilk basta kýrmýzý üstüne yaklasýnca import scanner kýsmýna geliyoruz.
		//burada classýnda scanner olmadýðý anlamýna gelir. oraya týklayýnca yularýya classýn oraya import olarak ekler
		//2. adým  kullanýcýya ne istedigimizi soylememiz gerekir. Nasýl bilgi yazdýracagýz konsola?
		
		System.out.println("lutfen isminizi yaziniz");
		
		//kullanýcýdan istediðim ismi string olusturuo oraya yazmam lazým. scan kýsmýna týklatýp next string
		//kýsmýna gidiyoruz konsola Mehmet ismini veriyor. sonra terminal çalýþýyor.
		
		String isim=scan.next();
		
		System.out.println("Ýsminiz..:" + isim);
		
		//scan bir scanner objesidir.
		//isim olarak farklý bir isim yazsakda çalýsýr ancak biz scan demeyi tercih ederiz.
		//scan bir obje oldugu icin data türü non pirimitive dir.
		//primitive data türleri sadece deger icerirken,
		//non primitiveler degerin yanýnda birde methodlar bulundurur*****.
		//scan. yazarsak altta bircok method çýkar. non primitiver cok buyuk oranda method barýndýrýr.
		
		
		
		
		
		System.out.println("Lutfen esinin adýný soyle");
		String esisim=scan.nextLine();
		
		
		System.out.println("esinin adý" + esisim);		
		
		
		
		scan.close();
		
		
		
		

	}

}
