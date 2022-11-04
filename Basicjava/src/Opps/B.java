package Opps;

public class B implements Test{
	public void mart() {// Incomplete method of interface
		System.out.println("purchase");
	}
	public void Mall() {//default method of interface
		System.out.println("Shopping1000");//implementation changed
	}
	public static void main(String[] args) {
		A a= new A();//object of implementation class
		B b= new B();//object of implementation class
		
		a.Mall();// default method interface called with B implementation class object
		a.mart();//override method of interface
		
		b.Mall();//default method interface called with B implementation class object
		b.mart();//override method of interface
	}
	}
  