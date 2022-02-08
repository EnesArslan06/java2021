package day20_scope;

public class C02_InstanceVariables {
	//instance variable clas�n icinde main mathodun d�s�nda olacak
	int notMat=50;
	int notFen; //instance variable olusturuyorsak deger atamak zorunda degiliz.
			//instance variablelar�n scope'unda main method yoktur
	
	public static void main(String[] args) {
		
//System.out.println(notMat);//main method static oldugu icin static olmayan veriabllar
							//main methodda kullan�lamaz veya goruntulenemez.
		
		
	//instance variablelara main methoddan ulasmak istersek obje olusturup obje uzeerinden erisim saglayabiliriz.
	//scanner scan=new Scanner(System.in);
	//icinde oldugumuz bir classtan bir obje olustural�m
	
		C02_InstanceVariables celil=new C02_InstanceVariables();//obje olusturduk celil isminde
		
		//suan Celil diye bir obje olusturduk. Celil uzerinden static olmayan variablelalar ulasabiliriz.
		//burada classdan cag�rd�k oraadaki int degerini....
			
		System.out.println(celil.notMat);//burada yukar�da atad�g�m�z 50 degerini ald�k getirdik.
		C02_InstanceVariables Nihal=new C02_InstanceVariables(); //bir obje daha olusturduk
		
		Nihal.notMat=70;
		System.out.println(Nihal.notMat);//sonuc 70 c�kar
		
		//instance variablelerde deger atamazsak java instance olarak atanan degeri al�r 
		//bu class icin notmat=50 gibi. Ama istersek degerde atayabilir, 
		//bu durumda deger atad�g�m�z obje icin yeni deger gecerli olur.
		System.out.println(celil.notMat);//burada celilin notu icin tekrardan 50 yazd�r�r.Nihale atad�g�m�z deger 
														//celili baglamaz.
		//celilin notunu degistirmek istiyorsak
		celil.notMat=80; //yapmal�y�z. Bu sekilde yaparsak olur. simdi yazd�r�rsak art�k 80 olarak goruruz.
		
		//Method2();//method2 static olmad�g� icin main methoddan direk cagr�lamaz
		celil.Method2();//bu sekilde yaparsak cal�s�r. Main methoddan cag�rabiliriz.
		//bu sekilde cal�st�r�rsak sonuc method2 deki gibi yazd�r�r.ilk deger icin 0 atar.
		//cunku deger atanmad�g� icin.
		
		
		
		
	}
	public static void staticMethod() {
		//System.out.println(notFen); Buradan yine ulasamay�z Cunku Static methodlardan instance veriableye
		//direk ulasamay�z. Obje olusturmam�z laz�m.
		
		
		
	}
	
	public  void Method2() {
		System.out.println("Method2 deki notFen: "+ notFen);// bu method static olmad�g� icin instance variablelara ulasabilir.
									//Obje olusturmaya gerek yoktur.
		notFen=100; //dedigimizde sadece celil icin variableyi degistirmis ve sonucu 100 yapm�s oluruz
		System.out.println("Method2 deki duzenlenmis notFen: "+ notFen);//bu sekilde yazd�rd�.
																//sadece Celili baglayan bir durum.
		
		
	}







}
