package day11_StringManipulationMethods;

public class C02_StringManipulationEqualsIgoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1 + " " + str2;
		System.out.println(str4);// ali can yazdýrýr.
		System.out.println(str3==str4); //false olur
		System.out.println(str3.equals(str4));//false olur. cunku degerlerde farklý buyuk kucuk harf farký var
	//Ignore methodu kucuk buyuk harfý diskalfiye ederek sadece degeri alýr kucuk buyuk harfe bakmaz.
		//System.out.println(str3.equalsIgnoreCase(str4)); //bu sekilde yaparsak kucuk buyuk harfi ortadan kalkar
	//kucuk ali can ve buyuk ali caný kabul etmiþ oluyor. Burada sadece equals ile yapmakda olmaz cunku buyuk kucuk harf
		//onemlli javanýn kodlarýnda.
		//hatýrlatma bu equals konusunusu esit mi noktasýnda kullanýrýz cunku 
		//Strig iffadeler sayýsay gibi bir ifade degildir.
}}