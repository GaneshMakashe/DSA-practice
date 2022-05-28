package anujBhaiyyacourse;
//not understood delete portion
public class HeapInsert_31 {

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	//O(logn)
	static void insert(int[] a, int n, int value) {
		n = n+1;
		a[n]=value;
		int i = n;
		while(i>1) {
			int parent = i/2;
			if(a[parent]<a[i]) {
				swap(a,parent,i);
				i=parent;
			}
			else {
				return;
			}
		}
	}
	//deleting root node //O(logn)
	static void delete(int[] a, int n) {
		a[1]=a[n];
		n=n-1;
		int i=1;
		while(i<n) {
			int left = a[2*i];
			int right = a[2*i+1];
			int larger = left>right? 2*i: 2*i+1;
			if(a[i]<a[larger]) {
				swap(a,i,larger);
				i=larger;
			}
			else
				return;
		}
	}
	
	static void printArray(int[] a, int n) {
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i] + " ");}
	}
	
	public static void main(String[] args) {
		int[] a = {30,20,10,15};
		int n = a.length;
		 insert(a,n,45);
		printArray(a,n);
		System.out.println(" ");
		delete(a,0);
		printArray(a, n);
	}

}
