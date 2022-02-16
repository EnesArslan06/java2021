package day32_varars_stringBuilder;

public class C05_StringBuilder {

	public static void main(String[] args) {
		
	//Bu sekilde olustururuz. Buyuk uygulamalar yapmak istedigimizde 
	//kullanabilir. String BUÝLDÝR ÝMMUATABLEDÝR DEGÝSTÝRÝLEBÝLÝR.
		
		
		
	StringBuilder str=new StringBuilder("Yasasin Dunya");
		
	str.append("!!!");
	System.out.println(str);
		
	str.toString().toUpperCase();//dedigimizde butun string methodlari ile kullanabiliriz.	
	System.out.println(str);//Yasasin Dunya!!! buyuk harf calismadý string oldugu icin atama yapmadan degeri kullanamaz.
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
