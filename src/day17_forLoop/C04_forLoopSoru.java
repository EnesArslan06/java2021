package day17_forLoop;

import java.util.Scanner;

public class C04_forLoopSoru {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin ve Stringi tersine ceviren
		//bir program yazin.//burada method istiyor yani program diger soruda sadece yazdırma vardı.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdırmak icin bir yazı giriniz");
		String kelime=scan.nextLine();


		System.out.println(ters(kelime));
	scan.close();
	}

	private static String ters(String kelime) {
		String terskelime=""; //burada bos birkap olmadanbirsey yapamayız. bu kap bosforda yaptıgımız
		//kelime islemlerini bu variableda toplayacak.
		
		for (int i = kelime.length()-1; i >= 0; i--) {
		terskelime+=kelime.substring(i,i+1);   
		}
		
		return terskelime;
	}}
