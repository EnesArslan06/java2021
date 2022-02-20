package day38_OverRiding;

class Derived{
	public void getDetails() {
		System.out.println("Derived class ");
	}
}



public class S02 extends Derived{
	
	public void getDetails() {
		System.out.println("Test class ");
	}

	public static void main(String[] args) {
		S02 obj=new S02();
		obj.getDetails();

	}

}
