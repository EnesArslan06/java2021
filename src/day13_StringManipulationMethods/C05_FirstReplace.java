package day13_StringManipulationMethods;

public class C05_FirstReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String str="Java            cok         guzel";
				//buradaki bosluklar� nas�l alacaz?
				str=str.replaceAll("\\s+", " "); //birden fazla olan bosluklar� tek boslukla duzelt. diye komut verdik ve atad�k.
	System.out.println(str);
	
	str=str.replaceAll("[a-k]", ""); //dersek a dan k ye kadar olan butun seylere hi�lik degeri verir.
	str=str.replaceAll("[a-z]", ""); // dersek butun kucuk harfleri yok eder.//bu sekilde olursa sadece J kal�r
System.out.println(str);
	
	String str2="Java            cok         guzel";
	System.out.println(str2.replaceAll("\\S", "*"));//buda bosluk olmayan yerlere y�ld�z koy demektir.
														//burasa //s koyarsakda bosluklar�n yerine * koyar.

	/*		\\s==> bosluk /Space
			\\S==> bosluk disi hersey
			\\w==> tum harfler ve rakamlar
			\\W==> harfler ve rakamlar disi hersey
			\\d==> Rakamlar
			\\D==>Rakamlar disi hersey
			\\S++==> Birden fazla bosluk varsa
			*/
	
	
	}}