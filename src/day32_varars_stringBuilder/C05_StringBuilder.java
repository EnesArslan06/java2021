package day32_varars_stringBuilder;

public class C05_StringBuilder {

	public static void main(String[] args) {
		
	//Bu sekilde olustururuz. Buyuk uygulamalar yapmak istedigimizde 
	//kullanabilir. String BUİLDİR İMMUATABLEDİR DEGİSTİRİLEBİLİR.
		
		
		
	StringBuilder str=new StringBuilder("Yasasin Dunya");
		
	str.append("!!!");
	System.out.println(str);
		
	str.toString().toUpperCase();//dedigimizde butun string methodlari ile kullanabiliriz.	
	System.out.println(str);//Yasasin Dunya!!! buyuk harf calismadı string oldugu icin atama yapmadan degeri kullanamaz.
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
