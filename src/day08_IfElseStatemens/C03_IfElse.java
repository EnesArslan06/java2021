package day08_IfElseStatemens;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		// Kullanýcýdan yasýný sorun. Eger 65 yasýndan kucukse emeklý olamazsýn buyukse
		//emekli olabilirsin yazdýrýn.
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen Yasýnýzý yazýnýz:");
int yas=scan.nextInt();
if(yas>=65) {System.out.println("Emekli olabilirsiniz.");} 
else {System.out.println("Emekli olamazsýnýz Calýsmalýsýnýz");}



scan.close();
	}

}
