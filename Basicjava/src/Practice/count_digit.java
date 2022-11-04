package Practice;

public class count_digit {
	public static void main(String[] args) {
		int  a=1998;//
		int count = 0;
		
		while(a>0){
			a = a/10;
			++count;
			}
		
		System.out.println("number of digit " + count);
		
	}
	

}
