package paidAnujBhaiya;

public class June15 {

	//using O(1) time complexity
	public static int trappingRainWater(int[] a) {
		int ans=0;
		
		int leftMax=0;
		int rightMax=0;
		int l = 0 , r=a.length-1;
		
		while(l<r) {
			if(a[l]<=a[r]) {
				if(a[l]>leftMax) leftMax=a[l];
				else ans +=(leftMax-a[l]);
				l++;
			}else {
				if(a[r]>rightMax) rightMax=a[r];
				else ans += (rightMax-a[r]);
				r--;
			}
		}
		
		return ans;
	}
	
	
	static int maxValueOfJMinusI(int[] a){
		
		int n=a.length;
		int[] rightMax = new int[n];
		int[] leftMin = new int[n];
		
		rightMax[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--)
			rightMax[i]=Math.max(rightMax[i+1], a[i]);
		
		leftMin[0]=a[0];
		for(int i=1;i<n-1;i++)
			leftMin[i]=Math.min(leftMin[i+1], a[i]);
		
			int i=0, j=0;
			int ans=0;
			while(i<n && j<n) {
				if(leftMin[i]<rightMax[j]) {
					ans=Math.max(ans, j-i);
					j++;
				}else {
					i++;
				}
			}
			return ans;
	}
	
	//only sorted array 
	//most of the times in sorted array mostly two pointer method will work
	public static boolean twoSum(int[] a, int sum) {
		int l =0;
		int r = a.length-1;
		
		while(l<r) {
			int curSum = a[l]+a[r];
			if(curSum>sum) {
				r--;
			}else if(curSum<sum) {
				l++;
			}else
				return true;
		}
		return false;
	}
	
	public static boolean threeSum(int[] a, int sum) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			boolean found=twoSum(a, sum-a[i]);
			if(found) return true;
			
		}
	
		return false;
		
	}
	
	
	public static void main(String[] args) {
		//int[] a = {3,5,1,4,2,6};
		//int ans = trappingRainWater(a);
		//System.out.println(ans);
		int[] a = {1,2,7,8,10,12};
		//System.out.println(maxValueOfJMinusI(a));
		System.out.println(twoSum(a, 8));
		System.out.println(threeSum(a, 12));
	}

}
