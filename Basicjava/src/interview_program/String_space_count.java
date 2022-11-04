package interview_program;

public class String_space_count {
	public static void main(String[] args) {
		String str = "Minal Waman 1112 @";
		int space = 0;
		int upper = 0;
		int lower = 0;
		int num = 0;
		int vovels = 0;
		int S = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				space++;
			}
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
			}
			if (ch >= 'a' && ch <= 'z') {
				lower++;
			}
			if(ch>= '0' && ch<='9') {
				num++;
			}
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vovels++;
			} 
			else {
				S++;
				}
		}
		System.out.println(space);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(num);
		System.out.println(vovels);
		System.out.println(S);
		
	}

}
