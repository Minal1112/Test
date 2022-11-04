package interview_program;

public class String_reverse {
	public static void main(String[] args) {
		String a="MINALWAMAN";
		String rev = " ";
		
		for( int i=a.length()-1;i>=0;i--) {
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
	}

}
