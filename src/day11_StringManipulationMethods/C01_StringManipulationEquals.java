package day11_StringManipulationMethods;

public class C01_StringManipulationEquals {

	public static void main(String[] args) {
		/*equals methodu=verilen iki string seceneginin esit olup olmad�g�n� kontrol eder.
		equals
		Vs ==
		(
		Interview Sorusu
		equals()
		methodu verilen iki String�in iceriginin birbirine esit olup olmadigini kontrol eder
		
	==	karsilastirma operatoru ise verilen iki String objesinin degerinin yaninda
		reference(adres)�larine da bakar,
		Ayni degere sahip olsa da farkli iki objeyi ile karsilastirdigimizda sonuc FALSE olur*/

	
int a=10;
int b=a+0;
System.out.println(a==b); //Stringde geerrli olmaz int de a=b olur sonuc true c�kar.

String str1="Ali";
String str2="Can";
String str3="Ali Can";
String str4=str1 + " " + str2;
System.out.println(str4);// Ali Can verir
System.out.println(str3==str4); //false verir sonuc degerler farkl� i�erik ayn� olabilir ama

//str3 ile str4 un hem i�erigine hem referanslar�na bakar i�erik ayn� olabilir ama referrans farkl� oldugu 
//esitmi diye sordygynda esit degil false sonucuna bakar.
//equals ile yazarsak referansa bakmaz sadece degere yani i�erige bakar.

System.out.println(str3.equals(str4));//sonuc true verdi. cunku equals ile yapt�k. oda referansa bakmad� 
// degere bakt� sonuc  ikisindede "Ali Can" c�kt�g� i�in esitlige true verdi.


}}