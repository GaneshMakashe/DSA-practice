package paidAnujBhaiyaAssisgnments;

public class MoveZerosToEnd {

	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	//logic not understood 
	public static void MoveZerosToEnd(int[] a) {
		int count=0;
		for (int i = 0; i < a.length; i++)
	        if (a[i] != 0)
	            a[count++] = a[i];
		  for (int i = count; i<a.length;i++)
		        a[i]=0;
	}

	public static void main(String[] args) {
		int[] a = {1,1,1,1,0,0,0,1,1,0,1,1,0};
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		MoveZerosToEnd(a);
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
