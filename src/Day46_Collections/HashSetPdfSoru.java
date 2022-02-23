package Day46_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPdfSoru {

	public static void main(String[] args) {
		/*
		 * Soru 1 : Bir TreeSet ve HashSet�e random 100 sayi ekleyin, islem surelerini
		 * kiyaslayin Soru 2 : Ilk soruya 3.bir islem ekleyelim, set�i Hashset olarak
		 * olusturup elemanlari ekleyelim ve sonra TreeSet�e cevirip yazdiralim Long
		 * time=System.currentTimeMilis() method�unu kullanin
		 */

		Set<Integer> ts = new TreeSet<>();
		Set<Integer> hs = new HashSet<>();
		Random r = new Random(); // random s�n�f�ndan random say� getirecem.

		Long baslangicTree = System.currentTimeMillis(); // i�leme ba�lama s�resi
		for (int i = 1; i <= 100; i++) { // 100 tane random say� getirdim,ekledim
			ts.add(r.nextInt());
		}
		Long bitisTree = System.currentTimeMillis(); // i�lemi bitirdi�i s�re

		Long baslangicHash = System.currentTimeMillis(); // i�leme ba�lama s�resi
		for (int i = 1; i <= 100; i++) {
			hs.add(r.nextInt());
		}
		Long bitisHash = System.currentTimeMillis(); // i�lemi bitirdi�i s�re

		long tsIslemSure = (bitisTree - baslangicTree); // i�lemi ne kadar s�rede yapt���
		long hsIslemSure = (bitisHash - baslangicHash); // i�lemi ne kadar s�rede yapt���

		if (hsIslemSure > tsIslemSure) {
			System.out.println("TreeSet daha h�zl�d�r.");
		} else if (tsIslemSure > hsIslemSure) {
			System.out.println("HashSet daha h�zl�d�r.");
		} else {
			System.out.println("HashSet ve TreeSet ayn� h�zdad�r.");
		}
	
//////////////2. SORU  /////////  Yukar�daki i�leme 3.bir i�lem daha ekliyorum***
		
Set<Integer> hs2=new HashSet<>();   // yeni bir Hashset ve TreeSet olu�turdum.
Set<Integer> tsYeni=new TreeSet<>();

Long baslangic3=System.currentTimeMillis();  // i�leme ba�lama s�resi  
for (int i = 0; i < 100; i++) {
	hs2.add(r.nextInt());    // hs2ye yine random say�lar� at�yorum...
}

for (Integer e : hs2) {
     tsYeni.add(e);  // Yukar�da ald�g�m random say�lar� TreeSete at�yorum...
}
Long bitis3=System.currentTimeMillis();  // i�lemi bitirdi�i s�re

long tshsIslemSure= (bitis3-baslangic3);  // i�lemi yap�� s�resi

// System.out.println(tsYeni.containsAll(hs2));  // true
// tsYeni ,hs2'yi i�eriyor mu i�ermiyor mu diye saglamas� al�nabilir. Kod dogru �al���yor.


System.out.println(tsIslemSure);  // 1
System.out.println(hsIslemSure);  // 0
System.out.println(tshsIslemSure); // 1
// Her zaman ayn� olmuyor,degi�iyor.
	
	}

}
