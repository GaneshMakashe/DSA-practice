package paidAnujBhaiyaAssisgnments;

public class LongestOne {

	//almost self with small help from internet
	public static int LongestOne(int[] a) {
		int count=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count=0;
			    
			}
			else{
				count++;
				max=Math.max(count, max);
			}
			
		}
		return max;
		
	}
	public static void main(String[] args) {
		int[] a = {1,1,1,1,0,0,0,1,1,0,1,1,0};
		int b = LongestOne(a);
		System.out.println(b);

	}

}
