package day35_encapsulations_inheritance;

public class C03_Setter {

	public static void main(String[] args) {
		//ogretmenler ogrencinin notunu girebilsin ama tum notlarini goremesin,
		//sadece gecip gecemedigini gorsun
		
		
		
		C01 ogrenciNot=new C01();

		System.out.println(ogrenciNot.isGecerMi());//C01 clasýna gittiorada not 50den kucuk oldugu icin
							//gecermi false olarak donderdi
		
		//simdi not girelim ve oyle deneyelim
		
		ogrenciNot.setNot(60);
		
		System.out.println(ogrenciNot.isGecerMi());//true verdi. Set ile notu degistirdik get methodu ile sonucu 
		//gorebildik.0
		
		
	}

}
