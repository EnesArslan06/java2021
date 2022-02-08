package day15_MethodCreation;

import java.util.Scanner;

public class C04_MethodCreationSoru {

	public static void main(String[] args) {
		/*Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre

	- @ isareti icermiyorsa gecersiz email yazdirin
	- @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
	- @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz" */
	Scanner scan=new Scanner(System.in); 
	
	System.out.println("Lutfen Emailinizi giriniz: ");
	String email=scan.next();
	emailmethod(email);
	
	scan.close();
	}

	private static void emailmethod(String email) {
		
			
		if (!email.contains("@")) {System.out.println("Gecersiz email...");
			
		} else if (!email.contains("@gmail.com")) {System.out.println("lutfen gecerli bir gmail adresinizi girin..");
			
		} else if (!email.endsWith("@gmail.com")) {System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
			
		}else{System.out.println("Email adresiniz basarýlý bir sekilde kaydedildi.."); }
		

		
}		
		
		
		
	

	


}
