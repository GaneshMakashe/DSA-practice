package demo;

public class Practice5 {

	   public static int solve(int[] A) {
	        int min=0;
	        int max=0;
	        int sum=0;
	        for(int i=0;i<A.length-1;i++){
	           min=Math.min(min,A[i]);
	           max=Math.max(max,A[i]);
	           System.out.println(max);
	           System.out.println(min);
	        }
	        sum=max+min;
	        return sum;
	    }
	   
	   public static int pickFromBothSides(int[] A, int B) {
	        int n=A.length;
	        int curSum=0;
	        int maxSum=0;
	        for(int i=0;i<B;i++){
	            curSum+=A[i];
	            System.out.println(curSum);
	        }
	        System.out.println("------------");
	        maxSum=curSum;
	        int j=n-1;
	        for(int i=B-1;i>=0;i--){
	            curSum=curSum+A[j]-A[i];
	            System.out.println(A[j]);
	            System.out.println(A[i]);
	            maxSum=Math.max(curSum,maxSum);
	            j--;
	            System.out.println(curSum);
	            System.out.println(maxSum);
	            System.out.println("--------");
	        }
	        return maxSum;
	    }
	   
	public static void main(String[] args) {
		int[] A= {5, -2, 3 , 1, 2};
//		System.out.println(solve(A));
//		solve(A);
		System.out.println(pickFromBothSides(A, 3));

	}

}
