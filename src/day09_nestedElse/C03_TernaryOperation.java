package day09_nestedElse;

import java.util.Scanner;

public class C03_TernaryOperation {

	public static void main(String[] args) {
		// ternary Operator
		//if in daha bas�tlasm�s halidir.uzun kodlarda if else yaz�lmas� daha garanti olur.
		//ancak bazen kodun yaz�m� cok bas�t olabilir. bunun i�in if else yerine ternary kullanabiliriz.
		
	/*if(Condition) {code 1} else {code 2}	bu if yaz�m�
	Condition ? Code 1:Code 2    buda tenary operation
		
ternary i�lemi sonuc verir, bu i�lem bi variable ile atanarak kullan�l�r.
	int x=10;      (x/2==0) ? "Cift say�" : "Tek sayi"
	
	*/
Scanner scan=new Scanner(System.in);
int x=10;      
  //x%2==0 ? "Cift say�" : "Tek sayi"  //kodu kabul etmedi atama yapmam�z laz�m yani bir veriable olusturmam�zlaz�m
String tekMiCiftMi=x%2==0 ? "Cift say�" : "Tek sayi";  //bu sekilde yaz�l�rsa kabul eder. 
//bana g�nderecegi ifade "tekmi cift mi" oldugu i�in String olur. eger sayi verecek olsayd� int variable olusturacakt�m
//ternary iki turlu kullan�labilir. ya d�nen sonuca g�rebir variable olusturup assign ederiz. veya direk syso nun i�ine yazabiliriz.


	System.out.println(x>5 ? "Aferin" : 4);	//aferin yazd�rd�. bu sekildede yaz�abilir.
	
	// sonuc=x>5 ? "Aferin" : 4 ; //dedigimizde, eger ternary dedonecek data t�rlerindenayn�s� degilse atama yapamay�z.
									 //sadece syso ile yazabiliriz. burada String yaparsak javakabul etmez cunku 4 rakam� var.
	 
	 System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
     
     // ternary iki turlu kullanilabilir
     // ya donen sonuca gore bir variable olusturup assign ederiz
     // veya direk syso icine yazip sonucu yazdiririz
	
	
	}
	
	

}
