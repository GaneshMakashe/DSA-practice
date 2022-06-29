package paidAnujBhaiya;

import java.util.Arrays;

public class June27 {

	//check if number is prime or not
	//tc O(n)
	public static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	//efficient approach
	//using loop fo 2 to root(N)
	//tc-->O(root(N))
	public static boolean isPrimeEfficient(int n) {
		if(n==1) return false;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	//more efficient
	//tc-->O(root(n))
	//atleast 3 times faster than above code
	static boolean isPrimeMoreEfficient(int n) {
		if(n==1) return false;
		if(n==2 || n==3) return true;
		if(n%2==0 || n%3==0) return false;
		
		for(int i=5;i*i <=n; i+=6) {
			if(n%i==0 || n%(i+2)==0) return false;
		}
		return true;
	}
	
	//print all divisors of N
	static void printDivisors(int n) {
		for(int i=1; i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				if(n/i !=i)
				System.out.println(n/i);
			}
		}
	}
	
	//tc-->O(root(n))
	static void printSortDivisors(int n) {
	   int i=1;
		for(; i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				
			}
		}
		i--;
		for(;i>=1;i--) {
			if(n%i==0) {
				if(n/i !=i)
				System.out.println(n/i);
			}
		}
	}
	
	//Sieve of eratosthenes
	//print all prime numbers between 1 and n
	static void printUntilNPrimeNUmbers(int n) {
		for(int i=1;i<=n;i++) {
			if(isPrimeEfficient(i)) {
				System.out.println(i);
			}
		}
	}
	
	//O(nloglogN)
	static void printPrimeNumberOptimized(int n) {
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]) {
				for(int j=i*i;j<=n;j +=i) {
					isPrime[j]=false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(isPrime[i])
			System.out.println(i);
		}
	}
	
	//Fast power, Calculate pow(a,b)
	//O(logb)
	static int fastPower(int a,int b) {
		if(b==0) return 1;
		int halfRes = fastPower(a,b/2);
		int fullRes = halfRes * halfRes;
		if(b%2!=0) fullRes = fullRes*a;
		return fullRes;
	}

	public static void main(String[] args) {
//		System.out.println(isPrime(53));
//		System.out.println(isPrimeEfficient(64));
//		System.out.println(isPrimeMoreEfficient(5));
//		printDivisors(30);
//		System.out.println("After sorting");
//		printSortDivisors(30);
//		printUntilNPrimeNUmbers(30);
//		printPrimeNumberOptimized(20);
		System.out.println(fastPower(100, 10));
		
	}
}
