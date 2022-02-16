package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {

	LocalTime saatTime=LocalTime.now();
	System.out.println("Baslang�csaat"+saatTime);//12:39:23.741949600
	
	int sayi=10;
	for (int i = 0; i < 10000; i++) {
		sayi++;
	}
	
	
	LocalTime saatTime2=LocalTime.now();
	System.out.println("Bitissaati"+ saatTime2);
	//java for loopu kac saniyede yapt� boyle hesaplanir.
	//her i�lemi kac saniyede yaptigini ve islemin kac saniyede yap�ld�g�n� ogrenmek icin 
	//baslang�cta bir islem bittikten sonra local saat olusturmamiz laz�m.
	
	
	
	double nano1=saatTime.getNano();
	double nano2=saatTime2.getNano();
	
	System.out.println("For Loop" + (nano1-nano2)+ "nano saniyede tamamlandi");
	
	System.out.println(saatTime.getMinute());
	System.out.println(saatTime.plusMinutes(10000));//10.000 dakika sonra ne olur
	System.out.println(saatTime.minusMinutes(20));//20 dakika oncesi
	
	
	
	LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
	
	
	
	
	
	
	}

}
