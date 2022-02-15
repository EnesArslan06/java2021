package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C04_PassByValueArray {

	public static void main(String[] args) {
		
		int sayilar[]= {3,4,5,6};
		
		elemanDegistir(sayilar);
		System.out.println("eleman degistir methodundan sonra main methodda : "+ Arrays.toString(sayilar));
		arrayDegistir(sayilar);
		System.out.println("arrayi degistir metodundan sonra main methodda: " + Arrays.toString(sayilar));
		//orjinal arrayi main de degistirmedi methodda olusturda ve 16 uzunlugunda bir array olusturdu.
		//biz arrayin veya bir listin method olusturup uzunlugunu veya degerlerini degistirmek istersek
		//java passByvalue yapar pas gecer sadece bazý elemanlarin degisimine izin verebilir.
		
		
		
		
	}

	private static void arrayDegistir(int[] sayilar) {
		sayilar=new int[16];
		System.out.println("arrayi degistir metodunda: " + Arrays.toString(sayilar));
		
	}

	private static void elemanDegistir(int[] sayilar) {
		sayilar[0]=10;
		System.out.println("eleman degistir methodunda : "+ Arrays.toString(sayilar));
		
	}

}
