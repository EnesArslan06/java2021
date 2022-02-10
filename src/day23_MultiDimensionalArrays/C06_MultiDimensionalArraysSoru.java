package day23_MultiDimensionalArrays;

public class C06_MultiDimensionalArraysSoru {

	public static void main(String[] args) {
		// Soru 1 ) Asagidaki multi dimensional
		//array’in tum elemanlarinin carpimini ekrana  yazdiran bir method yaziniz.
		//{ {1,2,3}, {4,5,6} }

		int arr[][]= {{1,2},{3,4,5,6}}; //nested loop ile cozulecek.
	
		int carpim=1;
		
		for (int i = 0; i <arr.length; i++) {//ilk forloop dýsardaki array icin yapýldý
			for (int j = 0; j < arr[i].length; j++) {//buda icerideki arraylerin 
				carpim*=arr[i][j];
			}
			
		}
		
		System.out.println(carpim);
		
		
		
		//carpimYazdir(arr);
		/*	public static void carpimYazdir(int[][] arr) {
	        int carpim=1;
	        
	        for (int i = 0; i < arr.length; i++) {
	            
	            for (int j = 0; j < arr[i].length; j++) {
	                
	                carpim*=arr[i][j];          
	            }   
	        }
	        System.out.println(carpim);
	        
	    }*/

}}
