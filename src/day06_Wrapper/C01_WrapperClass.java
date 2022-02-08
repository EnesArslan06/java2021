package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		// 
		
		//int sayi1=10;
		//Integer sayi2=20;
		
		//sayi. yazdýgýmýzda hicibir mehtod cýkmaz cunku sayi1 integerdar yani primitivedir.
		//sayi2 yazýp nokta koyarsan bir cok methot gelir. cunku sayi2 wrapperdýr nonprimitivedir.
		

	  //String tel1=3578987; týrnak içerisinde olmadýgý için kabul etmez.
	  
		String tel1="3578987";
		String tel2="3245424";
		System.out.println(tel1+tel2);//35789873245424 sonuncu cýkar. toplama yapmaz yan yana yazar.
		//bu sayýlarý toplamak istersek Stringi integere cevirmemiz lazým bunuda wrapper class yapar.
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel1)); //bu sekilde toplamýný verir
		System.out.println(Integer.MIN_VALUE);//-2147483648 integerin mýnumum degeridir
		System.out.println(Integer.MAX_VALUE);//2147483648 buda ýntegerin maximum degeridir.
		//syso nun icine Integer. yazdýgýmýzda bir cok mehtod cýkmaktadýr.
		
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308 bu sayýyý verir. Eden sonra 380 sonra
		//10 uzeri 380 uzanabilir degeri.
		
		System.out.println(Short.MAX_VALUE);//32767 maksimum degeri short sayýsýnýn.
		
		//String caddeNo= "203B";
		//String sokakNo= "1564"; //bu iki degeeri topla
		
		//System.out.println(Integer.valueOf(caddeNo)+ Integer.valueOf(sokakNo));// bu kod calýsmaz
		//cunku icinde sayýlar var ancak bir tanede olsa harf var. her string ifade Integere cevrilemez.
		//wrapper yapabilmemiz icin string olmasý lazým ama rakamsal degerlerden olusmasý lazým.
		//java NumberFormatException hatasý verir. Stop Execution hatasý verir.
		
	  //yukardaki hatalý iþlemden sonra java calýsmaz.
		 //duzeltilmiþ hali-B harfini cýkartýyoruz.
		
		String caddeNo1= "203";
		String sokakNo1= "1564"; 
		System.out.println(Integer.valueOf(caddeNo1)+ Integer.valueOf(sokakNo1));
		//suan duzeldý
	}

}
