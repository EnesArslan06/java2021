package day36_inheritance;

import javax.management.remote.SubjectDelegationPermission;

import day35_encapsulations_inheritance.C06_Isci;

public class Ustabasi extends C06_Isci {

	
	Ustabasi(){
	System.out.println("Ustabasi Parametresiz Constructor Calisti");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Ustabasi ust1=new Ustabasi();
		
		/*Peersonel Parametresiz Constructorý calisti
		  Muhasebe Parametresiz Constructorý calisti
		  Iscý Parametresiz Constructorý calisti
		  Ustabasi Parametresiz Constructor Calisti	*/ 
		//constructorlari olusturdugumuzda en bastaki cilass a kadar gidip oradaki contructorlari calistirdi.
		//ve yazdirdi.

		//javada her class olusturuldugunda default contructor olusturuldugu gibi;
		//Child class' da olusturulan herbir controuctorun ilk satirinda gizli
		//super() constructor olusturur. Bunuda child classdaysak Java her clasa super() constructor ekler.
		
		
		
		
		

	}

}
