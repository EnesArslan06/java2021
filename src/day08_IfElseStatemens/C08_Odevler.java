package day08_IfElseStatemens;

import java.util.Scanner;

public class C08_Odevler {

	public static void main(String[] args) {
		/*Soru:1 -Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu 
		birbirine esit ise ekrana �Eskenar ucgen� yazdirin. iki kenar esitse "ikiz kenar Ucgen"
		yazd�r�n Diger durumlarda ekrana 
		�Cesit Kenar ucgen � yazdirin.*/
		
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir ucgenin kenarlar�n� belirten uc tane say� yaz�n�z\nilk sayidan sonra diger sayilar i�in enter'e bas�niz");

double kenar1=scan.nextDouble();
double kenar2=scan.nextDouble();
double kenar3=scan.nextDouble();

if (kenar1==kenar2 && kenar1==kenar3) {System.out.println("Eskenar Ucgen");} 
else if((kenar1==kenar2 && kenar1!=kenar3) || (kenar2==kenar3 && kenar2!=kenar1) || (kenar1==kenar3 && kenar1!=kenar2))
{System.out.println("ikiz kenar ucgen");}
else {System.out.println("Cesit Kenar Ucgen");}

scan.close();



	}

}
