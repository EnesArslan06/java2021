package day09_nestedElse;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
		/*Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
	    Kullanicidan bir sifre girmesini isteyin
	    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. 
	    Ilk harf A ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
	    Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. 
	    Ilk harf z ise   “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.*/
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen bir sifre belirtiniz");
char ilkkarakter=scan.next().charAt(0);				//buyuk harfleri secmis olacaz karaklterin ilk harfi buyuk olacak
if (ilkkarakter>='A' && ilkkarakter<='Z') {if (ilkkarakter=='A') {System.out.println("Gecerli Sifre");} 
else {System.out.println("Gecersiz sifre");}}


else if (ilkkarakter>='a' && ilkkarakter<='z') {if (ilkkarakter=='z') {System.out.println("Gecerli sifre");}  //kucuk harfleri secer
else {System.out.println("Gecersiz Sifre");}}
	  
else {System.out.println("Sifrenin gecerli olması için harf ile baslayınız");}	//geriye kalan tum karakterler	

	

scan.close();

}}
