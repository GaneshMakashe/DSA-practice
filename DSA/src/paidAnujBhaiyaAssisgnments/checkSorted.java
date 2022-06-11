package paidAnujBhaiyaAssisgnments;

public class checkSorted {

	public static boolean isSorted(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = {5,6,9,11,16,27};
		boolean b = isSorted(a);
		System.out.println(b);
	}
}
