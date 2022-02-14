package day27_constructor_constructorCall;

public class C02_ParamatreliConstructor {

	public static void main(String[] args) {
		// java'nin olusturdugu default constructor ile obje olusturabiliyoruz
		// ama her obje icin yeniden deger atamasi yapmak uzun oluyor
		// Istersek parametreli constructorlar olusturup
		// daha obje olusurken istedigim ozellikleri atayabilirim
		
		Car1 car1 = new  Car1(50000,    "Vectra",   "Beyaz"    , 2015   ,  true);
							//int km, String model, String renk, int yil, boolean satilikMi
		
		
		Car1 car2 = new Car1(35000);
							//int km
		
		System.out.println(car2.km);// 35000
		
		
		Car1 car3=new Car1();
			System.out.println(car3.km);//sifir yazd�r�r.
			
		Car1 car4=new Car1(1000);//car1 class�nda car4 objesi olusturduk
								//sonucu 1 yazd�rd�, Car1 classa gitti orada tek i yi gordu ve yazd�rd�
		
		// yil ve km yi parametre olarak girebilecegim bir constructor daha olusturabilir miyim?
		
		Car1 car5=new Car1(2020,5000);//y�l 2020 km 5000 olsun. Boyle bir constractor yok diyor olusturacaz
		
		System.out.println(car5.yil +" " +car5.km + " "+ car5.model);
		//					2020			5000		Car1 claas�nda ne atand�yssa onu yazacak orada
														//deger atanmad�g� icin null olarak atayacak
		

		
		
	}

}