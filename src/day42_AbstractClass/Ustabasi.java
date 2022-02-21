package day42_AbstractClass;

public class Ustabasi extends isci{

	public void statu() {//override oldu ayni methoddan burada da olusturduk yukaridakileri degil burdakileri geldi aldi
		System.out.println("bu classdaki tum personel ustabasidir. imza ustabasi");
	}
	public void maas() {
		System.out.println("Ustabaslari ayl�k 10000 tl maas al�r.imza ustabasi");
	}
	public void mesai() {
		System.out.println("ustabas� ar�za durumunda ariza cozunculeye kadar calisir...imza ustabasi.");
	}
	
	public static void main(String[] args) {

Ustabasi ust1=new Ustabasi();

ust1.statu();//personel clas�ndan gidip ald�
ust1.maas();// muhasebe clas�ndan aldi
ust1.mesai();//isci clas�ndan ald�
	
//obje olusturdugumuz en alttaki class parent classlardaki methodlari
//override edince, class dan olusturulan objeler en dogru ve spesifik ozelliklere kavustu.
//ama clasik paret child iliskisinde tum methodlari override etme mecburiyeti yoktur.
//java parent class lardaki tum methodlari override etmek mecburiyeti kazandirmak icin 
//abstract class yapisini olusturmus olusturmustur.
//yani bir clas�� abstract olarak tan�mlarsan�z child class lar tum methodlari override etmek zorunda kalir
//dolayisi ile abstract  yapt�g�m�z Parent classslar sadece kalip g�revi yapacakalar

	}

}
