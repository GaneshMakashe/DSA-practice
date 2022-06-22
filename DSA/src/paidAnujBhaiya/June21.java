package paidAnujBhaiya;

import java.util.HashSet;
import java.util.Set;

public class June21 {

	//Find the sum of digits in a number using recursion
	//log10n+1
	//space complexity used is no of digits-->logn
	//time complexity-->logn
	public static int sumOfDigitsRecursion(int n) {
		if(n==0) return 0;
		int lastDigit = n%10;
		return lastDigit + sumOfDigitsRecursion(n/10);
		
		//using O(1) space complexity
//		int sum=0;
//		while(n>0) {
//			sum +=n%10;
//			 n /=10;
//		}
//		return sum;
	}
	
	//generate All Subset of given String
	//tc-->O(2^n)
	//sc-->O(n)
	static void generateAllSubsets(String s) {
		Set<String> set = new HashSet<>();
		utilGenerateAllSubsets(s, 0, "",set);
		for(String st: set) {
			System.out.println(st);
		}
		
	}
	
	static void utilGenerateAllSubsets(String s,int i,String cur,Set<String> set) {
		if(i==s.length()) {
			set.add(cur);
			return;
		}
		utilGenerateAllSubsets(s, i+1, cur,set);
		utilGenerateAllSubsets(s, i+1, cur+s.charAt(i),set);
	}
	
	
	//tower of hanoi problem
	//2^n-1
	public static void towerOfHonai(int n, char from, char to, char aux) {
		if(n==0) return ;
		
		towerOfHonai(n-1, from, aux, to);
		System.out.println("Move "+n+" from "+from+" to "+to);
		towerOfHonai(n-1, aux, to, from);
		
	}
	
	public static void main(String[] args) {
		//int n=2314;
		//System.out.println(sumOfDigitsRecursion(n));
		//generateAllSubsets("abc");
		towerOfHonai(3, 'A', 'C', 'B');
	}

}
