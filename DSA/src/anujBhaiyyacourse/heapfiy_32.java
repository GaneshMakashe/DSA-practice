package anujBhaiyyacourse;
//time complexity O(n)
//not understood
public class heapfiy_32 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void heapify(int[] a, int n, int i) {
		int largest =i;
		int l = 2*i;
		int r = 2*i+1;
		if(l<=n && a[l]>a[largest]) {
			largest=l;
		}
		if(r<=n && a[r]>a[largest]) {
			largest=r;
		}
		if(largest!=i) {
			swap(a,i,largest);
			heapify(a,n,largest);
		}
	}
	
	static void printArray(int[] a, int n) {
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");}
		}
	
	static void buildHeap(int[] a, int n) {
		for(int i=n/2;i>0;i--) {
			heapify(a,n,i);
		}
	}
	static void heapSort(int[] a, int n) {
		for(int i=n;i>1;i--) {
			swap(a,1,i);
			heapify(a,i-1,1);
		}
	}
	public static void main(String[] args) {
		int[] a= {60,50,30,40,10,15};
		int n=a.length-1;
		buildHeap(a,n);
		heapSort(a,n);
		printArray(a,n);

	}

}
