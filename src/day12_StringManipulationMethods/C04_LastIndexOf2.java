package day12_StringManipulationMethods;

import java.util.Scanner;

public class C04_LastIndexOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		Girilen kelime cumlede kullanilmamis.
		Girilen kelime cumlede 1 kere kullanilmis.
		Girilen kelime cumlede 1’den fazla kullanilmis.*/
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();		
		System.out.println("Lutfen varlýgýný kontrol etmek icin bir harf giriniz");	
		String kelime=scan.next();
		
		int ilkindex=cumle.indexOf(kelime);  //ilk kelimeyi veya harfi aldýk
		int sonindex=cumle.lastIndexOf(kelime); //sondan baslayarak ilk kelime veya harfi aldýk
		
		if (ilkindex<0) {System.out.println("Girilen kelime cumlede kullanilmamis.");
					
		} else if(ilkindex==sonindex){System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");

		} else {System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");}
		
		//baastan saymaya basladý ilk  buldugu index mesela 8, son index saymaya basladý o 8 de degilde baska yerde bulursa
		//demekki esit degil ve baska indexlerde buldular demekki 1 den fazla kullanýlmýs.
		//java ne guzel java cok kýymetli cumlesinde
		//ilkindex 0 da cýkar, son index 14 de bulur demekki farklý yerler buldular.
		
		scan.close();
}}
