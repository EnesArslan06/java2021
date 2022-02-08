package day19_DoWhileLoop;

public class C04_DoWhileLoopSoru {

	public static void main(String[] args) {
		//’m’ harfinden baslayarak ‘c’ harfine kadar (dahil) tum harfleri

		for (char i = 'm'; i >= 'c'; i--) {
			
			System.out.print(i+ " ");
		}
				System.out.println(" "); //asagý satýra inmesi icin bos syso koyuyoruz
		
				
			char krk='m';
			while (krk>='c') {
				System.out.print(krk+ " ");
				krk--;
			}
		System.out.println(" ");
		char harf='m';
		
		do { 
			System.out.print(harf+ " ");
			harf--;
		} while (harf>='c');	
			
}}
