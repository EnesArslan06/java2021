package day33_StringBuilder;



public class C03_StringBuilderEqulas {

	public static void main(String[] args) {

StringBuilder sb1=new StringBuilder("Java");
StringBuilder sb2=new StringBuilder("Java");
		
System.out.println(sb1==sb2);//false
System.out.println(sb1.equals(sb2));//false
//String builder da equalsda olsa == de olsa icerige bakmaz referansa bakar dolayisi ile false verir
//builderlari == veya equals ile karsilastiramayiz. compare kullanmaliyiz


//System.out.println(sb1.compareTo(sb2));//0
//compareto ilk harflerden baslayarak builderlari karsilastirir. tüm karakterler ayni ise sonuc sifir doner
//farkli karakterler bulursa ilk yazilan sb ikinci yazilandan kac char onde onu yazar.
//if (sb1.compareTo(sb2)==0) {} ile bakmaliyiz 0 args esitse demekki ik Builder esittirBuilder.


String str="Java";
//System.out.println(sb1==str); builder ile string karsilastirilamaz
System.out.println(sb1.equals(str));//false dondurur, karsilastirilamaz.

//System.out.println(sb1.compareTo(str)); compare da string icin kullanilamaz.

//System.out.println(sb1=="Java");
System.out.println(sb1.equals("Java"));//false
//System.out.println(sb1.compareTo("Java"));

//baska bir obje ile baska bir objenin esitligi kabul etmiyor.


	}

}
