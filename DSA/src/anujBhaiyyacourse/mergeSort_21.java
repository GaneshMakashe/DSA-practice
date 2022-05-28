package anujBhaiyyacourse;
//uses divide and conquer 
//revise
//time complexity always will be O(logn)
public class mergeSort_21 {


	static void mergeSort(int[]a, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			merge(a,l,mid,r);
		}
	}
	
	
	static void merge(int[] a, int l, int mid, int r) {
		int i = l;
		int j =mid+1;
		int k = l;
		int n = a.length;
		int[] b = new int[n];
		while(i<=mid && j<=r) {
			
			if(a[i]<a[j]) {
				b[k]=a[i];
				i++;
			}
			else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=r) {
				b[k] = a[j];
				k++;j++;
			}
		}
			else {
				while(i<=mid) {
					b[k]=a[i];
					k++;i++;
			}
		}
		for(k=l;k<=r;k++) {
			a[k]=b[k];
		}
		
	}

	public static void main(String[] args) {
		int[] a = {5,4,3,2,1};
		//int n = a.length;
		System.out.println("Array before sorting");
		for (int i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		mergeSort(a,0,4);
		
		System.out.println("Array After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
	
	}

}
