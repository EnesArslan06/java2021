package day03_Scanner;

import java.util.Scanner;

public class day02_Odev {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	//Soru:1
	
			System.out.println("Lütfen bir tamsayi giriniz; ");
			
			
			int tamsayi1=scan.nextInt();
			
			System.out.println("Lütfen bir tamsayi daha giriniz");
			
			int tamsayi2=scan.nextInt();
			
			System.out.println(tamsayi1 + tamsayi2);
			System.out.println(tamsayi1 - tamsayi2);
			System.out.println(tamsayi1 * tamsayi2);
			
	//Soru 2:
			
			System.out.println("Lutfen karenin bir kenar uzunlugunu belirtin;");
			
			int birkenar=scan.nextInt();
			
			System.out.println("karenin cevresi: " + birkenar * 4);
			System.out.println("karenin alani: " + birkenar * birkenar);
			
	//Soru:3
			
			System.out.println("Lutfen dairenin yari capýný belirtiniz;");
			
			int yaricap=scan.nextInt();
			
			double pisayisi=3.14;
			
			System.out.println("Dairenin cevresi: " + yaricap * 2 * pisayisi);
			System.out.println("Dairenin alaný: " + pisayisi*yaricap*yaricap);
			
	//Soru: 4
		
			
			 System.out.println("Lutfen prizmanin kýsa kenar bilgisini giriniz:");
			
			
			int kisakenar=scan.nextInt();
					
			System.out.println("Lutfen prizmanin uzun kenar bilgisini giriniz:");
			
			int uzunkenar=scan.nextInt();
			
			System.out.println("Lutfen prizmanin yukseklik bilgisini giriniz:");
			
			int yukseklik=scan.nextInt();
			
			System.out.println("Prizmanin hacmi: " + kisakenar*uzunkenar*yukseklik); 
			
	//Soru:5
			
			System.out.println("Lutfen adinizi yaziniz");
			
			String isim=scan.next();
			
			System.out.println("Lutfen soyadinizi yaziniz");
			String soyisim=scan.next();
			
			System.out.println("Isminiz..;" + isim) ;
			System.out.println("Soyisminiz..;" + soyisim);
			System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz");
			
	//Soru:6
			
		    System.out.println("Lutfen isminizi giriniz..:");
			
			String isim1=scan.nextLine();
			
			System.out.println("Lutfen soyisminizi giriniz");
			
			String soyisim1=scan.nextLine();
			
			System.out.println("Isim-Soyisim : " + isim1 + " " + soyisim1 );
	
	//Soru 7- Kullanicidan ismini alip isminin bas harfini yazdirin
			
			System.out.println("Lutfen isminizi yaziniz:");
			
			//kullanýcýný ilk harfi icin char kullanýlýr.char next. noktada olmadýgý icin string kullanýrýz.
			//esitligin sol tarafý char sað tarafý string. en son paragerafýn oldugu yere nokta koyarýz.
			
			
			char ilkHarf=scan.next().charAt(0);
			
			//java index kullanýr oda 0 dan baslar yani 5 harflik bir isimde 0,1,2,3,4 vardýr.
			
			System.out.println("isminizin ilk harfi= " + ilkHarf);
			
			
			scan.close();
			
	}

}
