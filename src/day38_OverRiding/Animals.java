package day38_OverRiding;

public class Animals {

	public static void main(String[] args) {
		

	}
	//overridden denir etkisiz k�l�nm�s demektir cunku alt classdaki (baliklar) ayni method oldugu icin bu kullan�lmaz o kullan�l�r.
	public void hareket() {
		System.out.println("Tum hayvanlar hareket eder");
	}
	
	public void beslenme() {
		System.out.println("Tum hayvanlar beslenir");
	}
	
	public void solunum() {
		System.out.println("Tum hayvanlar solunum yapar");
	}
	
	
}



