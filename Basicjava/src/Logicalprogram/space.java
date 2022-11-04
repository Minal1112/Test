package Logicalprogram;

public class space {
	public static void main(String[] args) {
		String a = "   Velocity  is   the  best  ";
		
		int count =0;
		
		for (int i = 0;i<=a.length()-1;i++) {
			char b =a.charAt(i);
			 if (b==' ') {
					count++;
				}
			}
			System.out.println(count);
		}
	

}
