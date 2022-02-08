package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		// 
		
		//int sayi1=10;
		//Integer sayi2=20;
		
		//sayi. yazd�g�m�zda hicibir mehtod c�kmaz cunku sayi1 integerdar yani primitivedir.
		//sayi2 yaz�p nokta koyarsan bir cok methot gelir. cunku sayi2 wrapperd�r nonprimitivedir.
		

	  //String tel1=3578987; t�rnak i�erisinde olmad�g� i�in kabul etmez.
	  
		String tel1="3578987";
		String tel2="3245424";
		System.out.println(tel1+tel2);//35789873245424 sonuncu c�kar. toplama yapmaz yan yana yazar.
		//bu say�lar� toplamak istersek Stringi integere cevirmemiz laz�m bunuda wrapper class yapar.
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel1)); //bu sekilde toplam�n� verir
		System.out.println(Integer.MIN_VALUE);//-2147483648 integerin m�numum degeridir
		System.out.println(Integer.MAX_VALUE);//2147483648 buda �ntegerin maximum degeridir.
		//syso nun icine Integer. yazd�g�m�zda bir cok mehtod c�kmaktad�r.
		
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308 bu say�y� verir. Eden sonra 380 sonra
		//10 uzeri 380 uzanabilir degeri.
		
		System.out.println(Short.MAX_VALUE);//32767 maksimum degeri short say�s�n�n.
		
		//String caddeNo= "203B";
		//String sokakNo= "1564"; //bu iki degeeri topla
		
		//System.out.println(Integer.valueOf(caddeNo)+ Integer.valueOf(sokakNo));// bu kod cal�smaz
		//cunku icinde say�lar var ancak bir tanede olsa harf var. her string ifade Integere cevrilemez.
		//wrapper yapabilmemiz icin string olmas� laz�m ama rakamsal degerlerden olusmas� laz�m.
		//java NumberFormatException hatas� verir. Stop Execution hatas� verir.
		
	  //yukardaki hatal� i�lemden sonra java cal�smaz.
		 //duzeltilmi� hali-B harfini c�kart�yoruz.
		
		String caddeNo1= "203";
		String sokakNo1= "1564"; 
		System.out.println(Integer.valueOf(caddeNo1)+ Integer.valueOf(sokakNo1));
		//suan duzeld�
	}

}
