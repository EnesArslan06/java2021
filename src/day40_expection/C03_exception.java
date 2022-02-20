package day40_expection;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit;

public class C03_exception {

	public static void main(String[] args) {
		// verilen bir int array icin kullan�can sayi isteyin ve girilen sayiyi index olarak kabul edip o
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
		
		
		
		//mesela kullan�c� 12 girdi s�n�rlarin disinda diye exception verir.
	//mesela "e" girdi ozaman "java.util.InputMismatchException" hatasi verdi.
	//if else ile cozebiliriz ancak o  zaman butun ihtimalleri degerlendirmemiz laz�m
	
	//ArrayIndexOutOfBoundsException kullan�c� 20 girerse bu hatayi verir
	//InputMismatchException kullan�c� sayi girdi isede bu hatayi verir.
		
	//try catch blogu kullanmal�y�z	
		
	//ikili oldugunda bu hatalari ortadan kald�r�yor, ard arda catch yazmaliyiz.
	
		
		
		
		
		
	}

}
