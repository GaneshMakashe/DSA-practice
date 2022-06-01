package shradhadidi_and_AmanBhaiyya;

import java.util.Arrays;

public class Problem_5 {

	static int findMinDiff(int[] a, int n, int m) {
		if(m==0 || n==0) {
			return 0;
		}
		Arrays.sort(a);
		if(n<m) return -1;
		 int min_diff = Integer.MAX_VALUE;
		 for(int i=0;i+m-1<n;i++) {
			 int diff = a[i+m-1]-a[i];
			 if(diff<min_diff)
				 min_diff=diff;
		 }
		 return min_diff;
	}
	public static void main(String[] args) {
		int a[] = {12, 4, 7, 9, 2, 23,
                25, 41, 30, 40, 28,
                42, 30, 44, 48, 43,
               50};
		int m = 7;
		int n = a.length;
        System.out.println("Minimum difference is " + findMinDiff(a, n, m));
	}

}
