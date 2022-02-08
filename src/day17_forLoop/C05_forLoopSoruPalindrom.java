package day17_forLoop;

import java.util.Scanner;

public class C05_forLoopSoruPalindrom {

	public static void main(String[] args) {
		// Soru 9 ) Interview Question
		//Kullanicidan bir String isteyin. Kullanicinin girdigi String�in
		//palindrome olup olmadigini kontrol eden bir program yazin.


		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen  bir yaz� giriniz");
		String kelime=scan.nextLine();
	
		if (kelime.equals(ters(kelime))) {System.out.println("Girdiginiz kelime Palindrom" );}
		else {System.out.println("Girdiginiz kelime Palindrom degil");}
		
		//bir onceki soruda palindrom olmadan yapt�k. sadece if else k�sm� ekledik
	//sayi girsekde olabilir. 1234321
		
scan.close();		
}		

		private static String ters(String kelime) {
			String terskelime=""; //burada bos birkap olmadanbirsey yapamay�z. bu kap bosforda yapt�g�m�z
			//kelime islemlerini bu variableda toplayacak.
			
			for (int i = kelime.length()-1; i >= 0; i--) {
			terskelime+=kelime.substring(i,i+1);   
			}
			
			return terskelime;
	
	
}
}
