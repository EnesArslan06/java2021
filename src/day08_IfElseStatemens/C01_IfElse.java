package day08_IfElseStatemens;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		/* Eger hava guzel olursa piknige gideriz yoksa evde otururuz.
		Sart 1 tane sonuc 2 tane.
		havanýn guzel olmasý sart
		sonuc 1 piknige gideriz 
		2.sart ende otururuz. yaný sart olumlu olursa (if body) calýsýr
		sart yanlýs ise else body calýsýr. 
		If(boolean sart){sart saglanýrsa istenen kod} else {sart saglanmazsa istenen kod}*/

		//Soru:1 Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve 
		//dikdortgenin kare olup olmadigini yazdirin

Scanner scan=new Scanner(System.in);
System.out.println("Lutfen Dikdortgenin bir kenar uzunlugunu belirtiniz:");
double kenar1=scan.nextDouble();
System.out.println("Lutfen Dikdortgenin diger kenar uzunlugunu belirtiniz:");
double kenar2=scan.nextDouble();
if (kenar1==kenar2) {System.out.println("Karedir");} else {System.out.println("Kare degildir");}
// ayrý ayrýda yapýlabýlýr ancak gereksiz yorgunluk olur. else de tek ifde iþlem yapýlabilir.

		scan.close();
		
	}

}
