package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysListEquals {

	public static void main(String[] args) {
		// equals methodu vard�r esitimi onu kontrol eder.
		//clear methedu ArrayListedeki her seyi siler

//arrayi array lisete cevirebiliriz ancak cevirdigimiz array liste ekleme yapamayiz, boyutunu degistiremeyiz	
		

String arr[]= {"A", "b", "C", "d"};		
List<String> arraydenList=Arrays.asList(arr);		
		
System.out.println(arraydenList);//	[A, b, C, d] liste olarak yazd�rabildik.

//arraydenList.add("F");

//System.out.println(arraydenList);//run time error verdi. 
								//Cunku birsey ekleyemeyiz arrayden arrayListe gectigimiz icin

//rte hatasi verir CTE hatasi vermesi icin sytax te bir hata olmasi laz�m. 
//Ama burada List e eklemek kolay ve s�k�nt�s�z
//ancak arrayden ald�g�m�z icin rte verir


					
arr[1]="Z";  
System.out.println("arrayi degistirdikten sonra, array: "+ Arrays.toString(arr));//arrayi degistirdikten sonra, array: [A, Z, C, d]

System.out.println("arrayi degistirdikten sonra, list: "+ arraydenList);//arrayi degistirdikten sonra, list: [A, Z, C, d]

//listi degistirmedigimiz halde arrayi degistirdikten sonra Listte otomatik degisiyor. 

arraydenList.set(3, "D"); //listedeki kucuk d yi buyuk D harfi yapt�k
System.out.println("Listi degistirdikten sonra list:" +arraydenList);

System.out.println("Listi degistirdikten sonra array:"+ Arrays.toString(arr));
//once listi degistirdik arrayde degisti. ikisi artik ayn� sayilir sadece kabuklari farkli




	}

}
