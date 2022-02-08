package day13_StringManipulationMethods;

public class C09_Sorular {

	public static void main(String[] args) {
		/* String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		String
		str 1: "13.99"
		String
		str 2: "10.55"
		ipucu
		Double parseDouble() methodunu kullanabilirsiniz */

String str1="$13.99";
String str2="$10.55";

str1=str1.replace("$", "");

str2=str2.replace("$", "");

System.out.println("Str1 ve Str2 toplamý : " + (Double.parseDouble(str1)+Double.parseDouble(str2))+ " $");

	}

}
