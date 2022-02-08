package day18_NestedForLoop_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Forloop ile yapilamayacak bir soru
		//kullan�c�dan toplanmak uzere sayi isteyin
		//Kullan�c� s�f�ra bas�ncaya kadar sayilar� al�p toplamaya devam edin.
		//Kullanici sifira bastiginda o ana kadar kac sayi girdigini ve
		//girilen sayilar�n toplam�n� yazdirin.
			//for loop ile cozmek cok zorlama olur. Cunku baslangici ve sonu belli degil
		//Kullan�c�n�n kactane sayi girecegini bilmiyoruz.
	
	
	//for (int i = 1; i <=5; i++) {} //5 sayi girecegi net olsayd� bu sekilde for ile yapabilirdik.
	//loop un icinde kullanacag�m obje ve veriabellar� loopdan once olusturmak daha guzeldir.
	//Loopun icinde olusturursak loop her dondugunde yeni bir obje ve variable olusturur.buda haf�zayi doldurur.
	//Kullan�can sayiyi almak icin bir variabla ihtiyac�m�z var ve ald�g�m�z sayilar� koyacag�m bir variable laz�m
	//bunlar� loop olusturmadan yapmam�z laz�m	
		
	Scanner scan=new Scanner(System.in);	
	
	int sayi=100; //kullan�c�dan sayi al, bu soruda 0 ozel bir deger olacag� i�in s�f�r verememeyiz, 0 disinda her sayi olur
	int toplam=0; //ald�g�m sayiyi toplama ekle kab�
	int sayac=0; //kullan�c� kac sayi girdiginde sayacak olan bir sayac kabi hazirladik
	
	while (sayi!=0) {
		System.out.println("Lutfen Toplama eklemek istediginiz sayilari giriniz...\nBitirmek i�in 0'a bas�n");	
		sayi=scan.nextInt();
		toplam+=sayi; //kullan�c�dan ald�g�m sayiyi toplama ekledim
		sayac++; //kullan�c�n�n her girdigi sayi icin sayac bir artacak
				//kullanici Sifira bast�g�nda loop islevini son kez yap�p sonra basa donecek ve loop bitecek.
		
	}
	System.out.println("Girilen sayi adedi: " +(sayac-1));//sayac enson 0 rakam�n�da degerden say�yor ve 1 fazla gosteriyor
							//o yuzden en son yazd�rma asamas�nda  sayac-1 yazarsak islem tamamlanm�s olur
		System.out.println("Girilen sayilarin toplami: " +toplam);
		
			
	scan.close();

}}
