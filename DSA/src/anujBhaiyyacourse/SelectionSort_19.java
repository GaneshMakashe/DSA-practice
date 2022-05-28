package anujBhaiyyacourse;

public class SelectionSort_19 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void selectionSort(int[] a) {
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			if(min !=i) {
				swap(a,min,i);
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {5,4,3,2,1};
		System.out.println("Array before sorting");
		for (int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		selectionSort(a);
		
		System.out.println("Array After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}
}
//time complexity of O(n2)
