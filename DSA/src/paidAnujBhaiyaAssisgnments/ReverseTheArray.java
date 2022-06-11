package paidAnujBhaiyaAssisgnments;

public class ReverseTheArray {

	public static void reverseArray(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i] + " ");
		}
	}
	

	public static void main(String[] args) {
		int[] a = {5,6,9,11,16,27};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		reverseArray(a);
	}

}
