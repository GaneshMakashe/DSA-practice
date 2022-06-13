package paidAnujBhaiyaAssisgnments;

public class MoveZerosToEnd {

	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	//logic not understood 
	public static void MoveZerosToEnd(int[] a) {
//		int count=0;
//		for (int i = 0; i < a.length; i++)
//	        if (a[i] != 0)
//	            a[count++] = a[i];
//		  for (int i = count; i<a.length;i++)
//		        a[i]=0;
		int n = a.length;
		if(n==0 || n==1) {
			return;
		}
		int left=0, right=0;
		int temp;
		
		while(right<n) {
			if(a[right]==0) 
			++right;
			else {
				temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				++left;
				++right;
			}
			
		}
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
