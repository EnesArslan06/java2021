package day14_MethodOlusturma;

import java.util.Scanner;

public class C03_MethodOlusturmaSoru {

	public static void main(String[] args) {
		// Kullanýcýdan iki sayi isteyin sayýlarýn karelerini ve kuplarýný toplayýp yazdýran
		//iki ayrý method yazýn. Kullanýcýya us sorun 
		//iki yazarsa kareleri toplamýný yapan mehtod
		//3 yazarsa kuplaer toplamýný yapan method calýssýn.

Scanner scan=new Scanner(System.in); 
System.out.println("Lutfen bir sayi belirtin:  \nLutfen bir sayý daha belirtin: "
		+ "\nLutfen karesinin toplamý için 2'ye "
		+ "kupunun toplamý için 3'e basýnýz: ");

double sayi1=scan.nextDouble();
double sayi2=scan.nextDouble();
int tercih=scan.nextInt();
double kuptoplam2=kuptoplami(sayi1, sayi2);
if (tercih>3 || tercih<2) {System.out.println("Lutfen Gecerli bir tercih belirtiniz...");}
else if (tercih==2) { karetoplami(sayi1, sayi2);}
else if (tercih==3) {
System.out.println(kuptoplam2);}
	

	
scan.close();

}

	public static double kuptoplami(double sayi1, double sayi2) {
			double
			kuptoplam=(sayi1*sayi1*sayi1) + (sayi2*sayi2*sayi2);
			return kuptoplam;
	}

	private static void karetoplami(double sayi1, double sayi2) {
		System.out.println("Karesinin Toplami: " + ((sayi1*sayi1) + (sayi2*sayi2)));
		
	}	
	
	
	
}	

