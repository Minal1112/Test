package Opps;

public class Demo implements Test1 {//interface property are implementation
	
	public void Q(){//Method from interface get completed
        System.out.println("Q method running");
}
	public void Q1() {//Method from interface get completed
		System.out.println("Q1 method running");
	}
	public static void main(String[] args) {
		Demo d = new Demo();//object creation of implementation class
		d.Q();
		d.Q1();
		Test1.Happy();
		
	}
	}
