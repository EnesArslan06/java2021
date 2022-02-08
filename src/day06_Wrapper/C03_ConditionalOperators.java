package day06_Wrapper;

public class C03_ConditionalOperators {

	public static void main(String[] args) {
		/*
		// Assignment-Atama yapar.
		//int num1=3; deger atamadýr.
		//int c=c+5 c ye 5 ekler ve degeri artýrýrý. Kalýcý olarak.
		
		//esittir isareti atama yapar
		//kýyaslama yapacaksak cift esittir isareti kullanacaz == cift isaret olursa esitmi manasýna gelir.
		// boolean sonuc1=5+2==7  yani burada 5 ile 2 yi toplarsak 7 ye esitmi? anlamýna gelir.

		boolean sonuc1=5+2==7;  //bunun cevabý 7 dir ve True olarak gecer.Yani sonuc1 in degeri true olur.
		boolean sonuc2=5*2==15;	//bunun cevabýda false olur. esit degildir.
		
		//  != esit degilmi manasýna gelir esit degildir anlamýda tasýr.
		
		boolean sonuc1=5+2!=7; //bu esit oldugu için cevap false olur cunku esit degildir demiþ
		boolean sonuc2=5*2!=15; //bunun cevabý dogru yaný true olarak cýkar cunku esit degildir diye sorulmus.
		
		//   > Buyuktur, >= Buyuk veya esittir.
		//   < kucuktur veya <= kucuktur veya esittir.
		
		boolean sonuc1=5+2<7; //false  Burada sonuc yazdýracak olsan false yazar.
		boolean sonuc1=5+2<=7; //True
		boolean sonuc2=5*2<=15; //dogrudur true sonucu alýrýz. 5*2 15den kucuktur.
	
		//  && AND (ve) isareti. Mantýksal iþlemler olarak gecer. Bu operator mukemmelliyetcidir.
		
		boolean sonuc1=(5+2==7)&&(4+3!=5); // sonuc1 degeri true olur cunku iki iþlemde dogrudur.
		System.out.println((5*2!=15)&&(5>7));// bunun sonucu false olarak cýkar birtanesi dogru biri yanlýs.
		
		
		//  || OR (veya) isareti
		//   || isareti ile birleþtirilen tum ifadeler yanlýs ise sonuc false olur. diger tum durumlar true doner
		//  || iyimser operatordur.
		boolean sonuc1=(5+2==7)||(4+3!=5); //sonuc True olarak cýkar biri dogru biri yanlýþ
		System.out.println((5*2==15) || (5>7)); // sonuc False yazdýrýr. Cunku ikiside yanlýstýr.
		
		//  && and isareti carpmaya benzer. yani 1*1*1*1*1*1*0 olursa sonuc sýfýrdýr.
		//  || or isareti ise toplamaya benzer.   0+0+0+0+0+0+0+0+1 olursa sonuc 1 olur.
									*/
		System.out.println((5+3==8)||(6+5==10) || (7-2==3) ); //cvp true yazdýrýr. Bir tanesi dogru.
		System.out.println((5+3==8)&&(6+5==10) && (7-2==3) ); //cvp false olur. Yanlýs var içerisindeki saonuclardan birinde
		
		int a=10;
		int b=20;
		int c=30;
		
		boolean sonuc= a>b || b>c || a+b>=c;
		System.out.println(sonuc); // cvp true cýkar 3 iþlemden birirsi dogru. || or isareti kullanýlýyor.
		
		//  && and and isareti yerine bir tanede & kullanýlabir ancak arada bir fark vardýr. Ýkitane && isareti varsa
		// java bizim sadece sonucla ilgilendýgimizi anlar ilk iþlemde bulursa yanlýsý diger iþlemleri kontrol etmez.
		//ancak tek iþarertle koyarsak hepsini kontrol edecegi için biraz fazla calýsýr.
		
		System.out.println(5+3==8 & 6+5==10 & 7-2==3 ); //false yazdýrýr. 2 yanlýs bir dogru iþlem var.
		System.out.println(5+3==8 && 7*2==14 && 7*1==14); //cvp false olur 3 iþlemden biri yanlýstýr.
		 int yas=50;
		 int boy=180;
		 char cinsiyet='M';
		 System.out.println(yas<30 && boy>170 && cinsiyet=='M'); //sonuc false olur cunku degerlerden biri yanlýs.
		 System.out.println(yas<30 || boy>170 || cinsiyet=='M'); //sonuc true cýkar cunku içinde dogru var.
		
	}

}
