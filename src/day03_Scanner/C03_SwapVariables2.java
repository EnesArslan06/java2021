package day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		
		 // 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 
        //    3.bir variable olmadan degistiren (SWAP) bir program yapiniz
        
       /* int sayi1=15;
        int sayi2=20;
        
        
        
        
        System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
		
        
        //ucuncu bir variable kullanmayacaksak, verilen iki sayının farkından istifade ediyoruz
        //sayıların farkı 5, 1. sayıya 5 eklersek 2. sayıyı buluruz, 2. sayıdan 5 cıkartırsak 1. sayıyı buluruz.
        //ilk adım olarak sayıların farkını ilk sayıya assign ediyoruz
        
        sayi1= sayi1-sayi2;      // sayı 1 den sayı 2 yi cıkartırsa -5 olur
        
        //2. adım fark ile sayı 2yi toplayıp sayı 2 ye assign ediyoruz. sayı 2 nin 15 olduğunu buluruz.
        
        sayi2=sayi1+sayi2;
        
        //3. adım olarak sayi1 e sayi2 -fark atıyorum.
        
        sayi1=sayi2-sayi1;  // sonuç sayı 1 20 olur. yani sayı2 :15 sayi1 -5    15-(-5)=20 sayi 20 olur 
        
        System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);		*/
        
        int sayi1=20;
        int sayi2=30;
        System.out.println("baslangıcta sayi1=" + sayi1 + " ve sayi2="+ sayi2);
        
        sayi1=sayi1-sayi2;
        sayi2=sayi2+sayi1;
        sayi1=sayi2-sayi1;
        
        System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
        		
       
        int sayi3=50;
        int sayi4=75;
        
        System.out.println("Balangıcta Sayi3=" + sayi3 + " ve sayi4=" + sayi4);
        
        sayi3=sayi3-sayi4;
        sayi4=sayi3+sayi4;
        sayi3=sayi4-sayi3;
        
        
        System.out.println("Sonucta sayi3=" + sayi3 + " ve sayi4=" +sayi4);
        
		
		
		

	}

}
