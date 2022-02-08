package day10_SwitchCase;

public class C04_SwitchCase {

	public static void main(String[] args) {
		//Soru:Gun numarasýna göre hafta içi veya hafta sonu yazdýrsýn.

int gunNo=2;   
switch(gunNo) {
case 1:  					//break gorene kadar hafta içi mantýgý ile hareket eder.
case 2:  					//dogal olarak 4 girersek 5 e kadar gelir hafta içini görür.
case 3:  		  //6 yazarsak 7 ye gelir ve hafta sonunu görür. Gereksiz iþlem yogunlu ile ugrasmayýz
case 4:  				//ieride bunu cok fazla kullanacaz.
case 5:  System.out.println("Hafta içi");   break;			 
case 6:   
case 7:  System.out.println("Hafta Sonu"); break;
default: System.out.println("Gecerli bir gun numarasý yazýnýz");
}
}

}
