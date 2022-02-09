package day21_scopVeArrays;

import java.util.Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// birden fazlavariable depolamak icin kullanılabilen object(non-primitive data)lerdir.
		//bu gune kadarki gordugumuz variableler bir tane deger alırdı.
		//int sayi=5; sayi=7; sayi=10; burada sayiların degerini oldurerek yukselttik.
//arrayler onceden tanımlanmak zorundadır. 
//icine kactane data turu koyacagımız belirtmeiz lazım mesela 5 tane char, 3 tane int falan gibi
//String de koyabiliriz ancak Stringde referanslarını tutar.
//arrayler icilerinde primitive data turlerini ve non primitivelerinde referanslarını tutarlar.
//arrays icindeki tum variableler aynı data turlerinden olmalıdır. Mesela bir tanesi int ise hepsi int olacak.
//bir arayin icine koyacagımız variable sayısına o Arrayın length i denir o aray icine length den fazla variable koyamayız.
//mesela 5 tane koyacaz dedik int ancak 3 tane degerini atadık digerlerini 0 olarak atar.
//stringlerde deger atamazsak null olarak deger atar kendi.
//arrayın kendine ait valuesi ve methodu vardır.
//arraylar runtime ' da olusturulurlar. yani yazılınca olusturulmus olmaz run time calıstırılınca olusur.
//sadece olusturdugumuzda referans degeri olusur run time yaparsak hata varsa ortaya cıkar.
//koseli parantezle kullanılır.
		
		int myArray[];//bu sekilde array olur. //int arr[]; seklindede olabilir onemli olan koseli parantrez
//bu gune kadar main methodda yer alan	"public static void main(String[] args)" args icinde Stringler bulunan bir array 
//anlamına gelmektedir.
	
		int Array[]=new int[6]; //burada ki 6, 6 tane int variablesi olusturur. degerlerinin hepsi sıfır olarak atar.
	//buradaki arrayı yazdırırsak 6 tane 0 yazdırır.
		
		
		int EnesArray[]=new int[3];//3 tane int degeri olusturduk degerini atamak icin
		EnesArray[0]=5;// bu sekilde yaparsak 0. indexin degeri 5 deriz diger 2 degeride boyle yapabiliriz
		EnesArray[1]=9;
		EnesArray[2]=7;
		System.out.println(Arrays.toString(EnesArray));
	
int arryeni[]=new int[4];

arryeni[0]=4;
arryeni[1]=4;
arryeni[2]=4;
arryeni[3]=4;

System.out.println(Arrays.toString(arryeni));

String arryeni2[]=new String[3];

arryeni2[0]="enes";
arryeni2[1]="enes";
arryeni2[2]="enes";

System.out.println(Arrays.toString(arryeni2));
}}


