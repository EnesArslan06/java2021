package day04_IncrementDecrement;

public class C05_PreDecrementPostDecrement {

	public static void main(String[] args) {
			
		int sayi=10;
		sayi--;
		System.out.println(sayi); //sayi 9 olur
		
		int a=sayi--;
		
		System.out.println(a); //a 9 olur. En uste say� 10 say�y� 1 azaltt�k 9 oldu
		System.out.println(sayi);// sayi 8 olur. nedeni once yazd�r dedik sonra azalt dedik.
		
		System.out.println(--a); //dedigimizde sayi 1 azal�r a say�s� 9 ken sekiz olur.
								//a ile sayi y� kar�st�rmamak laz�m 								
		


	}

}
