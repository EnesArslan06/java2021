package day08_IfElseStatemens;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// Kullan�c�dan uc kenar uzunlugunu al�n uc es kenar birbirine esitse "eskenar ucgen" yazd�r�n
		//Diger durumlarda eskenar degildir yazd�r�n.
		//Bir Strink ifadesinin icinde \n harfinin g�rdukten sonra alt sat�ra gecer.

		
		Scanner scan=new Scanner(System.in);
System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz");
double kenar1=scan.nextDouble();
System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz");
double kenar2=scan.nextDouble();
System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz");
double kenar3=scan.nextDouble();

if (kenar1==kenar2 && kenar2==kenar3) {System.out.println("Eskenar ucgen");} 
else {System.out.println("Eskenar ucgen degil");}
	
/*bunu ayr� ayr� sormaktansa \n ile sat�rlar� asag� kayd�rarak syso yap�l�p sorulabilir.
System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz ve entera bas�n�n \n Lutfen diger uzunlugu girip entera bas�n"
		 "\n lutfen diger uzunlugu giriniz "); dedikten sonra art arda uc tane
		 double kenar1=scan.nextDouble();
		 double kenar1=scan.nextDouble(); 
		 double kenar1=scan.nextDouble(); 
		  derseniz artarda sorar.*/
scan.close();	
	}

}
