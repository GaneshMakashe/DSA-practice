package paidAnujBhaiya;

public class June11 {

	
	static void leadersinArray(int[] a) {
		int largest=Integer.MIN_VALUE;
		int b[] = new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]>largest) {
				largest=a[i];
				System.out.print(a[i]+" ");
				b[j++]=a[i];
			}
		}
		System.out.println("");
		for(j=j-1;j>=0;j--) {
			System.out.print(b[j]+" ");
		}
	}
	
	
	//kadanes algorithm maximum sub array
	
	
	static int containerWithMostWater(int[] a) {
		
		int maxArea = 0;
		int l = 0;
		int r = a.length-1;
		while(l<r) {
			int height = Math.min(a[l], a[r]);
			int distance = r-l;
			int area = height*distance;
			maxArea=Math.max(maxArea, area);
			if(a[l]<a[r]) {
				l++;
			}else {
				r--;
			}
		}
		return maxArea;
		
	}
	
	
	//rain water trapping problem
	
	
	
	
	public static void main(String[] args) {
		int[] a= {1,8,6,2,4,5,8,3,7};
	    //leadersinArray(a);
	    int b = containerWithMostWater(a);
	    System.out.println(b);
	    
	}

}
