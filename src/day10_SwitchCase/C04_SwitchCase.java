package day10_SwitchCase;

public class C04_SwitchCase {

	public static void main(String[] args) {
		//Soru:Gun numaras�na g�re hafta i�i veya hafta sonu yazd�rs�n.

int gunNo=2;   
switch(gunNo) {
case 1:  					//break gorene kadar hafta i�i mant�g� ile hareket eder.
case 2:  					//dogal olarak 4 girersek 5 e kadar gelir hafta i�ini g�r�r.
case 3:  		  //6 yazarsak 7 ye gelir ve hafta sonunu g�r�r. Gereksiz i�lem yogunlu ile ugrasmay�z
case 4:  				//ieride bunu cok fazla kullanacaz.
case 5:  System.out.println("Hafta i�i");   break;			 
case 6:   
case 7:  System.out.println("Hafta Sonu"); break;
default: System.out.println("Gecerli bir gun numaras� yaz�n�z");
}
}

}
