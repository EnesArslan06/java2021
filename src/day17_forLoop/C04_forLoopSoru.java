package day17_forLoop;

import java.util.Scanner;

public class C04_forLoopSoru {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin ve Stringi tersine ceviren
		//bir program yazin.//burada method istiyor yani program diger soruda sadece yazd�rma vard�.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazd�rmak icin bir yaz� giriniz");
		String kelime=scan.nextLine();


		System.out.println(ters(kelime));
	scan.close();
	}

	private static String ters(String kelime) {
		String terskelime=""; //burada bos birkap olmadanbirsey yapamay�z. bu kap bosforda yapt�g�m�z
		//kelime islemlerini bu variableda toplayacak.
		
		for (int i = kelime.length()-1; i >= 0; i--) {
		terskelime+=kelime.substring(i,i+1);   
		}
		
		return terskelime;
	}}
