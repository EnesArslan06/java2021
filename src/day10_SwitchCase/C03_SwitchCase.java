package day10_SwitchCase;

public class C03_SwitchCase {

	public static void main(String[] args) {
		//if else le cozdugumuz sorularda kontrol etmemiz gereken sart sayýsý cok oldugunda switch Statement kullanýlýr
//mesela kullanýcýdan ay numarasý istedigimizde 12 tane i else yazmak zahmetli olur.
//Switch statement de long, double, float ve Boolean(true/false) kullanýlamaz.
//byte-int-sort-char-String kullanýlabilir
		
//gun numarasýna göre gun isimlerini yazdýralým
		
int gunNo=7;   //body olusturacaz //gun nu olan yere yukarýda belirttigim variableler kullanýlamaz yaný long vs....
switch(gunNo) {
case 1:  System.out.println("Pazartesi"); break;			//bu sekilde olursa istedigimiz gun no dan baslar "break gelene kadar yazdýrýr.
case 2:  System.out.println("Salý"); break;						//hepsinin sonuna break yazmamýz lazým.
case 3:  System.out.println("Carsamba"); break;			//yada yazdýrmak istedigimiz yere kadar break koymayýz.
case 4:  System.out.println("Persembe"); break;		//7 ye kadar yazdýk ancak 10 yazarsa konsola herhangi bir uyarý calýþma olmaz
case 5:  System.out.println("Cuma");   break;			 //bunun içinde en son satýrdan sonra default yazarýz
case 6:  System.out.println("Cumartesi"); break;
case 7:  System.out.println("Pazar"); break;
default: System.out.println("Gecerli bir gun numarasý yazýnýz");
}

	
	
}}