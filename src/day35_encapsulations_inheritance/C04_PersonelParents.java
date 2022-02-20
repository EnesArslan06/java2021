package day35_encapsulations_inheritance;

public class C04_PersonelParents {

	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	//eger variablalere access modifier yazmazsak java default access modifier atar.
	//boyle olursa sadece o package altindaki child classlar personel classýný inherit edebilir.
	//baska packagelardaki child classlarinda personeli inherid edebilmesi icin 
	//variable  ve metgodlarin access modifierlarini protected yapariz.
	//Public yazsakta inherid edilebilir. ama biz herkesin erismesini degilde sadece child class larin 
	//erismesini istedigimizden protected'i tercih ederiz.
	
	 C04_PersonelParents() {
		 System.out.println("Personel Parametresiz Constructorý calisti");
	}
	
	public static void main(String[] args) {
		
		
		
		
		

	}

}
