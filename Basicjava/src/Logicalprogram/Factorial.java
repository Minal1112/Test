package Logicalprogram;

public class Factorial {
	public static void main(String[] args) {
		int a=5; // 5*4*3*2*1
		
		int factorial =1;
		for(int i=a;i>=1;i--) {
			
			factorial = factorial * i;//5 4 3 2 1
			
		}
		
		System.out.println(factorial);
	}

}
