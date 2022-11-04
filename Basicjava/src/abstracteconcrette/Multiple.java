package abstracteconcrette;

public class Multiple implements A,B,C{
	public void Display() {
		System.out.println("Display implementstion class");
	}
	public void Show() {
		System.out.println("Show implementation class");
		
	}
	public void Add() {
		int a=56;
		int b=54;
		int c=a+b;
		System.out.println(c);
		
	}
	public void Division() {
		int a=60;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
	public void subtraction() {
		int a=50;
		int b=30;
		int c=a-b;
		System.out.println(c);
	}
	public void multiplication() {
		int a=10;
		int b= 20;
		int c= a*b;
		System.out.println(c);
	}
	

}
