package day08_IfElseStatemens;

import java.util.Scanner;

public class CaySekerSorusu {

	public static void main(String[] args) {
		/*Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun. 
		Bir yilda kac kg seker kullandigini hesaplayip yazdirin 
		1 seker = 1.7 gr
		Eger kullanici seker kullanmiyorsa (seker sayisi=0)
		 “Cok guzel sifir seker saglikli yasam ” yazdirin*/

		Scanner scan=new Scanner(System.in);
System.out.println("Lutfen gunde kac bardak cay içtiginizi belirtiniz... \n"
		+ "bir bardak caya kac tane kesme seker attýgýnýzý belirtiniz");
int caysayisi=scan.nextInt();
int seker=scan.nextInt();

 int toplamcay=caysayisi*365;
 double toplamseker=(toplamcay*seker*1.7)/1000;
 
 if (toplamseker>0){System.out.println("1 yýlda tukettiginiz seker miktarý: " + toplamseker + "kilogramdýr.");
	
} else if(toplamseker==0){System.out.println("Cok guzel sifir seker saglikli yasam");

}else {System.out.println("Gecerli bir giris yapiniz...");}

System.out.println("Lutfen bir cumle yazýnýz");
String cumle=scan.nextLine();
System.out.println("Lutfen cumledeki bir karakterin varlýgý tespit icin karakter kelime giriniz");
String krt=scan.next();

int  sonuc=cumle.indexOf(krt);

System.out.println(sonuc);

	
	
	
	
	
	
}}
