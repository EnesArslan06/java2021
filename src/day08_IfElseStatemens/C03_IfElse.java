package day08_IfElseStatemens;

import java.util.Scanner;

public class C03_IfElse {

	public static void main(String[] args) {
		// Kullan�c�dan yas�n� sorun. Eger 65 yas�ndan kucukse emekl� olamazs�n buyukse
		//emekli olabilirsin yazd�r�n.
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen Yas�n�z� yaz�n�z:");
int yas=scan.nextInt();
if(yas>=65) {System.out.println("Emekli olabilirsiniz.");} 
else {System.out.println("Emekli olamazs�n�z Cal�smal�s�n�z");}



scan.close();
	}

}
