package day16_forLoop;

public class C01_forLoop {

	public static void main(String[] args) {
		// for loop baslangýc ve bitiþ sarti bir sayinin degerine bagli olan durumlarda
		//tercih edilir
		//i sýfýrdan baslar 10 dan kucuk olana kadar devam eder yani 1 den 10 a kadar yazdýrýr.
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");}
		
/*for (int i = 0; i < 10; i--) {  //burada -- koydugumuziçin artýya dogru gitmemizgerekir ancak 
										//sonsuza kadar gider konsolda calýsmaya devam eder .
System.out.println(i+" ");}}  //bitiþ sartýna ulasýlamayan durumlarda sonsuz loop olusur
										//burada kodlama hatasý vardýr.
	
	eger baslangýc sayisi artis azalis ile bitis degerine yaklasmiyor uzaklasýyor ise loop hicbir zaman
	durmaz. yada bilgisayar ram doluncaya kadar devam eder*/
	
/*for (int i = 0; i > 10; i++) {
	System.out.print(i+" acaba calisirmi");} *///calismaz ilk deger i=0 caismasi icin ilk kodda hatanýn olmamasi
//lazim ilk baslangici yanlis oldugu icin for calisir ancak bady calismaz. eger ilk sart true olmazsa 
//ilk adimda loop broken olur loop body hic calismadan loopun sonrasina gecilir. 
//loop calisir ama hicbir islem yapmaz.


		
		
		
		
		
		
	}}
