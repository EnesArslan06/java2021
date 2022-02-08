package day20_scope;

public class C02_InstanceVariables {
	//instance variable clasýn icinde main mathodun dýsýnda olacak
	int notMat=50;
	int notFen; //instance variable olusturuyorsak deger atamak zorunda degiliz.
			//instance variablelarýn scope'unda main method yoktur
	
	public static void main(String[] args) {
		
//System.out.println(notMat);//main method static oldugu icin static olmayan veriabllar
							//main methodda kullanýlamaz veya goruntulenemez.
		
		
	//instance variablelara main methoddan ulasmak istersek obje olusturup obje uzeerinden erisim saglayabiliriz.
	//scanner scan=new Scanner(System.in);
	//icinde oldugumuz bir classtan bir obje olusturalým
	
		C02_InstanceVariables celil=new C02_InstanceVariables();//obje olusturduk celil isminde
		
		//suan Celil diye bir obje olusturduk. Celil uzerinden static olmayan variablelalar ulasabiliriz.
		//burada classdan cagýrdýk oraadaki int degerini....
			
		System.out.println(celil.notMat);//burada yukarýda atadýgýmýz 50 degerini aldýk getirdik.
		C02_InstanceVariables Nihal=new C02_InstanceVariables(); //bir obje daha olusturduk
		
		Nihal.notMat=70;
		System.out.println(Nihal.notMat);//sonuc 70 cýkar
		
		//instance variablelerde deger atamazsak java instance olarak atanan degeri alýr 
		//bu class icin notmat=50 gibi. Ama istersek degerde atayabilir, 
		//bu durumda deger atadýgýmýz obje icin yeni deger gecerli olur.
		System.out.println(celil.notMat);//burada celilin notu icin tekrardan 50 yazdýrýr.Nihale atadýgýmýz deger 
														//celili baglamaz.
		//celilin notunu degistirmek istiyorsak
		celil.notMat=80; //yapmalýyýz. Bu sekilde yaparsak olur. simdi yazdýrýrsak artýk 80 olarak goruruz.
		
		//Method2();//method2 static olmadýgý icin main methoddan direk cagrýlamaz
		celil.Method2();//bu sekilde yaparsak calýsýr. Main methoddan cagýrabiliriz.
		//bu sekilde calýstýrýrsak sonuc method2 deki gibi yazdýrýr.ilk deger icin 0 atar.
		//cunku deger atanmadýgý icin.
		
		
		
		
	}
	public static void staticMethod() {
		//System.out.println(notFen); Buradan yine ulasamayýz Cunku Static methodlardan instance veriableye
		//direk ulasamayýz. Obje olusturmamýz lazým.
		
		
		
	}
	
	public  void Method2() {
		System.out.println("Method2 deki notFen: "+ notFen);// bu method static olmadýgý icin instance variablelara ulasabilir.
									//Obje olusturmaya gerek yoktur.
		notFen=100; //dedigimizde sadece celil icin variableyi degistirmis ve sonucu 100 yapmýs oluruz
		System.out.println("Method2 deki duzenlenmis notFen: "+ notFen);//bu sekilde yazdýrdý.
																//sadece Celili baglayan bir durum.
		
		
	}







}
