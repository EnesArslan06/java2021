package Day46_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue_Kuyruk {

	public static void main(String[] args) {
		// FÝFO (first in first out- ilk giren ilk cýkar, ekmek kuyrugu gibi)
		
		Queue<String> kuyruk=new LinkedList<>();//data turunu queue secmemizin nedeni sadece o  clasin ozeliklerini gormek
		
	kuyruk.add("Enes");
	kuyruk.add("Omer");
	kuyruk.add("Tugba");

	}

}
