package day28_constructorCall_staticKeyword;

public class C03 {

	public static void main(String[] args) {
					//bir onceki classdan kopyaladýgýmýz main methodu buraya kopyaladik
		//biz obje olustururken illa ayni classdan olusturmak zorunda degiliz
		//static olan y run time boyunca 40 olur. yani calismaya basladi biz y yi 10 ile baslattik
		//asama asama 40 oldu bu class icindede  run time calýstýkca artar.
		//biz calýsma yaparken bilgileri databasede tutarýz javada calisiriz. 
		//Cunku java bastan calýsmaya baslar verilerde
		//olan bir hata yada týkanýklýk butun sistemi altust eder. Java runtime bir programdýr. Run tusuna bastigimizda java calýsmaya baslar
		//javanýn isi bittiginde (calýsma tusu kýrmýzýdan griye dondugunde)
		//hersey basa doner.
		
		
				C02 obje1=new C02();
				//bir classta hem instance hemde statik variable var ise obje uzerinde bir daha y isaretlemem gerek yok
				//cunku static classýn malidir. 
				
				System.out.println("obje1 icin x : "+ obje1.x+ " obje1 icin y: " + obje1.y);
								//obje1 icin x : 5 obje1 icin y: 10
				//x++;
				//y++; //dedigimizde x icin olaninda hata verir cunku x e direk ulasamayiz
				
				obje1.x++;
				C02.y++;//bu sekilde yazarsakda y icin ulasabilir cunku static bir veriabledir.
				
				System.out.println("obje1 icin x : "+ obje1.x+ " obje1 icin y: " + obje1.y);
							//obje1 icin x : 6 obje1 icin y: 11 ikisinide 1 artirdi. x++ desek olmuyor ama obje1.x dememiz lazim
							//burada y nin degeride 11 oldu. Ancak x in degeri degismedi 5 olarak kaldi.
				
				C02 obje2=new C02();
				System.out.println("obje2 icin x : "+ obje2.x+ " obje2 icin y: " + obje2.y);
							//obje2 icin x : 5 obje2 icin y: 11
				
				obje2.x++;// x i 5 den 1 aartirdi
				obje1.y++; // y ise zaten 11 olmustu yukarida ona ++ ekledi ve 12 oldu
				//static bir veriable'a class ismi uzerinden ulsamaya calýsýrsaniz
				//java cte vermez ama solda ! unlem isareti ile bizi uyarir.
				//"static bir field olan C02.y ye static yoldan ulas" der
				
				System.out.println("obje2 icin x : "+ obje2.x+ " obje2 icin y: " + obje2.y);
				//obje2 icin x : 6 obje2 icin y: 12
				
				System.out.println("obje 2 olusturuldak sonra ve islemden sonra obje1'in"
						+" x: " +obje1.x+ " y: "+ obje1.y);
				//obje 2 olusturuldak sonra ve islemden sonra obje1'in x: 6 y: 12
			//obje1 1 de x in degeri x icin 6di   y icin 11 idi. obje 2 icinde y yi 12 yaptik,
				//y static oldugu icin bu class boyunca degeri her yapilan obje icin etkili olur.
				
				C02 obje3=new C02();
				
				obje3.x=20; //obje x=20 demek istedik
				C02.y=40;//static variable ve methodlar bulunduklarý class ile ilintilidir(obje ile degil)
				//baska bir class da iken C02 deki static variable veya methoda ulasmak istedigimizde
				//C02.staticVariableismi ve C02.staticMethodismi() yazmamiz yeterli olur
				
				System.out.println("obje 3 den sonra obje1'in x : " + obje1.x);//6 olur obje 1 de 6 idi burada da 6
				System.out.println("obje 3 den sonra obje2'in x : " + obje2.x);//6 olur obje 2 de 6 idi burada da 6
				System.out.println("obje 3 den sonra obje3'un x : " + obje3.x);//20 olur bu objeye ozel 20 ye esitlemistik.
				
				System.out.println("obje 3 den sonra obje1'in y : " + obje1.y);//40 olur 
				System.out.println("obje 3 den sonra obje2'in y : " + obje2.y);//40 olur 
				System.out.println("obje 3 den sonra obje3'un y : " + obje3.y);//40 olur cunku y static bir degisiklik bu classdaki her
																			// ye degerini degistirir.
				

	

}}
