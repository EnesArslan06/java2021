package day21_scopVeArrays;

import java.util.Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// birden fazlavariable depolamak icin kullan�labilen object(non-primitive data)lerdir.
		//bu gune kadarki gordugumuz variableler bir tane deger al�rd�.
		//int sayi=5; sayi=7; sayi=10; burada sayilar�n degerini oldurerek yukselttik.
//arrayler onceden tan�mlanmak zorundad�r. 
//icine kactane data turu koyacag�m�z belirtmeiz laz�m mesela 5 tane char, 3 tane int falan gibi
//String de koyabiliriz ancak Stringde referanslar�n� tutar.
//arrayler icilerinde primitive data turlerini ve non primitivelerinde referanslar�n� tutarlar.
//arrays icindeki tum variableler ayn� data turlerinden olmal�d�r. Mesela bir tanesi int ise hepsi int olacak.
//bir arayin icine koyacag�m�z variable say�s�na o Array�n length i denir o aray icine length den fazla variable koyamay�z.
//mesela 5 tane koyacaz dedik int ancak 3 tane degerini atad�k digerlerini 0 olarak atar.
//stringlerde deger atamazsak null olarak deger atar kendi.
//array�n kendine ait valuesi ve methodu vard�r.
//arraylar runtime ' da olusturulurlar. yani yaz�l�nca olusturulmus olmaz run time cal�st�r�l�nca olusur.
//sadece olusturdugumuzda referans degeri olusur run time yaparsak hata varsa ortaya c�kar.
//koseli parantezle kullan�l�r.
		
		int myArray[];//bu sekilde array olur. //int arr[]; seklindede olabilir onemli olan koseli parantrez
//bu gune kadar main methodda yer alan	"public static void main(String[] args)" args icinde Stringler bulunan bir array 
//anlam�na gelmektedir.
	
		int Array[]=new int[6]; //burada ki 6, 6 tane int variablesi olusturur. degerlerinin hepsi s�f�r olarak atar.
	//buradaki array� yazd�r�rsak 6 tane 0 yazd�r�r.
		
		
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


