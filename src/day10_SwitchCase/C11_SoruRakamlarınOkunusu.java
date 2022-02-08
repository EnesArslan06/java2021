package day10_SwitchCase;

import java.util.Scanner;

public class C11_SoruRakamlarınOkunusu {

	public static void main(String[] args) {
		// Girilen 3 basamakli bir sayiyi yaziile yazdiriniz

	Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 basamaklý bir sayi giriniz...");
	int sayi=scan.nextInt();
	
	int birler=sayi%10;
	int onlar=(sayi/10)%10;
	int yuzler=sayi/100;
	
	switch(yuzler) {
	
	case 1: System.out.print("YUZ "); break;
	case 2: System.out.print("IKIYUZ "); break;
	case 3: System.out.print("UCYUZ "); break;
	case 4: System.out.print("DORTYUZ "); break;
	case 5: System.out.print("BESYUZ "); break;
	case 6: System.out.print("ALTIYUZ "); break;
	case 7: System.out.print("YEDÝYUZ "); break;
	case 8: System.out.print("SEKIZYUZ "); break;
	case 9: System.out.print("DOKUZYUZ "); break;
	default : System.out.print("Gecerli bir rakam giriniz");}
	
	switch(onlar) {
	
	case 1: System.out.print("ON "); break;
	case 2: System.out.print("YIRMI "); break;
	case 3: System.out.print("30 "); break;
	case 4: System.out.print("KIRK "); break;
	case 5: System.out.print("ELLI "); break;
	case 6: System.out.print("ALTMIS "); break;
	case 7: System.out.print("YETMIS "); break;
	case 8: System.out.print("SEKSEN "); break;
	case 9: System.out.print("DOKSAN "); break;
	default : System.out.print("Gecerli bir rakam giriniz");}
	
	switch(birler) {
	case 1: System.out.print("BÝR "); break;
	case 2: System.out.print("IKI "); break;
	case 3: System.out.print("UC "); break;
	case 4: System.out.print("DORT "); break;
	case 5: System.out.print("BES "); break;
	case 6: System.out.print("ALTI "); break;
	case 7: System.out.print("YEDÝ "); break;
	case 8: System.out.print("SEKIZ "); break;
	case 9: System.out.print("DOKUZ "); break;
	default : System.out.print("Gecerli bir rakam giriniz");}
	
scan.close();	
	
	}}

