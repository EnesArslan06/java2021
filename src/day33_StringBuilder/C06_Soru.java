package day33_StringBuilder;

public class C06_Soru {

	public static void main(String[] args) {
		/*For loop ile 1000 defa islem yapalim.
		oncesinde ve sonrasinda zamani kontrol edip
		StringBuilder veBuilder String claslarýnString performanslarini karsilastirin?
		ipuvu= long Timesb=System.nanoTime(); kullanalim.*/
		
		String str="merhaba";
		StringBuilder sb=new StringBuilder("merhaba");
		sb.trimToSize();//capasity length boyutuna indirdik.
		
		long time1=System.nanoTime();
		
		for (int i = 0; i < args.length; i++) {
			str+=" ";
		}
		long time2=System.nanoTime();
		
		long stringSure=time2-time1;
	
		
long time3=System.nanoTime();
		
		for (int i = 0; i < args.length; i++) {
			sb.append(" ");
		}
		long time4=System.nanoTime();
		
		long sbSure=time4-time3;
		
		if (sbSure>stringSure) {
			System.out.println("String daha hizli");
		} else {
			System.out.println("StringBuilder daha hizli");			
		}
		
	
	}

}
