package day06_Wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
		/*
		// Assignment-Atama yapar.
		//int num1=3; deger atamad�r.
		//int c=c+5 c ye 5 ekler ve degeri art�r�r�. Kal�c� olarak.
		
		//esittir isareti atama yapar
		//k�yaslama yapacaksak cift esittir isareti kullanacaz == cift isaret olursa esitmi manas�na gelir.
		// boolean sonuc1=5+2==7  yani burada 5 ile 2 yi toplarsak 7 ye esitmi? anlam�na gelir.

		boolean sonuc1=5+2==7;  //bunun cevab� 7 dir ve True olarak gecer.Yani sonuc1 in degeri true olur.
		boolean sonuc2=5*2==15;	//bunun cevab�da false olur. esit degildir.
		
		//  != esit degilmi manas�na gelir esit degildir anlam�da tas�r.
		
		boolean sonuc1=5+2!=7; //bu esit oldugu i�in cevap false olur cunku esit degildir demi�
		boolean sonuc2=5*2!=15; //bunun cevab� dogru yan� true olarak c�kar cunku esit degildir diye sorulmus.
		
		//   > Buyuktur, >= Buyuk veya esittir.
		//   < kucuktur veya <= kucuktur veya esittir.
		
		boolean sonuc1=5+2<7; //false  Burada sonuc yazd�racak olsan false yazar.
		boolean sonuc1=5+2<=7; //True
		boolean sonuc2=5*2<=15; //dogrudur true sonucu al�r�z. 5*2 15den kucuktur.
	
		//  && AND (ve) isareti. Mant�ksal i�lemler olarak gecer. Bu operator mukemmelliyetcidir.
		
		boolean sonuc1=(5+2==7)&&(4+3!=5); // sonuc1 degeri true olur cunku iki i�lemde dogrudur.
		System.out.println((5*2!=15)&&(5>7));// bunun sonucu false olarak c�kar birtanesi dogru biri yanl�s.
		
		
		//  || OR (veya) isareti
		//   || isareti ile birle�tirilen tum ifadeler yanl�s ise sonuc false olur. diger tum durumlar true doner
		//  || iyimser operatordur.
		boolean sonuc1=(5+2==7)||(4+3!=5); //sonuc True olarak c�kar biri dogru biri yanl��
		System.out.println((5*2==15) || (5>7)); // sonuc False yazd�r�r. Cunku ikiside yanl�st�r.
		
		//  && and isareti carpmaya benzer. yani 1*1*1*1*1*1*0 olursa sonuc s�f�rd�r.
		//  || or isareti ise toplamaya benzer.   0+0+0+0+0+0+0+0+1 olursa sonuc 1 olur.
									*/
		System.out.println((5+3==8)||(6+5==10) || (7-2==3) ); //cvp true yazd�r�r. Bir tanesi dogru.
		System.out.println((5+3==8)&&(6+5==10) && (7-2==3) ); //cvp false olur. Yanl�s var i�erisindeki saonuclardan birinde
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c;
		System.out.println(sonuc); // cvp true c�kar 3 i�lemden birirsi dogru. || or isareti kullan�l�yor.
		
		//  && and and isareti yerine bir tanede & kullan�labir ancak arada bir fark vard�r. �kitane && isareti varsa
		// java bizim sadece sonucla ilgilend�gimizi anlar ilk i�lemde bulursa yanl�s� diger i�lemleri kontrol etmez.
		//ancak tek i�arertle koyarsak hepsini kontrol edecegi i�in biraz fazla cal�s�r.
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3 ); //false yazd�r�r. 2 yanl�s bir dogru i�lem var.
		System.out.println(5+3==8 && 7*2==14 && 7*1==14); //cvp false olur 3 i�lemden biri yanl�st�r.
		 int yas=50;
		 int boy=180;
		 char cinsiyet='M';
		 System.out.println(yas<30 && boy>170 && cinsiyet=='M'); //sonuc false olur cunku degerlerden biri yanl�s.
		 System.out.println(yas<30 || boy>170 || cinsiyet=='M'); //sonuc true c�kar cunku i�inde dogru var.
		
	}

}
