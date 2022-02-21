package day42_AbstractClass;

public class Ustabasi extends isci{

	public void statu() {//override oldu ayni methoddan burada da olusturduk yukaridakileri degil burdakileri geldi aldi
		System.out.println("bu classdaki tum personel ustabasidir. imza ustabasi");
	}
	public void maas() {
		System.out.println("Ustabaslari aylýk 10000 tl maas alýr.imza ustabasi");
	}
	public void mesai() {
		System.out.println("ustabasý arýza durumunda ariza cozunculeye kadar calisir...imza ustabasi.");
	}
	
	public static void main(String[] args) {

Ustabasi ust1=new Ustabasi();

ust1.statu();//personel clasýndan gidip aldý
ust1.maas();// muhasebe clasýndan aldi
ust1.mesai();//isci clasýndan aldý
	
//obje olusturdugumuz en alttaki class parent classlardaki methodlari
//override edince, class dan olusturulan objeler en dogru ve spesifik ozelliklere kavustu.
//ama clasik paret child iliskisinde tum methodlari override etme mecburiyeti yoktur.
//java parent class lardaki tum methodlari override etmek mecburiyeti kazandirmak icin 
//abstract class yapisini olusturmus olusturmustur.
//yani bir clasýý abstract olarak tanýmlarsanýz child class lar tum methodlari override etmek zorunda kalir
//dolayisi ile abstract  yaptýgýmýz Parent classslar sadece kalip görevi yapacakalar

	}

}
