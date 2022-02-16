package day31_dateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
	
	//bir string ve variable olusturalim.
	//bi loop iceriainde bu variableleri 1000 kere degistirelim
	//ve islem surelerini kýyaslayalým.
		
		
//verilen iki dogum tarihinin hangisinin daha onece oldugunu bulunuz.
//Javada tarih ve zaman icin 3 adet class vardir.
		
		LocalTime saatTime=LocalTime.now();
		System.out.println("Baslangýcsaat"+saatTime);//12:39:23.741949600
		
		String str="Celil";
		for (int i = 0; i < 10000; i++) {
			str+=" ";
		}
		
		
		LocalTime saatTime2=LocalTime.now();
		System.out.println("Bitissaati"+ saatTime2);
	
		double nano1=saatTime.getNano();
		double nano2=saatTime2.getNano();
		
		System.out.println("For Loop" + (nano1-nano2)+ "nano saniyede tamamlandi");
		
		
	
	
	
	}

}
