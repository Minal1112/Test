package Array;

public class Swapping {
	public static void main(String[] args) {
		int a[]= {30,40,70,80,50};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		//a[0]=a[4]    30=50
		//a[1]=a[3]    40=80
		//a[2]=70
		for (int i=0;i<(a.length/2);i++) {
			int z;
			z=a[i];//30
			a[i]=a[(a.length-1)-i];//a[0]=50;   a[4]=50
			a[(a.length-1)-i]=z;//a[4]=30
		}
		System.out.println();
		//System.out.print(a[0]);
		//50,80,70,40,30
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
			
		
	}

}
