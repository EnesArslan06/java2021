package day08_IfElseStatemens;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// Kullanýcýdan uc kenar uzunlugunu alýn uc es kenar birbirine esitse "eskenar ucgen" yazdýrýn
		//Diger durumlarda eskenar degildir yazdýrýn.
		//Bir Strink ifadesinin icinde \n harfinin gördukten sonra alt satýra gecer.

		
		Scanner scan=new Scanner(System.in);
System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz");
double kenar1=scan.nextDouble();
System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz");
double kenar2=scan.nextDouble();
System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz");
double kenar3=scan.nextDouble();

if (kenar1==kenar2 && kenar2==kenar3) {System.out.println("Eskenar ucgen");} 
else {System.out.println("Eskenar ucgen degil");}
	
/*bunu ayrý ayrý sormaktansa \n ile satýrlarý asagý kaydýrarak syso yapýlýp sorulabilir.
System.out.println("Lutfen ucgenin bir kenar uzunlugunu giriniz ve entera basýnýn \n Lutfen diger uzunlugu girip entera basýn"
		 "\n lutfen diger uzunlugu giriniz "); dedikten sonra art arda uc tane
		 double kenar1=scan.nextDouble();
		 double kenar1=scan.nextDouble(); 
		 double kenar1=scan.nextDouble(); 
		  derseniz artarda sorar.*/
scan.close();	
	}

}
