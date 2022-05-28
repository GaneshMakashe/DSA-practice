package anujBhaiyyacourse;

public class StocksBuySell02_15 {
	
	static int maxProfit(int[] a) {
		int profit = 0;
		for(int i=1; i<a.length;i++) {
			if(a[i]>a[i-1]) {
				profit += (a[i]-a[i-1]);
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int[] a = {5,2,6,1,4,7,3,6};
		System.out.println(maxProfit(a));
		
		}
}
//here many number of buying and selling can be done but limited to first buying only one cycle must be completed
//time complexity O(n) and space complexity O(1)
