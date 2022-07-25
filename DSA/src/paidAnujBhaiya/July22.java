package paidAnujBhaiya;

import java.util.*;

public class July22 {

	//count distinct elements
	static int countDistinctElements(int[] a) {
		Set<Integer> set = new HashSet<>();
		for(int e:a) {
			set.add(e);
		}
		System.out.println(set);
		return set.size();
		
	}
	
	//frequency of elements in a array
	static void frequencyOfElements(int a[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int e:a) {
			if(map.containsKey(e)) {
				int temp = map.get(e);
				map.put(e, temp+1);
			}else {
				map.put(e, 1);
			}
			System.out.println(e+" "+map);
		}
		System.out.println(map);
	}

	//pair with given sum in a unsorted array
	static boolean pairWithGivenSum(int[] a,int sum) {
		Set<Integer> set = new HashSet<>();
		for(int e: a) {
			int comp=sum-e;
			if(set.contains(comp)) return true;
			set.add(e);
		}
		return false;
	}
	
	//zero sum subarray
	static boolean zeroSumSubArray(int a[]) {
		Set<Integer> set = new HashSet<>();
		int cs=0;
		set.add(0);
		for(int e:a) {
			cs +=e;
			if(set.contains(cs)) return true;
			set.add(cs);
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		int a[]= {1,2,1,3,2,-1,-4};
		//System.out.println(countDistinctElements(a));
		//frequencyOfElements(a);
		//System.out.println(pairWithGivenSum(a, 8));
		System.out.println(zeroSumSubArray(a));
	}

}
