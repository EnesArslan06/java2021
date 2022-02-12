package day25_ArrayReplitSorulari;

public class ArrayMethodSoru7 {

	public static void main(String[] args) {
		/* Write a method that accepts an array as parameter and returns sum off all elements in the array 
		Then print the result in the main method.
		input : {1,2,3,4,5,6,7,8};
		output: 36*/
	
int array[]= {1,2,3,4,5,6,7,8};
	
	int toplam=0;
	
	for (int i = 0; i < array.length; i++) {
		toplam+=array[i];
	}
	
	System.out.println(toplam);
	
	
	
	
	
	}
	

}
