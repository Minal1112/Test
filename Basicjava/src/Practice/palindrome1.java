package Practice;

public class palindrome1 {
	public static void main(String[] args) {
		int num=12121;
		int orignal=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;//return remainder 1,12,121,1212,12121
			num=num/10;//return quotient 1212,121,12,1,0
		}
		if(orignal==rev) {
			System.out.println(orignal + " is palindrome");
		}
		else {
			System.out.println(orignal + " is not palindrome");
		}
		
	}

}
