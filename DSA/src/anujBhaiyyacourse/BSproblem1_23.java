package anujBhaiyyacourse;
//find the element in the infinite sorted array
//O(log(n)) time complexity
public class BSproblem1_23 {

	static int binarySearch(int[] a, int key, int low, int high) {
		if(low>high) return -1;
		int mid = (low+high)/2;
		if(a[mid]==key)
			return mid;
		if(key>a[mid])
			return binarySearch(a,key,mid+1,high);
			return binarySearch(a,key,low,mid-1);
	}
	
	static int searchInfinite(int[] a,int key) {
		int low=0;
		int high=1;
		while(a[high]<key) {
			low=high;
			high=2*high;
		}
		return binarySearch(a,key,low,high);
	}
	
	public static void main(String[] args) {
		int[] a= {1,3,7,8,12,58,72,96};
		System.out.println(searchInfinite(a, 12));
	}

}
