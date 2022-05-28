package anujBhaiyyacourse;

//import java.util.Scanner;
//revise 
//uses partition logic
//time complexity O(nlogn)
//in wrost case it has O(n) time complexity
//space complexity O(n)
public class QuickSort20 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int partition(int[] a,int l,int h) {
		int pivot = a[l];
		int i=l;
		int j=h;
		while (i<j) {
            while (a[i] <= pivot && i<=h-1)
                i++;
            while (a[j] > pivot && j>=l)
                j--;
            if (i<j)
                swap(a,i,j);
        }
		swap(a,j,l);
		return j;
	}
	static void quickSort(int[] a, int l,int h) {
		
		if(l<h) {
			int pivot = partition(a, l, h);
			quickSort(a, l,pivot-1);
			quickSort(a, pivot+1, h);
		}
		
	}
	
	
	public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
//		 int[] a = new int[5];
//		 for(int i=0;i<a.length;i++) {
//			 System.out.println("Please enter number");
//			 a[i]  = sc.nextInt();
//		 }
		int[] a = {5,4,3,2,1};
		//int n = a.length;
		System.out.println("Array before sorting");
		for (int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		quickSort(a,0,4);
		
		System.out.println("Array After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}
}
