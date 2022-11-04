package casting;

public class TestCasting {
	public static void main(String[] args) {
		System.out.println("********Super class object*******");
		casting x=new casting();
		x.Demo();
		x.set();
		//x.staticCasting();
		
		System.out.println("******sub class object******");
		Casting1 y= new Casting1();
	    y.Demo();
	    y.set();
	    //y.staticCasting();
	    y.sub();
	    
	    System.out.println("*******up casting*****");
	    casting z =new Casting1();//up casting syntax
	    z.Demo();
	    z.set();
	    //z.staticCasting();
	    
	    Casting1 sub =(Casting1) new casting();//down casting
	    sub.Demo();
	    sub.set();
	    
	}
	}


