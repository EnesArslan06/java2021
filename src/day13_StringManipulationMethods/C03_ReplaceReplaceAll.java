package day13_StringManipulationMethods;

public class C03_ReplaceReplaceAll {

	public static void main(String[] args) {
		
		String str2= "Java Ogrenmek cok zevkli";
		// buradaki bosluklarý yok edin.
		System.out.println(str2.replace(" ", ""));
		
		//ogrenmek yerine kod yazmak yazdýrýn
		System.out.println(str2.replace("Ogrenmek", "kod yazmak"));
		
System.out.println(str2.replace("e", "a")); // e yerine a yaz
System.out.println(str2.substring(3));

String str="Java            cok         guzel";
//buradaki bosluklarý nasýl alacaz?
str=str.replaceAll("\\s+", " "); //birden fazla olan bosluklarý tek boslukla duzelt. diye komut verdik ve atadýk.
System.out.println(str);

str=str.replaceAll("[a-k]", ""); //dersek a dan k ye kadar olan butun seylere hiçlik degeri verir.
str=str.replaceAll("[a-z]", ""); // dersek butun kucuk harfleri yok eder.//bu sekilde olursa sadece J kalýr
System.out.println(str);

String str3="Java            cok         guzel";
System.out.println(str3.replaceAll("\\S", "*"));//buda bosluk olmayan yerlere yýldýz koy demektir.
										//burasa //s koyarsakda bosluklarýn yerine * koyar.

/*		\\s==> bosluk /Space
\\S==> bosluk disi hersey
\\w==> tum harfler ve rakamlar
\\W==> harfler ve rakamlar disi hersey
\\d==> Rakamlar
\\D==>Rakamlar disi hersey
\\S++==> Birden fazla bosluk varsa
*/

	

}}
