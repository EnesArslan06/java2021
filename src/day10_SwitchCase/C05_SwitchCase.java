package day10_SwitchCase;

public class C05_SwitchCase {

	public static void main(String[] args) {
		// harf olarak girilen notu rakama cevirin?

char not='D';		

switch(not) {

case 'A' : 
	System.out.println("85 ve 100 aras�");
	break;

case 'B' :
	System.out.println("65 ve 85 aras�"); 
	break;

case 'C' : 
	System.out.println("50 ve 65 aras�"); 
	break;

case 'D' : 
	System.out.println("50 den dusuk");
	break;

default : 
	System.out.println("Gecersiz Karakter");
	break;

}	
	}

}
