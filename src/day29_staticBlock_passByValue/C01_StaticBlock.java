package day29_staticBlock_passByValue;

public class C01_StaticBlock {
//Bir class cal�st�r�ld�g�nda once main calisir, ancak static block varsa mainden once o calisir.
	
	static {
	System.out.println("static block main methoddan bile once calisir");
	}
	
	
	public static void main(String[] args) {
	System.out.println("Javada once main method calisir");

	}

	static {
		System.out.println("static block nereye yaz�l�rsa yazilsinn main methoddan bile once calisir");
		}
	//eger birden fazla static block varsa JAva yukaridakini daha once cal�st�r�r.
	
	
	
	
	
}
