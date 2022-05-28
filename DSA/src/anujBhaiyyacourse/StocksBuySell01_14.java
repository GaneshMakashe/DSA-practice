package anujBhaiyyacourse;

public class StocksBuySell01_14 {

	static int maxProfit(int[] a) {
		int maxProfit=0;
		int minSoFar=a[0];
		
		for(int i=0;i<a.length;i++) {
			minSoFar= Math.min(minSoFar,a[i]);
			int profit = a[i]-minSoFar;
			maxProfit = Math.max(maxProfit, profit);
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int[] a = {6,2,3,8,1};
		System.out.println("Maximum Profit Will be: " + maxProfit(a));
	}
}
//stock can be buy and sold only once and first need to be bought 
//time complexity O(n) and space complexity O(1)