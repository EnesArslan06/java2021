package Day46_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		//verilen bir array ddeki tekrar eden sayilari silip 
		//unique degerlerden olusan bir array olusturun.
		
	int arr[]= {3,1,2,3,2,1,8,8,8,7,6,5,4,3,2,1,7};
	
	Set<Integer> benzersizSet=new HashSet<>();
	
		for (Integer each : arr) {//hash set tekrarli olan elemanlari almaz, 
								//onceden array veya list ile yaptigimiz islemi bunda kolayca yapariz
			benzersizSet.add(each);
		}
		System.out.println(benzersizSet);//[1, 2, 3, 4, 5, 6, 7, 8] //seti arraye eklemeliyiz
		
		Object[] tekrarsizArr=benzersizSet.toArray();
		
		System.out.println(Arrays.toString(tekrarsizArr));//[1, 2, 3, 4, 5, 6, 7, 8] bu yontemle yapilabilir.
		//diger yontem bir array olusturup, arrayin sizeni setinkine esitler for each ile yapabiliriz.
		
		
	}

}
