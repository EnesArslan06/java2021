package day09_nestedElse;

import java.util.Scanner;

public class C07_OdevTernaryPozitifNegatif {

	public static void main(String[] args) {
		// Soru:4 Kullanicidan bir sayi alin Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
		//sayinin karesini yazdirin

Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir sayi girin: ");
double sayi=scan.nextDouble();


//1. YONTEM
/*System.out.println(sayi==0 ? "Sayý ne pozitif ne negatiftir" : 
		( sayi>0 ? "Girmis oldugunuz sayi Pozitiftir: " 
+ sayi : "Girmiþ oldugunuz sayý Negatiftir ve karesi alýnmýstýr: " + (sayi*sayi))); */
	
//YONTEM

String sonuc=sayi==0 ? "ne pozitif ne negatif" : (sayi>0 ? "pozitif sayýdýr:" + sayi : "negatif sayýdýr" + sayi);
System.out.println(sonuc);

scan.close();
	}}

