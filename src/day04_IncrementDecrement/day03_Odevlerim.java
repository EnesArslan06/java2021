package day04_IncrementDecrement;

public class day03_Odevlerim {

	public static void main(String[] args) {

		//Soru 1:byte veri tipinde bir deðiþken oluþturun, short, int, float, double data tiplerinde 
						//birer deðiþken oluþturup  adým adým widening yapýn ve yazdýrýn.

		byte sayi1=46;
		
		short sayi2= sayi1;
		
		System.out.println("sayi2= " + sayi2);
				
		int sayi3= sayi2;
		
		System.out.println("sayi3= " + sayi3);
		
		float sayi4= sayi3;
		
		System.out.println("sayi4= " + sayi4);
		
		double sayi5= sayi4;
		
		System.out.println("sayi5= " + sayi5);
		
		
		// 2- int veri türünde bir deðiþken oluþturun ve adým adým narrowing yapýn ve yazdýrýn.
		
		int sayia=54;
				
		short sayib=(short) sayia;
		
		System.out.println("sayib= " + sayib);
		
		byte sayic=(byte) sayib;
		
		System.out.println("sayic= " + sayic);
		
		// 3-Float data türünde bir variable oluþturun ve yazdýrýn.
		
		float sayid=46.44983f;
		System.out.println("sayid =" + sayid );
		
		
		// 4- double 255.36 sayýsýný int'a ve sonra da oluþturduðunuz int sayýyý byte'a çevirip yazdýrýn.
		
		double sayie=255.36;
		int sayif=(int) sayie;  //sayif=255 
		byte sayig=(byte) sayif;  //sayig=-1
		
		System.out.println("sayif= " + sayif + " ve "  + "sayig=" + sayig);
				
			
		// 5- int iki sayýyý birbirine böldürün ve sonucu yazdýrýn.
		
		int sayih=45;
		int sayik=8;
		System.out.println(sayih/sayik); //sonuc 5 cýkar, int ondalýk kýsmý almaz.
		
		// 6- int bir sayýyý double bir sayýya bölün ve sonucu yazdýrýn.
		
		int sayix=34;
		double sayiy=6.7;
		System.out.println(sayix/sayiy); //5.0746268... sonucu cikar.
				
		
		// 7- farklý data tipleri ile iþlem yapýp sonuçlarý yazdýralým.
		
		byte sa=9; 
		short sb=27; 
		int sc=452; 
		long sd = 4347; 
		float sf=96.5f;  
		double sg=456.589;
		
		System.out.println("Sayilarýn toplami= "+(sa+sb+sc+sd+sf+sg)); //sonuc:5388.089
		
		
		
		
	}

}
