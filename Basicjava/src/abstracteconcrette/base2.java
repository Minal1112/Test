package abstracteconcrette;

public  class base2 extends Base1 {
	public void Whatsapp() {
		System.out.println("Method whtasapp completed in concrete class");
	//implementation of incomplete method from abstarct class base1
	}
	public void insta() {
		System.out.println("Method insta completed in concrete class");
	}
	public void twitter() {
		System.out.println("Method twitter completed in concrete class");
	}
	public static void main(String[] args) {
		base2 b= new base2();
		b.facebook();
		b.Whatsapp();
		b.insta();
	    b.twitter();
	}
	
	
	

}
