package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Month;


public class C01_LocalDate {

	public static void main(String[] args) {
		

LocalDate tarih=LocalDate.now();
		
	System.out.println(tarih);	//2021-12-02
		
		
		
	System.out.println(tarih.getDayOfYear());//336 yazdýrdý yilin 336. gunu
	System.out.println(tarih.getDayOfMonth());//2 yazdýrdýayin 2. gunu
	System.out.println(tarih.getDayOfWeek());//thursday
	System.out.println(tarih.getMonth());//DECEMBER
	
	System.out.println(tarih.plusDays(20));//2021-12-22 bu gunden 20 gun sonrasi
	System.out.println(tarih.plusMonths(5));//2022-05-02 5 ay sonraki tarihi ekledi
	System.out.println(tarih.plusWeeks(15));//2022-03-17 15 hafta sonra ne olacagý
	
	System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));//2022-03-17
	
	System.out.println(tarih.minusDays(20));//2021-11-12 bu methodda onceki tarihi bulur
	
	System.out.println(tarih.minusYears(21).isLeapYear());//artýk yýl mi diye sorduk true olarak cvp verdi
	//21 yýl oncesine yani 2000 yýlý artýk yýl mý dedik true dedi
	
	
	LocalDate dogumTarihi=LocalDate.of(1998, Month.OCTOBER, 22);
	LocalDate dogumTarihi2=LocalDate.of(2000, 01, 12);
	LocalDate dogumTarihi3=LocalDate.ofYearDay(2000, 136);
	System.out.println(dogumTarihi+ ", "+ dogumTarihi2);//1998-10-22, 2000-01-12
	
	System.out.println(dogumTarihi.isAfter(dogumTarihi2));//false dogumtarihi 1 dogum tarihi 2 den sonrami?
	
	System.out.println(dogumTarihi3.isBefore(dogumTarihi));//buda once mi onu sorgular.
	
	
	
	
	
	
}
}
