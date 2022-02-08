package day16_forLoop;

public class C03_forLoopSoru {

	public static void main(String[] args) {
		// 10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda yazdirin

	for (int i =10; i <=30; i++) { //bunu yazdýrdýgýmýz zaman en son 30. rakamda da sonuna virgul koyuyor bunu kaldýralým
		
	if (i==30) {System.out.print(i);
		
	} else {System.out.print(i+",");

	}			//bu sekilde yaparsak daha guzel calýsýr. diger yontem ise 29 dahil yazdýralým 30 icin ayrýca bir
	}			//syso acarsak bos olanýndan duzelmez.
		
		


	
}}
