package day18_NestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Forloop ile yapilamayacak bir soru
		//kullanýcýdan toplanmak uzere sayi isteyin
		//Kullanýcý sýfýra basýncaya kadar sayilarý alýp toplamaya devam edin.
		//Kullanici sifira bastiginda o ana kadar kac sayi girdigini ve
		//girilen sayilarýn toplamýný yazdirin.
			//for loop ile cozmek cok zorlama olur. Cunku baslangici ve sonu belli degil
		//Kullanýcýnýn kactane sayi girecegini bilmiyoruz.
	
	
	//for (int i = 1; i <=5; i++) {} //5 sayi girecegi net olsaydý bu sekilde for ile yapabilirdik.
	//loop un icinde kullanacagým obje ve veriabellarý loopdan once olusturmak daha guzeldir.
	//Loopun icinde olusturursak loop her dondugunde yeni bir obje ve variable olusturur.buda hafýzayi doldurur.
	//Kullanýcan sayiyi almak icin bir variabla ihtiyacýmýz var ve aldýgýmýz sayilarý koyacagým bir variable lazým
	//bunlarý loop olusturmadan yapmamýz lazým	
		
	Scanner scan=new Scanner(System.in);	
	
	int sayi=100; //kullanýcýdan sayi al, bu soruda 0 ozel bir deger olacagý için sýfýr verememeyiz, 0 disinda her sayi olur
	int toplam=0; //aldýgým sayiyi toplama ekle kabý
	int sayac=0; //kullanýcý kac sayi girdiginde sayacak olan bir sayac kabi hazirladik
	
	while (sayi!=0) {
		System.out.println("Lutfen Toplama eklemek istediginiz sayilari giriniz...\nBitirmek için 0'a basýn");	
		sayi=scan.nextInt();
		toplam+=sayi; //kullanýcýdan aldýgým sayiyi toplama ekledim
		sayac++; //kullanýcýnýn her girdigi sayi icin sayac bir artacak
				//kullanici Sifira bastýgýnda loop islevini son kez yapýp sonra basa donecek ve loop bitecek.
		
	}
	System.out.println("Girilen sayi adedi: " +(sayac-1));//sayac enson 0 rakamýnýda degerden sayýyor ve 1 fazla gosteriyor
							//o yuzden en son yazdýrma asamasýnda  sayac-1 yazarsak islem tamamlanmýs olur
		System.out.println("Girilen sayilarin toplami: " +toplam);
		
			
	scan.close();

}}
