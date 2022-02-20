package day38_OverRiding;

public class Baliklar extends Animals{

	public static void main(String[] args) {
		Baliklar balik1=new Baliklar();

		balik1.beslenme();//bu classda beslenme methodu arar ancak yok extends oldugu icin parents class gider
						//Tum hayvanlar beslenir bunu yazdýrdý bir ust classdan
		
		balik1.hareket();//hareket methoduna bakar ust classda oldugu halde bu class da da hareket methodu oldugu icin
					//bu classdan alýr yazdýrýr. Balikllar yuzerek hareket eder
		
		balik1.solunum();//Baliklar solungaclari ile solunum yapar bu sekilde yazdýrdý.
	}

	//Bu override eden methoddur. ust class daki methodu overriden hale getirmistir.
	//bunu javaya declare etmek icin
	//basýna Override yazmazsak 
	//child class daki bir method parent classdan bir methodu override ediyorsa
	//bunu istersek @Override notasyonu ile deklare edebiliriz.
	// declare etmesekte kodlarimiz calisir.
	//Ancak  declare etiigimizde Java overriden methodu surekli kontrol eder ve o
	//methodda overriding e uymayan bir degisiklik olursa CTE verir.
	@Override  //yazariz. 
	public void hareket() {
		System.out.println("Balikllar yuzerek hareket eder");
	}
	
		
	public void solunum() {
		System.out.println("Baliklar solungaclari ile solunum yapar");
	}
	
	
	
	
	
	
}
