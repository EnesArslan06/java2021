package day12_StringManipulationMethods;

import java.util.Scanner;

public class C06_ContainsSoru {

	public static void main(String[] args) {
		/*Kullanicidan email adresini girmesini isteyin, mail @gmail.com
		icermiyor �lutfengmail adresinizi girin�, @gmail.com ile bitiyorsa� gmail mail adresiniz
		kaydedildi., @gmail.com ile bitmiyorsa "Lutfen yaz�m� kontrol edin yazd�r�n.*/
		

	Scanner scan=new Scanner(System.in);	
	System.out.println("Gmail adresinizi giriniz");
	String mail=scan.next();//mail adresi tek kelimeden olusur, bosluk kabul etmez.
	
	int uzunluk=mail.length();
	int index=mail.indexOf("@gmail.com");
	
	if (!mail.contains("@gmail.com")) {System.out.println("Lutfen gmail adresi giriniz");}  //iceriyorsay� i�ermiyorsa yapmak i�in bas�na unlem koymam�z laz�m
	else if(index==uzunluk-10){System.out.println("Email adresiniz kaydedildi");}
	else {System.out.println("Lutfen yaz�m� kontrol ediniz");}	

//sonu @gmail.com olarak bitecek. Bunun icinde  length kullanabilirz ve intindex lastindex kullanabiliriz	
	//(uzunluk-10) @gmail.com 10 karakterdir. son index==uzunluk(length)-10
//indexof da kullanabiliriz lasrt indexofda kullanabiliriz.
scan.close();	
	
	
}}