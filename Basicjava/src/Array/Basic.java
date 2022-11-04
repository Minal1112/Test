package Array;

public class Basic {
	public static void main(String[] args) {
		String ar [] = new String[5];//Array declaration with size 5
		
		ar [0]= "JAVA";
		ar [1]= "Automation";
		ar [2]= "Manual";
		ar [3]= "Selenium";
		ar [4]= "Postman";
		//ar [5]= "Testing" //array out of bound exception
		System.out.println(ar[2]);//with the index array calling 
		
		System.out.println("----------print all information in array-------");
		for (int i =4; i>=0;i--) {
			System.out.println(ar[i]);
		}
		System.out.println(ar[2]);
		
	}

}
