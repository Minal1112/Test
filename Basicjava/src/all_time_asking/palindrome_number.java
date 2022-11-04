// number is palindrome or not we check in this programe
//palindrome number are which is same fom starting and same from reverse that is palindrome

package all_time_asking;

public class palindrome_number {
	public static void main(String[] args) {
		int num =12121;
		int orignal=num;
		int rev=0;
		
		while(num!=0) {
			rev=(rev*10)+num%10;//remainder returns
			num=num/10;//quotient return
		}
		if(orignal==rev) {
		System.out.println("number is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
			
			
			
			
			
			
			
		
	}

}
