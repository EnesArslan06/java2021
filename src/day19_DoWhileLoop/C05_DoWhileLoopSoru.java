package day19_DoWhileLoop;

import java.util.Scanner;

public class C05_DoWhileLoopSoru {

	public static void main(String[] args) {
		/*Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
		edin ve sifredeki hatalari yazdirin.
		Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
		girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		-
		Sifre kucuk harf icermelidir
		-
		Sifre buyuk harf icermelidir
		-
		Sifre ozel karakter icermelidir
		-
		Sifre en az 8 karakter olmalidir.*/

Scanner scan=new Scanner(System.in);
	String sifre="";
	boolean khk=false;
	boolean bhk=false; //buyuk harf kontrol
	boolean okk=false; //ozel karakter kontrolu
	boolean uk=false; //uzunluk kontrolu
	
	do {System.out.println("Bir Sifre Giriniz");
	sifre=scan.nextLine();//sifre bosluk içermemelidir demiyor. uzun sifre olabilir.
	
	 khk=kucukharfkontrol(sifre);     //sifre dogru oluncaya kadar calýsmasý lazým
	
	bhk=buyukharfkontrol(sifre);				//burada do nun icerisinde bu methodlar calýsacak
	
	okk=ozelkarekterkontrol(sifre);
	
	uk=uzunlukkontrol(sifre);

	} while (!khk || !bhk || !okk ||!uk);
		System.out.println("Sifreniz basarýlý bir sekilde kaydedildi");


}
			private static boolean uzunlukkontrol(String sifre) {
		boolean uk=false;
		if (sifre.length()>=8) {
			uk=true;
		} else {System.out.println("Sifreniz en az 8 karakter olmalýdýr");}
		
	
			return uk;
			}	
			
			
			
			
			private static boolean ozelkarekterkontrol(String sifre) {
				boolean okk=false;
				String harfler="!'^+&/())=?__?;:><|%";
				for (int i = 0; i < sifre.length(); i++) {
					if (harfler.contains(sifre.substring(i,i+1))) {
						okk=true; //harfler stringmiz ozel karakter iceriyor ise true yapacak
						break; //bir tane ozel karakterolsa yeter oyuzden break yazýyoruz bu
					}
				}
				//sifrede kucuk harf varsa khk true yoksa khk false olacak
				if (!okk) {
					System.out.println("Sifreniz en az bir ozel karakter icermelidir");
					
				}
				return okk;
	
			}
			
			
			
			
			private static boolean buyukharfkontrol(String sifre) {
		boolean bhk=false;
		String harfler="ABCDEFGHIJKLMNOPRSTUVYZWQX";
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i,i+1))) {
				bhk=true; //harfler stringmiz buyuk harf iceriyor ise true yapacak
				break; //bir tane harf buyuk olsa yeter oyuzden break yazýyoruz bu
			}
		}
		//sifrede kucuk harf varsa khk true yoksa khk false olacak
		if (!bhk) {
			System.out.println("Sifreniz en az bir buyuk harf icermelidir");
			
		}
		return bhk;
		
	}
			
	
			
			
			//burasi bir  method...kucuk harf kontrolu yapan bir method
			private static boolean kucukharfkontrol(String sifre) {
		//burada birsey dondurmesi lazým while a kontrol icin. return olusturuyoruz bir boolean sonuc donduruyor
		boolean khk=false;   //boolean yapýyoruz sifre kucuk harf iceriyorsa true yoksa false olmasi lazim
		
		String harfler="abcdefghijklmnoprstuvyzqwx"; //harfler string olusturduk ve sifrede olup olmadýgýný kontrol ettik
		for (int i = 0; i < sifre.length(); i++) {
			if (harfler.contains(sifre.substring(i,i+1))) {
				khk=true; //harfler stringmiz kucuk harf iceriyor ise true yapacak
				break; //bir tane harf kucuk olsa yeter oyuzden break yazýyoruz bu
			}
		}
		//sifrede kucuk harf varsa khk true yoksa khk false olacak
		if (!khk) {
			System.out.println("Sifreniz en az bir kucuk harf icermelidir");
			
		}
		return khk;
		
		
	
	
	
	
	
}}	
	
	
