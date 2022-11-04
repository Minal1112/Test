package abstracteconcrette;

public  class demo2 implements demo{//implementation class
	
	public void Test() {
		int a=67;
		int b=89;
		int c=a+b;
		System.out.println(c);
		System.out.println("running test method");
	}
	public void Test2() {
		System.out.println("test2 method running");
		
	}
	public static void main(String[] args) {
		demo2 d= new demo2();
		System.out.println(demo.a);
		d.Test();
		d.Test2();
	}

}
