package day08_IfElseStatemens;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		/* 1 sart olursa if 
		2 sart olursa if else
		daha dazla olursa if else if else if .......else olarak cozeriz. sonunda yine else kal�r. */

		/*Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,  
		sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
		sayilarin ikisi farkli  isaretlere sahipse �farkli isaretlerde sayilarla islem yapamazsin� yazdirin,  
		sayilardan sifira esit olan varsa �sifir carpmaya gore yutan elemandir� yazdirin. */
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen bir tam sayi giriniz:");
int sayi1=scan.nextInt();
System.out.println("Lutfen bir tam sayi daha giriniz:");
int sayi2=scan.nextInt();

if (sayi1>0 && sayi2>0) {System.out.println("Sayilarin toplam�:" + (sayi1+sayi2));} 
else if(sayi1<0 && sayi2<0){System.out.println("Say�lar�n Carp�m�:" + sayi1*sayi2);}
else if(sayi1*sayi2<0) {System.out.println("Farkl� i�aretteki say�larla i�lem yapamazs�n�z");}//say�lar�n farkl� karakterde oldugunu ogrenmek i�in iki say�y� carpar�z bu say� s�f�rdan asag� olamaz.
else {System.out.println("s�f�r carpmaya g�re yutan elamand�r.");} 

//1. if i�aretinden sonra bir sart icin "else if kullan�r�z sonrakinde yiene ifelse olur
//ancak son islemde sadece else yazar�z ve condition k�sm�n� yapmay�z zaten baska sart kalmad��� i�in. 
		
		
		
scan.close();	
		
		
		
		
	}

}
