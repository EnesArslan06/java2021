package day05_MatematikselIslemler;

public class C02_Matematiksel2 {

	public static void main(String[] args) {
	
		int sayi1=10;
		int sayi2=20;
		
		String str1="Ali";
		String str2="Can"; //str2 nin altýndaki cizginin anlamý sen bu stringi olusturdun ama hiç kullanmadýn
		//anlamýna gelir.yani java celýþýr ama burda gereksiz bir iþlem oldugunu belirtir. 
		////scanýn altýndaki iþaret kaynak kacagý oldugunu belirtiyor.
		//scaný olusturdunuz ama iþlemi kapatmadýnýz. en sona gelim scan.close(); yapmak lazým.
		//scan.close();
		
		System.out.println(sayi1+sayi2+str1); //sonuc: 30Ali
		System.out.println(str1+sayi1+sayi2); //sonuc: Ali1020
		
		//ilk iþlemde soldan saga gecer ilk iþlemde 10 ve 20 yi toplar. javada iþlemi soldan saða yapar
		//iþlem öncelikleri ayný ise
		//ikinci iþlemde string once oldugu için diger iþlemi görmez
		
		System.out.println(str1+ str2 +(sayi1+sayi2)); //parantez oldugu için AliCan30 sonucunu buluruz.
		System.out.println(str1+(sayi1*sayi2)); //Ali200
		System.out.println(str1+sayi1*sayi2); //Ali200 cýkar. iþlem önceligi carpmada oldugu için once carpar sonra iþleme devam eder.
		
		
		
		
		
	}

}
