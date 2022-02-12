package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hic ugrasmadan bir array veya listedeki tum elemanlar� gozden gecirmek isteriz
		
		int arr[]= {1,2,3,5,3,2,7};
		List<Integer> yeniList=new ArrayList<>();
		
		
		//bu arrayi esnek bir array yapmak istiyoruz index kullanmadan yapabilirz.
		//once index kullanarak yapal�m fark� g�relim
		
		/*for (int i = 0; i < arr.length; i++) {
			yeniList.add(arr[i]);
		}							//bu sekildede olusturduk ama index ile olusturduk.
System.out.println(yeniList);*/

//Diger yontem******************************

for (int each : arr) {//arr deki herbir (each) int' i bana getir.S�ras� onemli degil getir.
	yeniList.add(each); //bu kadarlada yap�labiliyor 
	}
	
System.out.println("for each ile yapt�g�m�z: "+yeniList);

//eger bir list veya arrayin tum elemanlar�n� elden gecirmek istiyorsak 
//ve siralama onemli degilse for each loop kullanabiliriz....



	}

}
