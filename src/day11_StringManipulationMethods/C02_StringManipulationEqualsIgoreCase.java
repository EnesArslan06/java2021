package day11_StringManipulationMethods;

public class C02_StringManipulationEqualsIgoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1 + " " + str2;
		System.out.println(str4);// ali can yazd�r�r.
		System.out.println(str3==str4); //false olur
		System.out.println(str3.equals(str4));//false olur. cunku degerlerde farkl� buyuk kucuk harf fark� var
	//Ignore methodu kucuk buyuk harf� diskalfiye ederek sadece degeri al�r kucuk buyuk harfe bakmaz.
		//System.out.println(str3.equalsIgnoreCase(str4)); //bu sekilde yaparsak kucuk buyuk harfi ortadan kalkar
	//kucuk ali can ve buyuk ali can� kabul etmi� oluyor. Burada sadece equals ile yapmakda olmaz cunku buyuk kucuk harf
		//onemlli javan�n kodlar�nda.
		//hat�rlatma bu equals konusunusu esit mi noktas�nda kullan�r�z cunku 
		//Strig iffadeler say�say gibi bir ifade degildir.
}}