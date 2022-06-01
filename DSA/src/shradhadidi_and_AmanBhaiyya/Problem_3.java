package shradhadidi_and_AmanBhaiyya;

public class Problem_3 {

	
		public static int maxSubArray(int[] nums) {
	        int maxSum=Integer.MIN_VALUE;
	        int curSum=0;
	        for(int i =0;i<nums.length;i++){
	            curSum = curSum+nums[i];
	            if(curSum>maxSum){
	                maxSum=curSum;
	            }
	            if(curSum<0){
	               curSum=0;
	            }
	        }
	        return maxSum;
	    }
		public static void main(String[] args) {
			int[] nums= {-1};
			System.out.println(maxSubArray(nums));
		}
}
