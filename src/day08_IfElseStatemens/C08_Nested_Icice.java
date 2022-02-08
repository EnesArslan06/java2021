package day08_IfElseStatemens;

import java.util.Scanner;

public class C08_Nested_Icice {

	public static void main(String[] args) {
		// Eger calısan kadınsa 60 yasından buyukse emekli olabilir.
		//calısan erkekse 65 yasından buyukse emekli olabilir.
		
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen cinsiyetinizi belirtinin Erkek ini E, Kadın icin K");
char cinsiyet=scan.next().toUpperCase().charAt(0);

System.out.println("Lutfen yasınızı giriniz:");
double yas=scan.nextDouble();
if (cinsiyet=='E') {if (yas>=65) {System.out.println("Emekli olabilirsin");} else {System.out.println("Emekli olamazsın");}} 
else if(cinsiyet=='K'){if (yas>=60) {System.out.println("Emekli olabilirsin");} else {System.out.println("Emekli olamazsın");}}	
else {System.out.println("Lutfen cinsiyetiçin gecerli bir harf secin");} //burası yanlış girmesinde uyarı içindir.
	
	scan.close();
	
	}

}
