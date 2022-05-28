package anujBhaiyyacourse;
//only in sorted array
public class BinarySerach_22 {

	
	//Iterative Way Solution----->//optimized better for competitive coding
	static int binarySerach(int[] a, int key) {
		int low = 0; 
		int high=a.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(key>a[mid]) {
					low =mid+1;
				}
				else {
					high = mid-1;
				}
		}
		return -1;
	}
	
	//------------------------------------------------------//
//Recursive Way Solution----->//log2(n)//slower
	
	static int binarySerach(int[] a, int key, int low, int high) {
		if(low>high) return -1;
		int mid = (low+high)/2;
		if(a[mid]==key)
			return mid;
		if(key>a[mid])
			return binarySerach(a,key,mid+1,high);
			return binarySerach(a,key,low,mid-1);
	}
	
	//<---------------------------------------------------->//
	public static void main(String[] args) {
		int[] a= {3,5,9,13,15};
		System.out.println(binarySerach(a,7,0,5));
		System.out.println(binarySerach(a,7));

	}

}
