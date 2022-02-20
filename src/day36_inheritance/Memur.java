package day36_inheritance;

import day35_encapsulations_inheritance.C05_Muhasebe;

public class Memur extends C05_Muhasebe{

	public static void main(String[] args) {
		//day 35 classýndan  import edecez personel isci muhasebe classlarina ulasabilicegiz
		
		Memur memur1=new Memur();
		
		memur1.isim="Hasan";
		memur1.saatUcreti=16;

		
		memur1.maas=memur1.maasHesapla();//C05 deki muhasebe methodundan gidip calistiracak.
		System.out.println(memur1.isim+" "+memur1.maas+ " maasi");
	
}
}
