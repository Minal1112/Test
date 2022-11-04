package Method_constructor;

public class sample1 {//static method call from same class
	public static void main(String[] args) {
		System.out.println("main method start");
		m1();
		m2();
		System.out.println("main method ended");
	}
	public static void m1() {
		System.out.println("running m1 method");
		
	}
	public static void m2() {
		System.out.println("running m2 method");
	}

}
