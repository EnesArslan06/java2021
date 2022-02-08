package day19_DoWhileLoop;

public class C02_DoWhileLoop {

	public static void main(String[] args) {
		// while loop da once sarti kontrol eder sonra cal�s�r.
		//Do while loop da ise once kodu cal�st�r�r sonra sart� kontrol eder.
 
		int i=0;
		
		while (i<5) {
			System.out.print(i+ " "); //bu kod 0 1 2 3 4 yazd�rd� ve sart� 6 kez cal�st� kod
		i++;							//0 i�in 1 i�in 2 i�in 3 i�in 4 i�in 5 i�in 5 de sart saglanmad� kod durdu.
		}
		
		int a=0;
		do {
			System.out.println(a+" ");//burada 5 kere cal�st� kontrol. While gore 1 kez az cal�st�
			a++;
		} while (a<5);
		
//while loop once sart� kontrol eder sonra kodu cal�st�r�r. Loop icinde art�s yap�lsada bir sonraki kontrole kadarda 
//loop cal�smaya devvam eder buda baz� durumlarda hatal� sonuclara ulasmam�za neden olabilir.
//burada onemli olan loopun son i�lemde baz� yapacag� hatalar olabilir.
//Do while once i�lemi yapar sonra kontrol eder. Ozellikle kullan�c�dan deger almalarda do while loop tercih edilir.

}}
