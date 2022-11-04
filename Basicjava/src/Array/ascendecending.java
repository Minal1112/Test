package Array;


import java.util.Arrays;

public class ascendecending {
	public static void main(String[] args) {
		int a[] = {10,50,30,80,60} ;//declaration of array
		
		System.out.println("-----------Array all information---------");
		for(int i =0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		Arrays.sort(a);
		System.out.println("-------------array all information in asscending order---------");
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		//System.out.println(a[1]);
		System.out.println("----------array all information in descending order--------");
		
		for (int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
				
	}
				

}
