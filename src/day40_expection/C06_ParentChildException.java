package day40_expection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildException {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("src\\day40_expection\\yazi.txt");
		
			int k=0;
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
		
		} catch (IOException e) {//bu child exception, bu daha dar
			
		e.printStackTrace();
		
		} 
		System.out.println(" ");
		System.out.println("Gorev Tamamlandi");

	}

}
