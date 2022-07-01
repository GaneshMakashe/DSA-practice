package paidAnujBhaiya;

public class June30and21stClass {

	//find the ith bit
	static int findIthBit(int n, int i) {
		int mask = 1<<i;
		int result = n^mask;
		if(result==0) return 0;
		else return 1;
	}
	
	//toggle the ith bit
	static int toggleTheithBit(int n,int i) {
		int mask =1<<i;
		
		int result =n^mask;
		if(result==0) return 0;
		else return 1;
	}
	
	//check if a number is power of two
	static boolean isPoweroftwo(int n) {
		int b=n-1;
		int res = n&b;
		return res==0;
	}
	
	//count the number of set bits in a number
	static int countSetBits(int n) {
		int count=0;
		while(n>0) {
			if((n&1)==1) {
				count++;
			}
			n>>=1;
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		int n=5;
		//System.out.println(findIthBit(n, 2)+","+findIthBit(n, 1)+","+findIthBit(n, 0));
		//System.out.println(toggleTheithBit(n, 1));
		//System.out.println(isPoweroftwo(15));
		System.out.println(countSetBits(10));
		
	}
}
