package day09_nestedElse;

import java.util.Scanner;

public class artık_yıl_sorusu {

	public static void main(String[] args) {
		/*Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
	       Kural 1: 4 ile bolunemeyen yillar artik yil degildir
	       Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
	       Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
	                sadece 400’un kati olan yillar artik yildir*/
		
Scanner scan=new Scanner(System.in);

        
       /*int year = scan.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Artik yil");
        } else {
            System.out.println("olmadi be haci");
        }*/
        
/*Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
       Kural 1: 4 ile bolunemeyen yillar artik yil degildir
       Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
       Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan
                sadece 400’un kati olan yillar artik yildir
       
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir yil giriniz");
		int yil =scan.nextInt();
		if (yil%4!=0) {
			System.out.println("artik yil degildir");
		 } else if (yil%100!=0){
			 System.out.println("artik yildir");
		} else if (yil%400==0) {
			System.out.println("artik yildir");
		} else {
			System.out.println("artik yil degildir1"); }		{}		*/	
	
 //DİGER YONTEM
      //ARTIK YIL
      //4′e tam bölünen yıllar artık yıldır.
      //100′e tam bölünen yıllar artık yıl değildir.
      //400′e tam bölünen yıllar artık yıldır.
      //4000′e tam bölünen yıllar artık yıl değildir.
              
          /*    System.out.println("Lütfen bir yıl giriniz =");
              Scanner scan=new Scanner(System.in);
              int yil =scan.nextInt();
              
              if ((yil%4==0) && (yil%100==0) && (yil%400==0) && (yil%4000!=0)) {
                  System.out.println("artık yıldır.");
                  
              }else {
                  System.out.println("artık yıl değildir");
                   */
scan.close();  
}

}
