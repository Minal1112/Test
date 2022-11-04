package Array;

public class Sum_of_array {
	public static void main(String[] args) {
		
	int arr[] =  {5,7,2,1,8,9,4,8} ;//Initialise array
	
    int sum= 0;// always put sum zero for adding elements
    for (int i=0; i<arr.length; i++)  {//Taking for loop for calculating the sum of the elements by using array
     sum = sum + arr[i];
	} 
	System.out.println(" sum of all elements of given array= "   + sum) ;
	}

}
