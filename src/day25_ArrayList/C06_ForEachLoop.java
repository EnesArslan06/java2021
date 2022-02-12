package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hic ugrasmadan bir array veya listedeki tum elemanlarý gozden gecirmek isteriz
		
		int arr[]= {1,2,3,5,3,2,7};
		List<Integer> yeniList=new ArrayList<>();
		
		
		//bu arrayi esnek bir array yapmak istiyoruz index kullanmadan yapabilirz.
		//once index kullanarak yapalým farký görelim
		
		/*for (int i = 0; i < arr.length; i++) {
			yeniList.add(arr[i]);
		}							//bu sekildede olusturduk ama index ile olusturduk.
System.out.println(yeniList);*/

//Diger yontem******************************

for (int each : arr) {//arr deki herbir (each) int' i bana getir.Sýrasý onemli degil getir.
	yeniList.add(each); //bu kadarlada yapýlabiliyor 
	}
	
System.out.println("for each ile yaptýgýmýz: "+yeniList);

//eger bir list veya arrayin tum elemanlarýný elden gecirmek istiyorsak 
//ve siralama onemli degilse for each loop kullanabiliriz....



	}

}
