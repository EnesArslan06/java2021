package day19_DoWhileLoop;

public class C02_DoWhileLoop {

	public static void main(String[] args) {
		// while loop da once sarti kontrol eder sonra calýsýr.
		//Do while loop da ise once kodu calýstýrýr sonra sartý kontrol eder.
 
		int i=0;
		
		while (i<5) {
			System.out.print(i+ " "); //bu kod 0 1 2 3 4 yazdýrdý ve sartý 6 kez calýstý kod
		i++;							//0 için 1 için 2 için 3 için 4 için 5 için 5 de sart saglanmadý kod durdu.
		}
		
		int a=0;
		do {
			System.out.println(a+" ");//burada 5 kere calýstý kontrol. While gore 1 kez az calýstý
			a++;
		} while (a<5);
		
//while loop once sartý kontrol eder sonra kodu calýstýrýr. Loop icinde artýs yapýlsada bir sonraki kontrole kadarda 
//loop calýsmaya devvam eder buda bazý durumlarda hatalý sonuclara ulasmamýza neden olabilir.
//burada onemli olan loopun son iþlemde bazý yapacagý hatalar olabilir.
//Do while once iþlemi yapar sonra kontrol eder. Ozellikle kullanýcýdan deger almalarda do while loop tercih edilir.

}}
