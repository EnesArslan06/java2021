package day19_DoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoopSoru {

	public static void main(String[] args) {
		 /*Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane
		olduklarini ekranda yazdirin	*/	

	Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz");				
		int sayi=scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.print(bolen+" ");
				sayac++;
			}
		bolen++;
		}
		System.out.println(" ");//alt satýra gecmesi icin yaptýk bu syso yu
		System.out.println(sayi+ "sayisinin " + sayac + "adet tam boleni vardir");	
scan.close();	
}}	


