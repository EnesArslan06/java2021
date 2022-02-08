package day17_forLoop;

import java.util.Scanner;

public class C01_forLoopSoru {

	public static void main(String[] args) {
		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar
		//3’un veya 5”in kati olan sayilari yazdirin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
		double sayi=scan.nextDouble();
		int sayi2=(int) sayi;

		if (sayi<0) {
			System.out.println("Negatif sayi giremezsiniz...");	
		} else if (sayi!=sayi2) {System.out.println("Lutfen Tam sayi giriniz");    
		} else if(sayi>100)System.out.println("100 den buyuk bir sayi giremezsiniz");
		else{ for (int i =1 ;  i<=sayi ; i++) {  					
				if (i%3==0 || i%5==0) {System.out.println(i + " ");}} 

		}{
		}			

	
scan.close();	

	}}
