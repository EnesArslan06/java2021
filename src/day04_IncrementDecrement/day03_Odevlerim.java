package day04_IncrementDecrement;

public class day03_Odevlerim {

	public static void main(String[] args) {

		//Soru 1:byte veri tipinde bir de�i�ken olu�turun, short, int, float, double data tiplerinde 
						//birer de�i�ken olu�turup  ad�m ad�m widening yap�n ve yazd�r�n.

		byte sayi1=46;
		
		short sayi2= sayi1;
		
		System.out.println("sayi2= " + sayi2);
				
		int sayi3= sayi2;
		
		System.out.println("sayi3= " + sayi3);
		
		float sayi4= sayi3;
		
		System.out.println("sayi4= " + sayi4);
		
		double sayi5= sayi4;
		
		System.out.println("sayi5= " + sayi5);
		
		
		// 2- int veri t�r�nde bir de�i�ken olu�turun ve ad�m ad�m narrowing yap�n ve yazd�r�n.
		
		int sayia=54;
				
		short sayib=(short) sayia;
		
		System.out.println("sayib= " + sayib);
		
		byte sayic=(byte) sayib;
		
		System.out.println("sayic= " + sayic);
		
		// 3-Float data t�r�nde bir variable olu�turun ve yazd�r�n.
		
		float sayid=46.44983f;
		System.out.println("sayid =" + sayid );
		
		
		// 4- double 255.36 say�s�n� int'a ve sonra da olu�turdu�unuz int say�y� byte'a �evirip yazd�r�n.
		
		double sayie=255.36;
		int sayif=(int) sayie;  //sayif=255 
		byte sayig=(byte) sayif;  //sayig=-1
		
		System.out.println("sayif= " + sayif + " ve "  + "sayig=" + sayig);
				
			
		// 5- int iki say�y� birbirine b�ld�r�n ve sonucu yazd�r�n.
		
		int sayih=45;
		int sayik=8;
		System.out.println(sayih/sayik); //sonuc 5 c�kar, int ondal�k k�sm� almaz.
		
		// 6- int bir say�y� double bir say�ya b�l�n ve sonucu yazd�r�n.
		
		int sayix=34;
		double sayiy=6.7;
		System.out.println(sayix/sayiy); //5.0746268... sonucu cikar.
				
		
		// 7- farkl� data tipleri ile i�lem yap�p sonu�lar� yazd�ral�m.
		
		byte sa=9; 
		short sb=27; 
		int sc=452; 
		long sd = 4347; 
		float sf=96.5f;  
		double sg=456.589;
		
		System.out.println("Sayilar�n toplami= "+(sa+sb+sc+sd+sf+sg)); //sonuc:5388.089
		
		
		
		
	}

}
