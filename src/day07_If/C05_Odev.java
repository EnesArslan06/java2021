package day07_If;

import java.util.Scanner;

public class C05_Odev {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		/*Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin */

/*Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir tam sayi belirtin");
int sayi=scan.nextInt();
if (sayi%2==0) {System.out.println("Cift sayý girdiniz");}
if (sayi%2==1) {System.out.println("Tek sayý girdiniz");}*/
	

		/*Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun  
		isimlerini yazdirin  
	    Ornek: ilkHarf=P output = “Pazar, Pazartesi veya Persembe” 
		ilkHarf=S output = “Sali” 
	 	Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin Soru */
	
/*Scanner scan=new Scanner(System.in);
System.out.println("Lutfen Bir gun adýnýn ilk harfini belirtin");
char ilkHarf=scan.next().toUpperCase().charAt(0);
if (ilkHarf=='P') {System.out.println("Pazartesi, Persembe, Pazar ");}
if (ilkHarf=='S') {System.out.println("Salý");}
if (ilkHarf=='C') {System.out.println("Cuma, Cumartesi");}
if (ilkHarf!='P' && ilkHarf!='S' && ilkHarf!='C') {System.out.println("Gecersiz Harf Girdiniz");	}*/
		

	 	/*3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin  
	 	*Ornek: gun=Pazar output = “Hafta sonu” 
	 	gun=Sali output = “Hafta ici” 
	 	*** String icin equals method’unu kullanin */

/*Scanner scan=new Scanner(System.in);	
System.out.println("Bir gun ismi yazýn;");	
String gunismi=scan.next().toLowerCase();
if (gunismi.equals("cumartesi") || gunismi.equals("pazar")) {System.out.println("Hafta sonu");}
if (gunismi.equals("pazartesi") || gunismi.equals("sali") || gunismi.equals("carsamba") || gunismi.equals("cuma") || gunismi.equals("persembe"))
{	System.out.println("Hafta ici");}			*/

	
	
	
		/*Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup  olmadigini yazdirin*/ 

/*Scanner scan=new Scanner(System.in);
System.out.println("Lutfen Dikdortgenin bir kenar uzunlugunu belirtiniz:");
double kenar1=scan.nextDouble();
System.out.println("Lutfen Dikdortgenin diger kenar uzunlugunu belirtiniz:");
double kenar2=scan.nextDouble();
if (kenar1==kenar2) {System.out.println("Sonuc:Karedir.");}
if (kenar1!=kenar2) {System.out.println("Sonuc kare degildir.");} */
	

		/*Soru 5) Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin. 
		“Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
	 	“Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin*/  //equel kullanacaz

/*System.out.println("Lutfen Cuma-Cumartesi-Pazar gunlerinden birinin ismini belirtin: ");
String gunismi=scan.next().toLowerCase();
if (gunismi.equals("cuma")) {System.out.println("Muslumanlar icin kutsal gun");} 
else if(gunismi.equals("cumartesi")){System.out.println("Yahudiler icin kutsal gun");}
else if(gunismi.equals("pazar")){System.out.println("Hiristiyanlar icin kutsal gun");}
else {System.out.println("Baska bir gun ismi belirtin");}*/

		
		/*Soru 6) Kullanicidan gun ismini yazmasini isteyin. 
		Girilen isim gecerli bir gun ise gun  isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, 
		gun ismi  gecerli degilse “Gecerli gun ismi giriniz” yazdirin */


/*System.out.println("Lutfen bir gun adý yazýn");
String gun=scan.next().toLowerCase();

if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || 
gun.equals("persembe") ||gun.equals("cuma")|| gun.equals("cumartesi") || gun.equals("pazar")) 
{System.out.println(gun.toUpperCase().charAt(0)+""+gun.toLowerCase().charAt(1)+""+gun.toLowerCase().charAt(2) + gun.substring(3));} 
else {System.out.println("Gecerli bir gun giriniz");} */
	

		
		
		
		scan.close();	
		
		
			
	}

}
