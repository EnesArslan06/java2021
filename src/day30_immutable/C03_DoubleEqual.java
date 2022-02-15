package day30_immutable;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		
	String str1="Mustafa";	
	String str2="Mustafa";
	
	String str3=new String("Mustafa");
	String str4=new String("Mustafa");
	
	System.out.println(str1==str3);//cvp false oldu. String ifadelerde equals kullan�lmas� laz�m referanslardan dolayi
	//yanlis sonuclar verebilir. "==" hem degere hem referansa bakar, farkli stringler oldugu icin referanslarada baktigi icin
	//yanlis sonucu verir.
	
	System.out.println(str1.equals(str3));//true verir 
	
	System.out.println(str1==str2);//sonuc true verdi
	
	//java once esitligin sag�na  bakt�g� icin once new kelimesini g�rur sonra degeri atar.
	//yani new li yazarsak her zaman yeni bir obje olusur ve referans�da olusur-
	//Java Stringin String Havuzunda olup olmad��g�n� kontrol eder
	
	
	
	
	}}