package day08_IfElseStatemens;

import java.util.Scanner;

public class C06_IfElseIf {

	public static void main(String[] args) {
		/* Kullanicidan 100 uzerinden notunu isteyin. 
		Not�u harf sistemine cevirip yazdirin
		0 dan kucuk veya 100 den buyukse gecerli bir not yaz�n�z.  
		50�den kucukse �D�, 50-60 arasi �C�, 
		60-80 arasi �B�, 80�nin uzerinde ise �A�-   */

Scanner scan=new Scanner(System.in);

System.out.println("Notunuzu Yaz�n�z:");
double not=scan.nextDouble();

if (not<0 || not>100) {System.out.println("Lutfen gecerli Bir not yaz�n�z");} 
else if(not<50){System.out.println("Notunuz: D");} //2. sat�ra geldigimizde notun 50den kucuk olma durumunu belirtmi�tik.
else if(not<60) {System.out.println("Notunuz: C");}//yani 0 dan 100 ekadar olanlar� dusunsek 0-50 aras�n� 2. if not<50 dedigimizde 50 ye kadar olanlar� zaten yerini belirtmi� olduk
else if(not<80) {System.out.println("Notunuz: B");}//buradada 60 a kadar olan k�sm� kodlam�st�k 50 ile 60 3. sarttayd�.
else {System.out.println("Notunuz: A");} // en sonda zaten sart kalmad�g� i�i 80 den yukar�s� zaten A olur mesela 150 verse ilk sartta gecerli bir not olarak not c�kar. 
		 
scan.close();		
	}

}
