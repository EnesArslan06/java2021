package day08_IfElseStatemens;

import java.util.Scanner;

public class C08_Nested_Icice {

	public static void main(String[] args) {
		// Eger cal�san kad�nsa 60 yas�ndan buyukse emekli olabilir.
		//cal�san erkekse 65 yas�ndan buyukse emekli olabilir.
		
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen cinsiyetinizi belirtinin Erkek ini E, Kad�n icin K");
char cinsiyet=scan.next().toUpperCase().charAt(0);

System.out.println("Lutfen yas�n�z� giriniz:");
double yas=scan.nextDouble();
if (cinsiyet=='E') {if (yas>=65) {System.out.println("Emekli olabilirsin");} else {System.out.println("Emekli olamazs�n");}} 
else if(cinsiyet=='K'){if (yas>=60) {System.out.println("Emekli olabilirsin");} else {System.out.println("Emekli olamazs�n");}}	
else {System.out.println("Lutfen cinsiyeti�in gecerli bir harf secin");} //buras� yanl�� girmesinde uyar� i�indir.
	
	scan.close();
	
	}

}
