package casting;

public class Implicit {
	public static void main(String[] args) {
		
		byte a= 127;//memory size is 1 bit
		System.out.println(a);
		
		int b =a;//memory size is 4 byte
		System.out.println(b);
		
		double c =b;//memory size is byte output in decimal
		System.out.println(c);
	}

}
