package interview_program;

public class Star_Upper_triangle {
	public static void main(String[] args) {
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}
	}

}
