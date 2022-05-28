package anujBhaiyyacourse;

public class BubbleSort_17 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void bubbleSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			boolean swapped = false;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j+1]<a[j]) {
					swapped = true;
					swap(a,j+1,j);
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}
	public static void main(String[] args) {
	
		int[] a = {5,4,3,2,1};
		System.out.println("Array before bubble sort");
		for (int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		bubbleSort(a);
		
		System.out.println("Array After Bubble sort");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	}

}
//time complexity of O(n2)
