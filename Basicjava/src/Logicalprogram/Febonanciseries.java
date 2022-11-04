package Logicalprogram;

public class Febonanciseries {
	public static void main(String[] args) {// 0 1 1 2 3 5 8 13 21 34
		int a=0;
		int b=1;
		int c;
		int count =10;
		System.out.print(a+" "+b);
		
		for(int i =2;i<count;i++) {
			c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}

	}


