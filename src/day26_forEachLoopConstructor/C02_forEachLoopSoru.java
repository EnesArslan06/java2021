package day26_forEachLoopConstructor;

public class C02_forEachLoopSoru {

	public static void main(String[] args) {
		// iki string array olusturun ve bu arraylerdeki ortak elemanlari
		// For each Loop kullanarak bulunuz
		// sonucu ekrana yazd�r�n�z
		//ortak eleman yoksa "ortak eleman yok yazd�r�n

		String arr1[] = { "A", "B", "C" };
		String arr2[] = { "A", "R", "O" };

		int flag = 0;

		for (String birinciarray : arr1) {
			for (String ikinciarray : arr2) {
				if (birinciarray.equals(ikinciarray)) {
					System.out.println(birinciarray+" ");//buraya ikinciarrayde yazabiliriz
					flag++; //ortak bir eleman bulunursa flag� 1 artir
				}
			}
		}
		
		if (flag==0) {
			System.out.println("Ortak eleman yok");
		}
	}

}
