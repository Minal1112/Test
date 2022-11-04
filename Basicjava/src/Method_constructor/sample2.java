package Method_constructor;

public class sample2 {
	public static void m3() {//static method call from different class
		System.out.println("running m3 method");
		
	}
	public static void main(String[] args) {
		System.out.println("main2 method started");
		sample1.m1();
		sample1.m2();
		System.out.println("main2 method ended");
	}

}
