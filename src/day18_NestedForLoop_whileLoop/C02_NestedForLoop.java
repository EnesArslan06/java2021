package day18_NestedForLoop_whileLoop;


import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 10 dan kucuk pozitif bir rakam girmesini isteyin ve girilen
		 * rakama gore asagidaki sekli cizdirin or; 1 1 2 1 2 3
		 *
		 * * * * * * *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("10 dan kucukpozitif bir tam sayi giriniz");

		int sayi = scan.nextInt();

		// for (int i = 1; i <= sayi; i++) { //bu sekilde yanyana girmiþ oldugumuz
		// sayýyý yan yana yazar arada boslukla
		// System.out.print(i+ " ");
		for (int satir = 1; satir <= sayi; satir++) {
			for (int i = 1; i <= satir; i++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
scan.close();
	}
}
