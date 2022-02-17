package day33_StringBuilder;

public class C04_StringBuilderInsert {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Java ogrendik");
		
		//araya cok iyi ekleyelim.
		
		System.out.println(sb1.insert(4, "yi cok iyi"));
		
		//cok cok ekleyelim
		
		String str="cok iyiyim";
		System.out.println(sb1.insert(7, str, 0, 4));
		//cok iyiyimden coku alýp ekleyecez
		//baska bir kelimeden alip istedigimiz bolumu ekleyebiliriz.
		
		
		
		
		
		

	}

}
