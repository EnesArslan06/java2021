package day33_StringBuilder;

public class C05_StringBuilderReverse {

	public static void main(String[] args) {
		// verilen bir cumleyi tersten yazdir
		
		StringBuilder sb=new StringBuilder("Java ne kadar kolay");

		System.out.println(sb.reverse());
		//tersten yazdirma methodu.
		
	
		//subSquance
		
		StringBuilder sb2=new StringBuilder("Java ne kadar kolay");
	
		
		System.out.println(sb2.substring(14));//kolay
		System.out.println(sb2.subSequence(14,19));//kolay
		
		//subSequance de atamada yaptirir.
		
		//ikiside ayni sonucu dondurur. ancak substring methodu string classindan geldigi icin 
		//String methodlarini arkasindan kullanabilirim
		//ancak subSequence de bu mumkun olmaz.
		
		//toString methodu da StringBuildere Stringe cevirir.
		
		//trimtoSize(); String buildere capacity ile length esitler.
		
	
	}
	

}
