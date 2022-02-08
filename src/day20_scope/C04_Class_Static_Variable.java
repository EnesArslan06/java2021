package day20_scope;

public class C04_Class_Static_Variable {
	// Class�n icinde ancak main methodun d�s�nda olmal�d�r.
			//Static olmal�d�r.
			//Olusturulmas� yeterlidir, deger atanmas�na gerek yoktur.
			//static oldugu icin main methoddan direk cag�r�labilir.
			//bas�na static yaz�lmal�d�r. 
	
	
	static int no=20;
    static int sayi;
	static String adres="Ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	
	public static void main(String[] args) {
		//static variable'lara main method dan direk ulas�labilir mi?  Evet
		
		System.out.println(no); //20 yazd�r�r. dikkat obje olusturmad�k
		no++; //yaparsak once yazd�r�r sonra art�r�r.
		System.out.println(no); //21 yazd�rd�k			//static se okulun ad� daire numaras� gibi butun seyleri degistirir
												//ve kal�c� olarak yazd�r�r
		
		staticMethod();
		System.out.println(no); //bunu yazd�r�rsak 22 olarak yazd�r�r. art�r�m� asag�daki methodda yapt�k ama art�r�m� stattic
									//oldugu icin heryerde gecerli k�ld�
		
}		
		
		public static void staticMethod() {
			//static variable'lara main method dan direk ulas�labilir mi?  Evet	
		no++;
		System.out.println("static methodda sayi: " + no);
		}

		public void staticOlmayanMethod() {
			//static variable'lara main method dan direk ulas�labilir mi?  Evet	
			//statik variablelera static olan veya olmayan tum methodlardan ulas�labilir.
			//bu yuzden static veriablelara Class Variable denilir. Clas�n icindeki variableler ulasabilir.
			
			no++;
			System.out.println();
			
		}
		
		
}
