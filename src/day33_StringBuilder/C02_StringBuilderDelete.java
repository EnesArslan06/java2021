package day33_StringBuilder;

public class C02_StringBuilderDelete {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Java candir can");
		
		sb.deleteCharAt(11);//bunu kullanirsak sadece 11. index i siler
		System.out.println(sb);//Java candircan
		
		sb.delete(11,sb.length());
		System.out.println(sb);//Java candir //bu sekilde yazarsak cani siler. ilk indexi alýyor 2. indexi almiyor 
					//o yuzden length-1 demedik
		
		sb.delete(5,20);
		System.out.println(sb);//Java kaldi sadece. farketimyor baslanigici yazdýktan sonra.
		
		
		
		
	}

}
