package day32_varars_stringBuilder;

public class C05_StringBuilder {

	public static void main(String[] args) {
		
	//Bu sekilde olustururuz. Buyuk uygulamalar yapmak istedigimizde 
	//kullanabilir. String BU�LD�R �MMUATABLED�R DEG�ST�R�LEB�L�R.
		
		
		
	StringBuilder str=new StringBuilder("Yasasin Dunya");
		
	str.append("!!!");
	System.out.println(str);
		
	str.toString().toUpperCase();//dedigimizde butun string methodlari ile kullanabiliriz.	
	System.out.println(str);//Yasasin Dunya!!! buyuk harf calismad� string oldugu icin atama yapmadan degeri kullanamaz.
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
