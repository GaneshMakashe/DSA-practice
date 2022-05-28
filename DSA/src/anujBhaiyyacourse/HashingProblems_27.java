package anujBhaiyyacourse;

import java.util.HashSet;
import java.util.Set;

//set property is that it takes only distinct elements
	
public class HashingProblems_27 {
	//Question No 1 Count Distinct Elements
	static int countDistinct(int[] a) {
		Set<Integer> set = new HashSet<>();
		for(int element: a) {
			set.add(element);
		}
		return set.size();
	}
	
	//Q.2 Union of two arrays
	static int union(int[] a, int[]b) {
		Set<Integer> set = new HashSet<>();
		for(int x: a) {
			set.add(x);
		}
		for(int x: b) {
			set.add(x);
		} 
		return set.size();
	}
	
	//Q.3 Intersection of two arrays--->return size of common elements
	static int intersection(int[] a, int[]b) {
		Set<Integer> set = new HashSet<>();
		int count=0;
		for(int x: a) {
			set.add(x);
		}
		for(int x: b) {
			if(set.contains(x)) {
				count++;
				set.remove(x);
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		
		int[] a = {5,10,15,5,10};
		int[] b = {15,5,5,10,4};
		//Question No 1 Count Distinct Elements
		System.out.println(countDistinct(a));
		System.out.println(countDistinct(b));
		//Q.2 Union of two arrays
		System.out.println(union(a, b));
		//Q.3 Intersection of two arrays
		System.out.println(intersection(a, b));
	}

}
