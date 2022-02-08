package day19_DoWhileLoop;

import java.util.Scanner;

public class C03_WhileLoopSoru {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen  pozitif bir tam sayi giriniz");				
				int sayi=scan.nextInt();
		
		/*int rakamlarToplami=0;
		int rakam=0;
		
		while (sayi>0) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
		}
	System.out.println("rakamlar toplami: "+ rakamlarToplami);*/
		
	
	
	
				//for loop ile yapýmý
	int rakam=0;
	int rakamlarToplami=0; //yukarýda yaptýgýmýz iþlemin ustune ekler o yuzden tekrar sýfýrladýk rakamlar toplamýný	
	String sayiStr=" "+sayi ;		//basýna bir adet bosluk eklersek sayi degerimizi String hale getiririz ve sayinin (sayiStr) nýn Lengty uzunlugunu bulabiliriz.
	//bir int degerinin basamak degerini string hale getirerek yapariz.
	
	for (int i = 0; i < sayiStr.length(); i++) {
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
	}
	System.out.println("rakamlar toplami: "+ rakamlarToplami);
	
	
	
	
	
scan.close();	
	
}}
