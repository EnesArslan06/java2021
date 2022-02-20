package day40_expection;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit;

public class C03_exception {

	public static void main(String[] args) {
		// verilen bir int array icin kullanýcan sayi isteyin ve girilen sayiyi index olarak kabul edip o
		//indexdeki elementi yazdirin.
		
		int arr[]= {2,3,4,5,6,2,7,9,1};
		
		try {
			
		
		
		Scanner scan=new Scanner(System.in);
System.out.println("Elementi yazdirmak icin index giriniz");
	
		int index=scan.nextInt();
		
		System.out.println("girdiginiz indexdeki element: " + arr[index]);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiginiz index arrrayde yok");
		}catch (InputMismatchException e) {
			System.out.println("Girdiginiz index pozitif tam sayi olmalidir");
		}
		
		
		
		//mesela kullanýcý 12 girdi sýnýrlarin disinda diye exception verir.
	//mesela "e" girdi ozaman "java.util.InputMismatchException" hatasi verdi.
	//if else ile cozebiliriz ancak o  zaman butun ihtimalleri degerlendirmemiz lazým
	
	//ArrayIndexOutOfBoundsException kullanýcý 20 girerse bu hatayi verir
	//InputMismatchException kullanýcý sayi girdi isede bu hatayi verir.
		
	//try catch blogu kullanmalýyýz	
		
	//ikili oldugunda bu hatalari ortadan kaldýrýyor, ard arda catch yazmaliyiz.
	
		
		
		
		
		
	}

}
