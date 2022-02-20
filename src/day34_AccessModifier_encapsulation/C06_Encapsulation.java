package day34_AccessModifier_encapsulation;

public class C06_Encapsulation {
	
	
	public static void main(String[] args) {
		
		C05 obj=new C05();
		System.out.println(obj.asgariMaasDefault);//
		//classic acess modifier ile bir variableye ulasbilirsek 
		//istedigimiz zaman degistirme secenegimiz olur.
		//ulasssin ama degistiremesin yapamiyoruz. Ulasilamamasini saglamak icin privete yapiyorum.
		
		C05 obj1=new C05();
		System.out.println(obj1.getAsgariMaasPrivate());//bu bize 5000 ini getirecek ancak
		//bunu okuayabilecez ancak degistiremeyecez.
		//obj1.AsgariMaasPrivate=6000; gorebiliyorum ancak degistiremiyorum
		//istedigimiz kadar obje olusturalim private yapalim her objede görebiliriz ancak degistirilemez.
		
		
	}

}
