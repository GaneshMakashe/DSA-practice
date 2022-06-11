package anujBhaiyyacourse;

public class Kadane_Algorithm_13 {
	 static int maxSumSubArray(int a[]) {
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		for(int i=0;i<a.length;i++) {
			curSum = curSum +a[i];
			if(curSum>maxSum) {
				maxSum = curSum;
			}
			if(curSum<0) {
				curSum = 0;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] a= {5,4,2,6,1};
		System.out.println(maxSumSubArray(a));
	}
}
//this code provides time complexity in o(n) and called kadane algorithm 
//some changes has to be done for ll negative element in array
