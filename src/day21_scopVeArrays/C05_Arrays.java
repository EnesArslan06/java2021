package day21_scopVeArrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		int enes[]= {2,4,5,6,78,89};//bu sekilde arrayı olusturduk ve degerlerini atamıs olduk.
		//buradaki tum elementleri yazdırmak icin
		
		for (int i = 0; i < enes.length; i++) {//burada kendi otomatik olarak olusturdu arrayın sınırına kadar.
			System.out.print(enes[i] + " "); //bu elemetlerin tamamını yazmıs olduk
		
}
	
		System.out.println("\n"+Arrays.toString(enes));//bu kendi olusturuyor arrays. dedigimizde bircok method cıkartıyor.
//to string olanını sectigimizde parantez icine arrayımizin adını yazıyoruz. sonra o yazdırıyor. \n i kendim koydum
//arrayın elemanlarını bu sekilde yazdırırsak koseli parantezli ve virgullu olarak yazar.
		
		
	}

}
