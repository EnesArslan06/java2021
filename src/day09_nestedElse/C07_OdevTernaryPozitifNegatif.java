package day09_nestedElse;

import java.util.Scanner;

public class C07_OdevTernaryPozitifNegatif {

	public static void main(String[] args) {
		// Soru:4 Kullanicidan bir sayi alin Sayi pozitifse �Sayi pozitif� yazdirin, negatifse
		//sayinin karesini yazdirin

Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir sayi girin: ");
double sayi=scan.nextDouble();


//1. YONTEM
/*System.out.println(sayi==0 ? "Say� ne pozitif ne negatiftir" : 
		( sayi>0 ? "Girmis oldugunuz sayi Pozitiftir: " 
+ sayi : "Girmi� oldugunuz say� Negatiftir ve karesi al�nm�st�r: " + (sayi*sayi))); */
	
//YONTEM

String sonuc=sayi==0 ? "ne pozitif ne negatif" : (sayi>0 ? "pozitif say�d�r:" + sayi : "negatif say�d�r" + sayi);
System.out.println(sonuc);

scan.close();
	}}

