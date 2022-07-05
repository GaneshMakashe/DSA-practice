package paidAnujBhaiya;

public class July122 {

	static int countSetBitsOptimised(int n) {
		int count =0;
		while(n>0){
			count++;
			n=(n & (n-1));
		}
		return count;
	}
	
	
	//non-repeating element in an array where every other element repeats twice
	static int oneNonRepeatingElement(int[] a ) {
		int ans=0;
		for(int e:a) {
			ans= ans^e;
		}
		return ans;
	}
	
	//two non-repeating element in an array where every other element repeats twice.
	static int[] twoNonRepeatingElement(int[] a) {
		int xor=0;
		for(int e:a) {
			xor= xor^e;
		}
		int temp=xor;
		int mask = xor &(~(xor-1));
		for(int e:a) {
			if((mask & e)==0) {
				temp = temp ^e;
			}
		}
		int firstNumber =temp;
		int secondNumber = xor ^ firstNumber;
		
		int res[] = new int[2];
		res[0]=firstNumber;
		res[1]=secondNumber;
	
		return res;
		
	}
	
	//swap 2 bits in a given integer
	static int swapTwoBits(int n,int i, int j) {
		int ith = (n>>i) &1;
		int jth = (n>>j) &1;
		
		int xor = ith^jth;
		if(xor==0)return n;
		int mask = (1<<i)|(1<<j);
		return n^mask;
	}
	
	//32nd bit is most significant bit for a sign
	
	static long reverset2BitUInt(long n){
		long res=0;
		int i=0;
		while(i<=31) {
			if((n &(1<<i))!=0)
			res +=(1L<<(31-i));
			i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(countSetBitsOptimised(10));
//		int a[] = {2,1,4,1,2,3,4,7};
//		//System.out.println(oneNonRepeatingElement(a));
//		int res[] = twoNonRepeatingElement(a);
//		
//		for(int e: res) {
//			System.out.println(e);
//		}
//		System.out.println(swapTwoBits(10, 1, 2));
		System.out.println(reverset2BitUInt(11));
		
		
		
		
	}

}
