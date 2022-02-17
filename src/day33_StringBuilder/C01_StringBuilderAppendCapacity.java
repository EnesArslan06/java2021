package day33_StringBuilder;

public class C01_StringBuilderAppendCapacity {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder();
		sb.length();//String builderin uzunlugunu verir
		System.out.println(sb.length());//0
		
		sb.capacity();
		System.out.println(sb.capacity());//16 
		//String builder kapasite belirtmezsek kendisi 16 karakterlik bir alanli olusturur.
		
		StringBuilder sb2=new StringBuilder("Java Candir");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuilder sb3=new StringBuilder(7);
		
		sb3.append("Mehlika");
		System.out.println(sb3.length());//7
		System.out.println(sb3.capacity());//7 builder zaten 7 karakterli idi, Mehlikada 7 karakterli oldugu icin sigdi.
		
		
		StringBuilder sb4=new StringBuilder(5);
		System.out.println(sb4.length());//0
		System.out.println(sb4.capacity());//5 uzunluk sifir cunku eklemedik birsey, kapasitesi 5
		
		sb4.append("Nilgun");//sb4 e nilgun eklersek
		System.out.println(sb4.length());
		System.out.println(sb4.capacity());

		sb4.append(" candir");//sb4 e candir ekleik eklersek
		System.out.println(sb4.length());//13
		System.out.println(sb4.capacity());//26
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.append(" candir.");
		System.out.println(sb);//Java candir.
		
		sb.append("anlasildi mi?", 3, 4);
		System.out.println(sb);//Java candir.a yazdýrdý // anlasildiminin 3. indexden 4. index ekadar olani yazdýrdý.
		
		
		
	}

}
