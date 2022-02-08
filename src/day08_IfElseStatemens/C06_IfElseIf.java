package day08_IfElseStatemens;

import java.util.Scanner;

public class C06_IfElseIf {

	public static void main(String[] args) {
		/* Kullanicidan 100 uzerinden notunu isteyin. 
		Not’u harf sistemine cevirip yazdirin
		0 dan kucuk veya 100 den buyukse gecerli bir not yazýnýz.  
		50’den kucukse “D”, 50-60 arasi “C”, 
		60-80 arasi “B”, 80’nin uzerinde ise “A”-   */

Scanner scan=new Scanner(System.in);

System.out.println("Notunuzu Yazýnýz:");
double not=scan.nextDouble();

if (not<0 || not>100) {System.out.println("Lutfen gecerli Bir not yazýnýz");} 
else if(not<50){System.out.println("Notunuz: D");} //2. satýra geldigimizde notun 50den kucuk olma durumunu belirtmiþtik.
else if(not<60) {System.out.println("Notunuz: C");}//yani 0 dan 100 ekadar olanlarý dusunsek 0-50 arasýný 2. if not<50 dedigimizde 50 ye kadar olanlarý zaten yerini belirtmiþ olduk
else if(not<80) {System.out.println("Notunuz: B");}//buradada 60 a kadar olan kýsmý kodlamýstýk 50 ile 60 3. sarttaydý.
else {System.out.println("Notunuz: A");} // en sonda zaten sart kalmadýgý içi 80 den yukarýsý zaten A olur mesela 150 verse ilk sartta gecerli bir not olarak not cýkar. 
		 
scan.close();		
	}

}
