package day07_If;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		// Kullan�c�dan dikdortgen kenar uzunluklar�n� isteyin;
		//ve dikdortgenin kare olup olmad�g�n� yazd�r�n
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Dikdortgenin kenar uzunlugunu girin:");
		double kenar1=scan.nextDouble();
		System.out.println("Lutfen Dikdortgenin digeer kenar uzunlugunu girin:");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {System.out.println("girilen dikdortgen kare");	}
		if (kenar1!=kenar2) {System.out.println("girilen dikdortgen kare degil");	}
	
		
		scan.close();
	}

}
