package day16_forLoop;

public class C01_forLoop {

	public static void main(String[] args) {
		// for loop baslang�c ve biti� sarti bir sayinin degerine bagli olan durumlarda
		//tercih edilir
		//i s�f�rdan baslar 10 dan kucuk olana kadar devam eder yani 1 den 10 a kadar yazd�r�r.
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");}
		
/*for (int i = 0; i < 10; i--) {  //burada -- koydugumuzi�in art�ya dogru gitmemizgerekir ancak 
										//sonsuza kadar gider konsolda cal�smaya devam eder .
System.out.println(i+" ");}}  //biti� sart�na ulas�lamayan durumlarda sonsuz loop olusur
										//burada kodlama hatas� vard�r.
	
	eger baslang�c sayisi artis azalis ile bitis degerine yaklasmiyor uzaklas�yor ise loop hicbir zaman
	durmaz. yada bilgisayar ram doluncaya kadar devam eder*/
	
/*for (int i = 0; i > 10; i++) {
	System.out.print(i+" acaba calisirmi");} *///calismaz ilk deger i=0 caismasi icin ilk kodda hatan�n olmamasi
//lazim ilk baslangici yanlis oldugu icin for calisir ancak bady calismaz. eger ilk sart true olmazsa 
//ilk adimda loop broken olur loop body hic calismadan loopun sonrasina gecilir. 
//loop calisir ama hicbir islem yapmaz.


		
		
		
		
		
		
	}}
