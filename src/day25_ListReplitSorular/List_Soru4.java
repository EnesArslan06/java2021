package day25_ListReplitSorular;

import java.util.ArrayList;
import java.util.Arrays;


public class List_Soru4 {
	/*Write a program that deletes the letters 'a' from the names in the list given as input.

    INPUT : 
    list1={"Ali","Veli","Ayse","Fatma","Omer"}
   ​
    OUTPUT : 
   ​     
    [Veli,Omer]*/
	
	public static void main(String[] args) {
		
		String arr[]= {"Ali","Veli","Ayse","Fatma","Omer"};
		ArrayList<String> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].contains("a")&&!arr[i].contains("A")) {
				list.add(arr[i]);
			}
			
		}
		
		
	/*for (int i = 0; i < sil.size(); i++) {
		if (sil.get(i).contains("a")||sil.get(i).contains("A")) {
			sil.remove(i);
		}
		!arr[i].contains("a")&&!arr[i].contains("A")
	}	*/

	
	System.out.println(list);
	}

}
