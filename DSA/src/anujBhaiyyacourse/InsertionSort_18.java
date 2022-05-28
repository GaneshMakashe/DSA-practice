package anujBhaiyyacourse;
//optimized over bubble sort
public class InsertionSort_18 {

	static void insertionSort(int[] a) {
		int n = a.length;
		for(int i=1;i<n;i++) {
			int temp = a[i];
			int j =i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}

public static void main(String[] args) {
	
	int[] a = {5,4,3,2,1};
	System.out.println("Array before sorting");
	for (int i=0; i<a.length;i++) {
		System.out.print(a[i] + " ");
	}
	System.out.println();
	
	insertionSort(a);
	
	System.out.println("Array After sorting");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i] + " ");
	}
  }
}
//time complexity of O(n2)
