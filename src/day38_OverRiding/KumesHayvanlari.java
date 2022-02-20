package day38_OverRiding;

public class KumesHayvanlari extends Kuslar {

	
	
	
	
	public static void main(String[] args) {
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme();//Animals clasýndan alýr
		kms1.hareket();//KumesHaayvanlari methodundan alir
		kms1.solunum();//Kuslar classýndan alýr
		//hareket methodu overriding edildi. Kuslar clasýndan olan hareket methodu degil buradaki hareket methodu calisti.
		
		Kuslar kms2=new KumesHayvanlari();
		kms2.beslenme();//Animals classýndan alýr
		kms2.hareket();//Kuslar clasýndan alýr//burada methodu kuslar classýndan aldý ancak yazdýrmasý bu methoddan oldu
						//yani o method calisti ancak buradaki"Kumes Hayvanlari yuruyerek hareket eder" yazdýrdý.
		//Kuslar clasýndan bir method olusturduk kms2 diye. kms2 hareket methodu icin Kuslar classýna gitti bakti hareket methoduna
		//overriden edilmis bir method o zaman baktiki bu olusturlan obje icin buradaki methodu calistirdi. 
		//Kuslar kms2=new KumesHayvanlari(); soldaki "Kuslar"parametreturu  Sagdaki "KumesHayvanlari" constructor.
		
		kms2.solunum();//Kuslar classýndan alýr
		
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme();//Tum hayvanlar beslenir
		kms3.hareket();//Kuslar ucarak hareket eder
		kms3.solunum();//uslar akcigerleri ile solunum yapar
		
		
		
		Animals kms4=new KumesHayvanlari();
		kms4.beslenme();//animals clasýndan alirim dedi.=======Tum hayvanlar beslenir --Animals clasýndan geldi
		kms4.hareket();//animals clasýýndan alirim dedi.=======Kumes Hayvanlari yuruyerek hareket eder-KumesHayvanlari clasýndan geldi
		kms4.solunum();//animals clasýndan alýrým dedi=========Kuslar akcigerleri ile solunum yapar-Kuslar clasýndan geldi
	//kumes hayvanlarinda solunum olmadýgý icin animalsa gitti ancak animalstaki solunum methodu ile kuslar clasýndaki solunum methodu arasýnda 
		//override var o yuzden animals clasýndaki solunum methodu calismadý kuslar clasýndaki solunum methodu calisti.
	}

	public void hareket() {
		System.out.println("Kumes Hayvanlari yuruyerek hareket eder");
	}
	
		
	
}
