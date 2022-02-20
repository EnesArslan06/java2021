package day40_expection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException  {
		// Javada bir dosyaya ulasmak istedigimizde file input stream clasýndan yardim alýrýz.
		//
		
		FileInputStream fis=new FileInputStream("src\\day40_expection\\yazi.txt");

		//java bu kodda olasý bir problem goruyor
//ve bu probleme karsi ne yapmasi gerektigini bize soruyor
//(yani altý cizilen her kod CTE degildir.
		
//bunun icin iki durum soz konusu
//1- try catch kullanarak bu problemi HANDLE edip javanin yola devam etmesini saglayabiliriz
//2- eger dosya okunamýyorsa kod calismasýn istiyorsakolayin farkinda oldugumuzu ve sorumlulugun bizde 
		//oldugumu javaya soylemeliyiz
	
	System.out.println("Gorev Tamamlandi");//koc calisiyor. mesela yolu degistirsek calismaz
	
	}

}
