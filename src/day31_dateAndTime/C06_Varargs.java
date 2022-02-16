package day31_dateAndTime;

import javax.sql.rowset.JoinRowSet;

public class C06_Varargs {

	public static void main(String[] args) {
		//Verilen sayilari toplayan bir method olusturmak istiyorum.
		
		
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		int f=60;
		
		
		topla(a,b);
		topla(a, b,c);
		topla(a,b,c,d);
		topla(a,b,c,d,e);
		topla(a,b,c,d,e,f);


		//su ana kadar gordugumuz sayilarla degisken parametreli 
		//tek bir method olusturamayýz.
		//variaty arguments demektir.
		//kac tane rakam toplayacagini ayni degerleri gider 
		//alir. BUnun icin her degisken eklendiginde method olusturmays gerek yoktur.
		//varargs icine for loop atip toplayabiliriz
		
	}

	private static void topla(int ... a) {
System.out.println("varargs calisir");		
	}

	private static void topla(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}

	private static void topla(int a, int b) {
		System.out.println(a+b);
		
	}

}
