package day34_AccessModifier_encapsulation;

public class C02 {

	public static void main(String[] args) {
		 
		C01 obj=new C01();
	        //System.out.println(obj.sayiPrivate); // private variablara sadece kendi class inda gorulur
	                                             // private variable'lara kendi class disindan ulasilamaz
	        System.out.println(obj.sayiDefault);
	        System.out.println(obj.sayiProtected);
	        System.out.println(obj.sayiPublic);
	    }
	    
	    public void staticOlmayanMethod() {
	        
	        C01 obj=new C01();
	        //System.out.println(obj.sayiPrivate); // static'de olsa private variablara sadece kendi class inda gorulur
	                                                // static'de olsa private variable'lara kendi class disindan ulasilamaz
	        System.out.println(obj.sayiDefault);
	        System.out.println(obj.sayiProtected);
	        System.out.println(obj.sayiPublic);
	    }
	}