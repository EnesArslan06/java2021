package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList_SetMethodu {

	public static void main(String[] args) {
	// arrayde var olan bir indexteki elemaný egistirmeye yarar.
	//Stringdeki replace benzer. Set methodu ekleme yapmaz sadece var olanlarý degistirmeye yarar.
	//get methodu Array listedeki istenen indexdeki elemaný bulur getirir.
	//contaims methodu Arraylistte bir elementin var olup olmadýgýný kontrol eder.
		//varsa true, yoksa false olarak doner
		
//verilen bir array de tekrar eden elementleri sadece birer adet yazarak 
		//unique elementlerden olusan bir array haline getirelim
		
		
		
	
		int arr[]={2,3,4,5,6,7,8,9,3,4,5,6,0,3,5,9,8};
		
		List<Integer> tekrarsiz=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {//listem bu elemaný icermiyorsa
				
				tekrarsiz.add(arr[i]);
				
			}
		}
		
		System.out.println(tekrarsiz);
	
		int tekrarsizArray[]=new int[tekrarsiz.size()];// listedekileri arraye aktardýk
		
		
		for (int i = 0; i < tekrarsizArray.length; i++) {
			
			tekrarsizArray[i]=tekrarsiz.get(i);	
		}
		
		
		Arrays.sort(tekrarsizArray);
		System.out.println(Arrays.toString(tekrarsizArray));
		
}}
