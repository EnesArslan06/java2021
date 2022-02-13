package day26_forEachLoopConstructor;

public class C04_forEachLoopSoru {

	public static void main(String[] args) {
		// Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For
		//each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

		
		int array[]= {1,2,3,4};
		
		int toplam=0;
		for (int i : array) {
			toplam+=i*i;
		}
		
		System.out.println(toplam);
	}

}
