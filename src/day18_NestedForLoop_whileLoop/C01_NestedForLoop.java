package day18_NestedForLoop_whileLoop;

import java.util.Scanner;

public class C01_NestedForLoop {

	public static void main(String[] args) {
		// For loop tekrarı
		//Kullanıcıdan 2 tam sayi isteyin, ilk sayidan baslayarak, ikinci sayiya kadar 3 er 3 er yazdırın
		//2. sayi dahil olmak zorunda degil.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("2 tane tam sayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
	if (sayi1>sayi2) {//azalarak gidecek
	
		for (int i =sayi1; i >=sayi2 ; i-=3) {//i 1 den baslayacak sayi2 den buyuk olana yani buyuklugu devam edene kadarkadar devam edecek
		//i den 3 cıkar
			System.out.print(i +" ");
		}
		
		
	} else if (sayi1<sayi2) {//sayi1 kucukse artarak gidecek bu durumlar icin iki ayrı loop yapacagız
	
		for (int i = sayi1; i <= sayi2; i+=3) {//sayi 1 sayi2 den kucukse kucuklugu devam edene kadar 3 artırarak devam edecek
			System.out.print(i+" ");
		}
	}else {System.out.println("Girilen sayilar esit");

	}	
scan.close();
	}

}
