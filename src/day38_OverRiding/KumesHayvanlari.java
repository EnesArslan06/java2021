package day38_OverRiding;

public class KumesHayvanlari extends Kuslar {

	
	
	
	
	public static void main(String[] args) {
		KumesHayvanlari kms1=new KumesHayvanlari();
		kms1.beslenme();//Animals clas�ndan al�r
		kms1.hareket();//KumesHaayvanlari methodundan alir
		kms1.solunum();//Kuslar class�ndan al�r
		//hareket methodu overriding edildi. Kuslar clas�ndan olan hareket methodu degil buradaki hareket methodu calisti.
		
		Kuslar kms2=new KumesHayvanlari();
		kms2.beslenme();//Animals class�ndan al�r
		kms2.hareket();//Kuslar clas�ndan al�r//burada methodu kuslar class�ndan ald� ancak yazd�rmas� bu methoddan oldu
						//yani o method calisti ancak buradaki"Kumes Hayvanlari yuruyerek hareket eder" yazd�rd�.
		//Kuslar clas�ndan bir method olusturduk kms2 diye. kms2 hareket methodu icin Kuslar class�na gitti bakti hareket methoduna
		//overriden edilmis bir method o zaman baktiki bu olusturlan obje icin buradaki methodu calistirdi. 
		//Kuslar kms2=new KumesHayvanlari(); soldaki "Kuslar"parametreturu  Sagdaki "KumesHayvanlari" constructor.
		
		kms2.solunum();//Kuslar class�ndan al�r
		
		
		Kuslar kms3=new Kuslar();
		kms3.beslenme();//Tum hayvanlar beslenir
		kms3.hareket();//Kuslar ucarak hareket eder
		kms3.solunum();//uslar akcigerleri ile solunum yapar
		
		
		
		Animals kms4=new KumesHayvanlari();
		kms4.beslenme();//animals clas�ndan alirim dedi.=======Tum hayvanlar beslenir --Animals clas�ndan geldi
		kms4.hareket();//animals clas��ndan alirim dedi.=======Kumes Hayvanlari yuruyerek hareket eder-KumesHayvanlari clas�ndan geldi
		kms4.solunum();//animals clas�ndan al�r�m dedi=========Kuslar akcigerleri ile solunum yapar-Kuslar clas�ndan geldi
	//kumes hayvanlarinda solunum olmad�g� icin animalsa gitti ancak animalstaki solunum methodu ile kuslar clas�ndaki solunum methodu aras�nda 
		//override var o yuzden animals clas�ndaki solunum methodu calismad� kuslar clas�ndaki solunum methodu calisti.
	}

	public void hareket() {
		System.out.println("Kumes Hayvanlari yuruyerek hareket eder");
	}
	
		
	
}
