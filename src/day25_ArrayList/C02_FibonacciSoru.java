package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_FibonacciSoru {

	public static void main(String[] args) {
		// 100 den kucuk fibonecci sayilarini bir list olarak kaydedelim
		//1,1,2,3,5,8,13,21,34,.....bir onceki sayi ile toplami
	
	int sinir=100;
	
	List<Integer> fibonacci=new ArrayList<>();	
	
	fibonacci.add(1);//ilk elemani ekledik listeye
	fibonacci.add(1);//ikinciyide ekledik toplayarak gidecez
	
	int sayi=0;//while icin olusturduk
	
	while (sayi<sinir) {//sayimiz sinirdan kucuk oldugu muddetce
		sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
				fibonacci.add(sayi);
	}
	
	
	System.out.println(fibonacci);
	fibonacci.remove(fibonacci.size()-1);
	System.out.println(fibonacci);//
}}
