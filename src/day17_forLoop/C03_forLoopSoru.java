package day17_forLoop;

import java.util.Scanner;

public class C03_forLoopSoru {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdýrmak icin bir yazý giriniz");
		String kelime=scan.nextLine();
		
		for (int i = kelime.length()-1; i >=0 ; i--) { //lengty -1 dersek kelimenin son harfine ulasýrýz ve ordan birer azaltarak yazdýrýrýz.
			//System.out.print(kelime.substring(i, i+1)); //charAt ile de yapýlabilir.
		System.out.print(kelime.charAt(i));
		}
		
		
	scan.close();	
		

}}
