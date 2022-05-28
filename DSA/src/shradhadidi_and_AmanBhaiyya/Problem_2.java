package shradhadidi_and_AmanBhaiyya;

public class Problem_2 {

	
	static void reverse(int[] a, int start, int end) {
		int temp;
		
		while(start < end) {
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		int[] a = {10,25,36,49,85,61};
		printArray(a);
		reverse(a,0,5);
		printArray(a);
		
		
	}

}
