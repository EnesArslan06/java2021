package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat);

	System.out.println(tarihSaat.toString().startsWith("2021"));	
		
		//2021 ile mi basl�yor dedik. Burada stringe cevirip islem yapt�k
	//date time in kendi methodu icerisinde var.
		
	}

}
