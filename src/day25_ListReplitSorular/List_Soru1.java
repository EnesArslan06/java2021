package day25_ListReplitSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.naming.BinaryRefAddr;

import day07_If.C01_BasitIfCumleleri;

public class List_Soru1 {
	/*Write a Java program to get a String from user as input and find 
	 * the maximum occurring character in that string. (Ignore case sensitivity)
	input :
	Learning java is easy
	output:
	maximum occurring character is : a
	*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Cumle giriniz");
		String cumle = scan.nextLine();

		// Stringdeki her eleman sarta sokulacak en cok olan elemaný yazdýracak
		// tekrar edenleri Liste atacaz sonra yazdýracaz listi.

		String array[] = cumle.split("");// stryi hiclige gore parcaliyor ve arrayin her bir elemani yaptik

		String enCokTekrarEden= "";
		int sayac = 0;
		int maxSayac = 0;

		for (int i = 0; i < array.length; i++) {// mesela ilk harfi kendisinden sonra gelen harfler kadar tekrar ediyot
												// bir for daha
			for (int j = i + 1; j < array.length; j++) {// karsilastiran kararkter kontrolü, ilk harfden sonra
														// baslayacak

				if (array[i].equalsIgnoreCase(array[j])) { // aldýgýn iler j ile esitse bunlari saydýracaz
					// esit karakter kontrolu
					sayac++;

				}

			}
			if (sayac > maxSayac) {
				maxSayac = sayac;
				enCokTekrarEden= array[i];
			} else if (sayac == maxSayac) {
				enCokTekrarEden+=", "+ array[i];
			}
			sayac = 0;
		}
		System.out.println(enCokTekrarEden);
	}
}

