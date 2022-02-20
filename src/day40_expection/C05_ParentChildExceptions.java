package day40_expection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildExceptions {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("src\\day40_expection\\yazi.txt");
		
			int k=0;
			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
		
		} catch (FileNotFoundException e) {//bu child exception, bu daha dar
			
		e.printStackTrace();
		
		} catch (IOException e) {//bu parent exception, bu daha genis
			
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println("Gorev Tamamlandi");
	}

}
