package day31_dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.PagesPerMinute;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
	
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		System.out.println(tarihSaat);//2021-12-04T13:06:29.219244800
		
		
		//eger tarih saati kendi istedigimiz sekilde yazd�rmak istersek
		
		// gun/ay/yil  saat:dakika olarak yazdiralim.
		
		DateTimeFormatter duzenli=DateTimeFormatter.ofPattern("dd / MM / YYYY HH:mm");
		
		System.out.println(duzenli.format(tarihSaat));
		//04 / 12 / 2021 13:09 bu sekilde ozellestirebildik.
		//minute ileMonth ayn� d�r   ay buyuk harfle dakika kucuk harfle yaz�l�r
		//
		/*format olusturuken gun icin 
		d : basta 0 sifir varsa onu yazmadan gun numarasini
		dd: tek haneli gunleri 01 gibi basina s�f�r ysazarak gun numarasi
		DDD : y�l�n kac�nc� gunu oldugunu yazar
		E, EE ,EEE : gun isminin ilk uc harfi
		EEEE : gun isminin tamamini
		
		AY (ay icin M, DAK�KA �C�N M KULLANILIR
		
		M: basta 0 varsa onu yazmadan ay numarasi
		MM::dd: tek haneli aylari 01 gibi basina s�f�r yazarak ay numarasi
		MMM: ay isminin ilk 3 harfi
		MMMM: ay isminin tamami
		
		YY:yilin son iki rakamini
		YYYY:Yilin tamamini
		
		Saat: 24 saat uzerinden istiyorsak H, 12 saat uzerinden istiyorsak h
		
		HH : saatin tamamini
		H : tek rakamli saat olursa sadece saati
		sonuna a yazarsak AM yada PM olarak ekler
		
		
		
		
		
		
		
		
		*/
		
		

	}

}
