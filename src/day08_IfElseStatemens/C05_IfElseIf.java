package day08_IfElseStatemens;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		/* 1 sart olursa if 
		2 sart olursa if else
		daha dazla olursa if else if else if .......else olarak cozeriz. sonunda yine else kalýr. */

		/*Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,  
		sayilarin ikisi de negative ise sayilarin carpimini yazdirin, 
		sayilarin ikisi farkli  isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,  
		sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin. */
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen bir tam sayi giriniz:");
int sayi1=scan.nextInt();
System.out.println("Lutfen bir tam sayi daha giriniz:");
int sayi2=scan.nextInt();

if (sayi1>0 && sayi2>0) {System.out.println("Sayilarin toplamý:" + (sayi1+sayi2));} 
else if(sayi1<0 && sayi2<0){System.out.println("Sayýlarýn Carpýmý:" + sayi1*sayi2);}
else if(sayi1*sayi2<0) {System.out.println("Farklý iþaretteki sayýlarla iþlem yapamazsýnýz");}//sayýlarýn farklý karakterde oldugunu ogrenmek için iki sayýyý carparýz bu sayý sýfýrdan asagý olamaz.
else {System.out.println("sýfýr carpmaya göre yutan elamandýr.");} 

//1. if iþaretinden sonra bir sart icin "else if kullanýrýz sonrakinde yiene ifelse olur
//ancak son islemde sadece else yazarýz ve condition kýsmýný yapmayýz zaten baska sart kalmadýðý için. 
		
		
		
scan.close();	
		
		
		
		
	}

}
