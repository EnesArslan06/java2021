package day27_constructor_constructorCall;

public class Tir {

		
		int yil=2000;
		String renk;
		String model;
		int km;
		boolean satilikMi;
		
		public Tir(int i, String string, String string2, int j, boolean b) {
			//     int km, String model, String renk, int yil, boolean satilikMi
			
			
			// tir runner classindan yollad�g�m�z degerlerin instance variablelar ile eslesmesi icin
	//atamalari yapmam lazim		
		km=i;
		model=string;
		renk=string2;
		yil=j;
		satilikMi=b;
		
		
		
		
		
		}

		public Tir(int km, String model, String renk) {
			//i, string ve string2 isim olarak guzel isimler degil 
			//kodumuzu sonradan incelerken anlasilir degil
			//daha anlas�l�r olmasi icin variable isimlerini anlamli yapalim
			//int km, String model, String renk
			
			this.km=km;
			this.model=model;
			this.renk=renk;
			//basina this. yazd�g�m�zda java bu variablenin class leveldaki oldugunu anlar, yani yukaridakilerini
		}
		
		
		
		
		

	

}
