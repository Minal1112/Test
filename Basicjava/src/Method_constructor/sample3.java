package Method_constructor;

public class sample3 {
	public static void main(String[] args) {
		System.out.println("main method started");
		sample1.m1();
	    sample1.m2();
		System.out.println("main method ended");
	}
	public void m1() {
		System.out.println("running m1 non static method");
	}
	public void m2() {
	System.out.println("running m2 non static method");
	}

}
