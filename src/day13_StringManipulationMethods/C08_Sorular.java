package day13_StringManipulationMethods;

public class C08_Sorular {

	public static void main(String[] args) {
		//String methodlarini kullanarak "Java ogrenmek 123 Cok guzel@" String’ini “Java
		//ogrenmek cok guzel sekline getirin

String str="Java ogrenmek 123 Cok guzel@";
str=str.replaceAll("\\d", "").replaceAll("\\s","x")
.replaceAll("\\W", "").replaceAll("x"," ").replaceAll("  "," " ).concat(str);
	System.out.println(str);	
		
		

}}
