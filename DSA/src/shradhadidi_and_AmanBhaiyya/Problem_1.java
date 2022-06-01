package shradhadidi_and_AmanBhaiyya;

public class Problem_1 {

	static void maxAndMin(int[] a) {
		int n=a.length;
		int max,min;
		for(int i=0;i<n;i++) {
			if(n==1) {
				max=a[0];
				min=a[0];
			}
			else {
				if(a[0]>a[1]) {
					max = a[0];
					min = a[1];
				}
				else {
					max=a[1];
					min=a[0];
				}
				for(i=2;i<n;i++) {
					if(a[i]>max) {
						max=a[i];
					}
					if(a[i]<min) {
						min=a[i];
					}
				}
			}
			System.out.println("Minimum Value = "+min);
			System.out.println("Maximum Value = "+max);
			
		}
	}
	public static void main(String[] args) {
		int[] a= {1,5,8,9};
	    maxAndMin(a);

	}

}
