package day10_SwitchCase;

public class C03_SwitchCase {

	public static void main(String[] args) {
		//if else le cozdugumuz sorularda kontrol etmemiz gereken sart say�s� cok oldugunda switch Statement kullan�l�r
//mesela kullan�c�dan ay numaras� istedigimizde 12 tane i else yazmak zahmetli olur.
//Switch statement de long, double, float ve Boolean(true/false) kullan�lamaz.
//byte-int-sort-char-String kullan�labilir
		
//gun numaras�na g�re gun isimlerini yazd�ral�m
		
int gunNo=7;   //body olusturacaz //gun nu olan yere yukar�da belirttigim variableler kullan�lamaz yan� long vs....
switch(gunNo) {
case 1:  System.out.println("Pazartesi"); break;			//bu sekilde olursa istedigimiz gun no dan baslar "break gelene kadar yazd�r�r.
case 2:  System.out.println("Sal�"); break;						//hepsinin sonuna break yazmam�z laz�m.
case 3:  System.out.println("Carsamba"); break;			//yada yazd�rmak istedigimiz yere kadar break koymay�z.
case 4:  System.out.println("Persembe"); break;		//7 ye kadar yazd�k ancak 10 yazarsa konsola herhangi bir uyar� cal��ma olmaz
case 5:  System.out.println("Cuma");   break;			 //bunun i�inde en son sat�rdan sonra default yazar�z
case 6:  System.out.println("Cumartesi"); break;
case 7:  System.out.println("Pazar"); break;
default: System.out.println("Gecerli bir gun numaras� yaz�n�z");
}

	
	
}}