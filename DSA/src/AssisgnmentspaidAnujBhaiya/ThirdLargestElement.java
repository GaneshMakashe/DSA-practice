package AssisgnmentspaidAnujBhaiya;



public class ThirdLargestElement {

	public static int thirdLargest(int[] a) {
		if(a.length<3) return -1;
		int largest = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		int secondLargest = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>secondLargest && a[i]<largest) {
				secondLargest=a[i];
			}
		}
		int thirdLargest = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>thirdLargest && a[i]<secondLargest) {
				thirdLargest=a[i];
			}
		}
		
		return thirdLargest;
	}
	public static void main(String[] args) {
		int[] a = {5,4,3,2,6,7};
		int b = thirdLargest(a);
		System.out.println(b);

	}

}
