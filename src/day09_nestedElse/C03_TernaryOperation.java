package day09_nestedElse;

import java.util.Scanner;

public class C03_TernaryOperation {

	public static void main(String[] args) {
		// ternary Operator
		//if in daha basýtlasmýs halidir.uzun kodlarda if else yazýlmasý daha garanti olur.
		//ancak bazen kodun yazýmý cok basýt olabilir. bunun için if else yerine ternary kullanabiliriz.
		
	/*if(Condition) {code 1} else {code 2}	bu if yazýmý
	Condition ? Code 1:Code 2    buda tenary operation
		
ternary iþlemi sonuc verir, bu iþlem bi variable ile atanarak kullanýlýr.
	int x=10;      (x/2==0) ? "Cift sayý" : "Tek sayi"
	
	*/
Scanner scan=new Scanner(System.in);
int x=10;      
  //x%2==0 ? "Cift sayý" : "Tek sayi"  //kodu kabul etmedi atama yapmamýz lazým yani bir veriable olusturmamýzlazým
String tekMiCiftMi=x%2==0 ? "Cift sayý" : "Tek sayi";  //bu sekilde yazýlýrsa kabul eder. 
//bana gönderecegi ifade "tekmi cift mi" oldugu için String olur. eger sayi verecek olsaydý int variable olusturacaktým
//ternary iki turlu kullanýlabilir. ya dönen sonuca görebir variable olusturup assign ederiz. veya direk syso nun içine yazabiliriz.


	System.out.println(x>5 ? "Aferin" : 4);	//aferin yazdýrdý. bu sekildede yazýabilir.
	
	// sonuc=x>5 ? "Aferin" : 4 ; //dedigimizde, eger ternary dedonecek data türlerindenaynýsý degilse atama yapamayýz.
									 //sadece syso ile yazabiliriz. burada String yaparsak javakabul etmez cunku 4 rakamý var.
	 
	 System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
     
     // ternary iki turlu kullanilabilir
     // ya donen sonuca gore bir variable olusturup assign ederiz
     // veya direk syso icine yazip sonucu yazdiririz
	
	
	}
	
	

}
