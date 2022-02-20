package day35_encapsulations_inheritance;

public class C01 {

	private double not=49.9;
	

	private boolean gecerMi=false;
	
	
	public double getNot() {
		return not;
	}
	
	public void setNot(double not) {//burada da ayný sekilde parametre olarak gelecek.
		this.not = not;			//diger class dan gelecek olan not ile ayni degere ulasacak yukaridaki 
								//this ile yukaridaki variableyi esitliyor 
		//baska claslarda yazýlan degerler bu methoda deger olarak gelecek
			//this.gecerMi = gecerMi;//burada this olmazsa localdekileri gider alýr. Yukaridaki instance degere bakmaz
		}
	
	
	
	
	public boolean isGecerMi() {
		
		if (not>=50) {
			gecerMi=true;
		}
		return gecerMi;
	}
	
	
	
	

}
