package day05_MatematikselIslemler;

public class C02_Matematiksel2 {

	public static void main(String[] args) {
	
		int sayi1=10;
		int sayi2=20;
		
		String str1="Ali";
		String str2="Can"; //str2 nin alt�ndaki cizginin anlam� sen bu stringi olusturdun ama hi� kullanmad�n
		//anlam�na gelir.yani java cel���r ama burda gereksiz bir i�lem oldugunu belirtir. 
		////scan�n alt�ndaki i�aret kaynak kacag� oldugunu belirtiyor.
		//scan� olusturdunuz ama i�lemi kapatmad�n�z. en sona gelim scan.close(); yapmak laz�m.
		//scan.close();
		
		System.out.println(sayi1+sayi2+str1); //sonuc: 30Ali
		System.out.println(str1+sayi1+sayi2); //sonuc: Ali1020
		
		//ilk i�lemde soldan saga gecer ilk i�lemde 10 ve 20 yi toplar. javada i�lemi soldan sa�a yapar
		//i�lem �ncelikleri ayn� ise
		//ikinci i�lemde string once oldugu i�in diger i�lemi g�rmez
		
		System.out.println(str1+ str2 +(sayi1+sayi2)); //parantez oldugu i�in AliCan30 sonucunu buluruz.
		System.out.println(str1+(sayi1*sayi2)); //Ali200
		System.out.println(str1+sayi1*sayi2); //Ali200 c�kar. i�lem �nceligi carpmada oldugu i�in once carpar sonra i�leme devam eder.
		
		
		
		
		
	}

}
