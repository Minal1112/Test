package casting;

public class Explicit {
	public static void main(String[] args) {
		double a= 777.22;
		System.out.println(a);
		
		float b= (float)a ;
		System.out.println(b);
		
		int c =(int)b;
		System.out.println(c);
		
		byte d= (byte)c;
		System.out.println(d);
		
	}

}
