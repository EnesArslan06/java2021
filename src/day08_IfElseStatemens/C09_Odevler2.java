package day08_IfElseStatemens;

import java.util.Scanner;

public class C09_Odevler2 {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);	
		/*Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
		bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
		çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*/


/*System.out.println("Lutfen dort basamaklı bir tam sayı giriniz: ");
int sayi=scan.nextInt();
int sayi1=sayi%10;
if (sayi%5==0) {if (sayi1==0){System.out.println("Bese bolunebilen Cift Sayı");} 
else {System.out.println("Bese bolunebilen tek sayi");}}
else {System.out.println("Tekrar Deneyin");}   */ 	 	
		  
		/*Soru:Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise
		  gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak
		  yazdirin, gun ismi
		  gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		​
Scanner scan= new Scanner(System.in); //illa scan olmak zorunda degil 
​System.out.println("Lutfen bir gun ismi giriniz:");		​
String gun = giris.next().toUpperCase();		
if (gun.equals("PAZAR") || gun.equals("PAZARTESI")||gun.equals("SALI")||gun.equals("SALİ")
||gun.equals("CARSAMBA"||gun.equals("PERSEMBE")||gun.equals("CUMA")
||gun.equals("CUMARTESI")||gun.equals("CUMARTESİ")) {
System.out.println(gun.charAt(0)+""+gun.toLowerCase().charAt(1)+""+gun.toLowerCase().charAt(2));} 
else{System.out.println("Gecerli gun ismi giriniz"); } */
			       
		/*Soru: Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        // Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        // “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        // Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        // “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.	*/

/*System.out.println("Lutfen Bir Sifre Giriniz...");
char sifre=scan.next().charAt(0);
if (sifre!='A' && sifre!='z') {System.out.println("Gecersiz Sifre...");} 
else {System.out.println("Gecerli Sifre...");}	*/	
		
		
		/* Soru:Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar
		 * ve yuzler basamagi olarak yazdirin
		 * Ornek : Inputs : 853 Output : Girdiginiz sayinin birler basamagi : 3
		 * Girdiginiz sayinin onlar basamagi : 5 Girdiginiz sayinin yuzler basamagi : 8 */
		
/*System.out.println("Lutfen uc basamakli bir sayi giriniz");
int sayi = input.nextInt();
​
int yuzler = sayi / 100, onlar = sayi / 10 % 10, birler = sayi % 10;
​
// System.out.println(yuzler + " " + onlar + " " + birler);
​
if (sayi > 99 && sayi < 1000) {
System.out.println("Girdiginiz sayinin;\n\t\tbirler basamagi : " + birler);
System.out.println("\n\t\tonlar basamagi  : " + onlar);
System.out.println("\n\t\tyuzler basamagi : " + yuzler);
} else {
System.out.println("Lutfen 3 basamakli bir sayi giriniz");  */

		
		/*SORU 1 :Kullanicidan aldigi urunun adedini  alin, kullaniciya
		  musteri karti olup olmadigini sorun Musteri karti varsa ve 10 urunden fazla
		  alirsa %20, yoksa %15 indirim yapin Musteri karti yoksa ve 10 urunden fazla
	 	 alirsa %15, 10 urunden az alirsa %10 indirim yapin*/
/*Scanner scan=new Scanner(System.in);
System.out.println("Lutfen Aldıgınız urunun adedini giriniz \n Musteri kartınız varsa 'E' yoksa 'H' yazınız");
int adet=scan.nextInt();
char kart=scan.next().toUpperCase().charAt(0);

if (kart=='E') {if (adet>10){System.out.println("yuzde 20 indirim kazandınız");} 
else {System.out.println("yuzde 15 indirim kazandınız");}}
else if(kart=='H') {if (adet>10){System.out.println("yuzde 15 indirim kazandınız");}
else{System.out.println("yuzde 10 indirim kazandınız");}} else{System.out.println("Lutfen Gecerli bir harf giriniz");}  */

				// Soru: Kullanıcıdan 2 sayı alın ve 4 işlem yaptırın
				// Ipucu System.out.println("1: Toplama \n2: Çıkarma\n3: Çarpma\n4: Bölme");
				// System.out.println("Lütfen Yapmak İstediğiniz İşlemi 1 , 2, 3, 4 Olarak
				// Seçiniz!");burda 1secerse
				// toplma yaptiricak mesela
		
/*Scanner scan=new Scanner(System.in);		
		
System.out.println("Lutfen 2 adet tam sayi giriniz: \n"
+ "Lutfen yaptırmak istediginiz islemi 1,2,3 ve 4 olarak secin: \n"
+ " 1:Toplama 2:Cıkarma 3:Carpma 4:Bolme");
int sayi1=scan.nextInt();
int sayi2=scan.nextInt();
char islem=scan.next().charAt(0);
if (islem=='1'){System.out.println(sayi1+sayi2);} else if (islem=='2'){System.out.println(sayi1-sayi2);}
else if(islem=='3'){System.out.println(sayi1*sayi2);} else if(islem=='4'){System.out.println(sayi1/sayi2);}
else {System.out.println("Lutfen gecerli bir islem belirtiniz");}		*/
		


		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        // Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        // “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        // Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        // “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

/*Scanner scan =new Scanner (System.in);
System.out.println("Bir sifre giriniz");
String ilkHarf=scan.next().substring(0, 1);
if (ilkHarf.equals("A")) {
System.out.println("Gecerli Sifre");
}else if (ilkHarf.equals("z")) {
System.out.println("Gecerli Sifre");
}else {System.out.println("Gecersiz Sifre");}*/
	        
scan.close();		

}}