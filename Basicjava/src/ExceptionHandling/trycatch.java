package ExceptionHandling;

public class trycatch {
	public static void main(String[] args) {
		int a=77;
		int b=0;
		int c=0;
		int d[]= {3,6,4,5,7};
		System.out.println("Main Method start");
		
		try {
			System.out.println("try");
			System.out.println(d[5]);
			c=a/b;
			}
		catch(ArithmeticException e) {
			b=2;
			c=a/b;
			System.out.println("Arithmatic exception");
		}
		catch(ArrayIndexOutOfBoundsException t) {
			System.out.println(d[2]);
			
		}
		System.out.println("Normal flow");
		
	}

}
