package paidAnujBhaiyaAssisgnments;

public class SmallestElementInTheArray {

	
	public static int smallElement(int[] a) {
		int n = a.length;
		int min=a[0];
		for(int i=0;i<n;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] a = {5,4,6,9,23,1};
		 int b=smallElement(a);
		 System.out.println(b);
		
		

	}

}
