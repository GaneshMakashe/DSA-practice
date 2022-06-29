package paidAnujBhaiya;

public class June24 {

	//palindrome number
	//time complexity-->theta(log(n)) or O(logn)
	public static boolean isPalindrome(int n) {
		int rev=0;
		int temp =n;
		
		while(temp>0) {
		int lastDigit=temp%10;
		rev=rev*10+lastDigit;
		temp /=10;
		}
		
		return n==rev;
		
	}
	
	//gcd ot hcf
	//O(n)
	public static int gcf(int a, int b) {
		for(int i=Math.min(a, b);i>1;i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;
	}
	//euclid GCD
	//O(n)
	public static int euclidGCD(int a, int b) {
		if(a==b) return a;
		if(a<b) return euclidGCD(b,a);
		return euclidGCD(a-b, b);
	}
	//tc--->log(n)
	public static int euclidGcdModified(int a, int b) {
		System.out.println(a+" "+b);
		if(a<b) return euclidGcdModified(b,a);
		if(b==0) return a;
		return euclidGcdModified(a%b, b);
		
	}
	
//	public static int trailingZeros(int n){
//		int res = 0;
//		while(n>0) {
//			res =+ n/5;
//			res=n/5;
//		}
//		return res;
//	}
	
	//unique path in a matrix
	//O(n)
	public static int uniquWays(int m,int n) {
	int res=1;
	for(int i=1;i<n;i++) {
		res = res*(m+i)/i;
	}
	return res;
	}
	
	public static void main(String[] args) {
//		int n = 12;
//		System.out.println(isPalindrome(n));
//		int a=24;
//		int b=60;
		//System.out.println(gcf(a, b));
		//System.out.println(euclidGCD(a, b));
		//System.out.println(euclidGcdModified(a, b));
		//System.out.println(trailingZeros(25));
		System.out.println(uniquWays(5, 5));
	}

}
