package day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		
		 // 2- Verilen sayi1 ve sayi2 variable�larinin degerlerini 
        //    3.bir variable olmadan degistiren (SWAP) bir program yapiniz
        
       /* int sayi1=15;
        int sayi2=20;
        
        
        
        
        System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
		
        
        //ucuncu bir variable kullanmayacaksak, verilen iki say�n�n fark�ndan istifade ediyoruz
        //say�lar�n fark� 5, 1. say�ya 5 eklersek 2. say�y� buluruz, 2. say�dan 5 c�kart�rsak 1. say�y� buluruz.
        //ilk ad�m olarak say�lar�n fark�n� ilk say�ya assign ediyoruz
        
        sayi1= sayi1-sayi2;      // say� 1 den say� 2 yi c�kart�rsa -5 olur
        
        //2. ad�m fark ile say� 2yi toplay�p say� 2 ye assign ediyoruz. say� 2 nin 15 oldu�unu buluruz.
        
        sayi2=sayi1+sayi2;
        
        //3. ad�m olarak sayi1 e sayi2 -fark at�yorum.
        
        sayi1=sayi2-sayi1;  // sonu� say� 1 20 olur. yani say�2 :15 sayi1 -5    15-(-5)=20 sayi 20 olur 
        
        System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);		*/
        
        int sayi1=20;
        int sayi2=30;
        System.out.println("baslang�cta sayi1=" + sayi1 + " ve sayi2="+ sayi2);
        
        sayi1=sayi1-sayi2;
        sayi2=sayi2+sayi1;
        sayi1=sayi2-sayi1;
        
        System.out.println("sonucta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
        		
       
        int sayi3=50;
        int sayi4=75;
        
        System.out.println("Balang�cta Sayi3=" + sayi3 + " ve sayi4=" + sayi4);
        
        sayi3=sayi3-sayi4;
        sayi4=sayi3+sayi4;
        sayi3=sayi4-sayi3;
        
        
        System.out.println("Sonucta sayi3=" + sayi3 + " ve sayi4=" +sayi4);
        
		
		
		

	}

}
