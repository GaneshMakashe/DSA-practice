package paidAnujBhaiya;

public class ArraysMain {

	public static int delete(int[] a, int key) {
		int n = a.length;
		int i=0;
		for(;i<n;i++) {
			if(a[i]==key) {
				break;
			}
		}
		if(i==n) return n;
		for(int j = i;j<n-i;j++) {
			a[j]=a[j+1];
		}
		return n-1;
	}
	
	public static int secondLargest(int[] a) {
		if(a.length <2) return -1;
		int largest =0;
		int secondLargest=-1;
		
		for(int i =1;i<a.length;i++) {
			if(a[i]>a[largest]) {
				secondLargest=largest;
				largest=i;
			}else if(a[i]<a[largest]) {
				if(secondLargest == -1 || a[i]>a[secondLargest]) {
					secondLargest=i;
				}
			}
		}
		return secondLargest;
	}
	
	public static void removeDuplicate(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				delete(a, a[i+1]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,6,6,6,6};
//		int key=1;
		
//		delete(a, key);
//		for(int e: a) {
//			System.out.print(e+" ");
//		}
		
		removeDuplicate(a);
		for(int e: a) {
			System.out.print(e+" ");
		}
		
		int index=secondLargest(a);
		System.out.println(a[index]);
		
//		int res=-1;
//		
//		for(int i=0; i<a.length;i++) {
//			if(a[i]==key) {
//				res=i;
//				break;
//			}
//		}
//		if(res==-1) {
//			System.out.println("Not Found");
//		}else {
//			System.out.println("Key is present at third index: "+res);
//		}
//
		}

}
