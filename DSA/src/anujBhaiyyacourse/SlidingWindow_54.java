package anujBhaiyyacourse;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

public class SlidingWindow_54 {

	//brutforce //time:O(n*k) and space: O(1)
//	static void printMax(int[] a, int n, int k) {
//		int j,max;
//		for(int i=0;i<=n-k;i++) {
//			max=a[i];
//			for(j=1;j<k;j++) {
//				if(a[i+j]>max)
//					max=a[i+j];
//			}
//			System.out.println(max + " ");
//		}
//	}
	
	//Using avl tree /priority queue time:O(nlog) space:O(k)
//	static ArrayList<Integer> printMax(int[] a,int n ,int k){
//		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
//		
//		ArrayList<Integer> res =new ArrayList<>();
//		int i=0;
//		
//		for(;i<k;i++)
//			q.add(a[i]);
//		res.add(q.peek());
//		q.remove(a[0]);
//		for(;i<n;i++) {
//			q.add(a[i]);
//			res.add(q.peek());
//			q.remove(a[i-k+1]);
//		}
//		return res;
//
//	}
	
	//using deque//time O(n) space O(k)b//most imp
	static void printMax(int[] a, int n, int k) {
		Deque<Integer> Qi = new ArrayDeque<Integer>();
		int i;
		for(i=0;i<k;i++) {
			while(!Qi.isEmpty() && a[i]>=a[Qi.peekLast()])
				Qi.removeLast();
			Qi.addLast(i);
		}
		for(;i<n;i++) {
			System.out.println(a[Qi.peek()] + " ");
			while ((!Qi.isEmpty()) && Qi.peek() <= i-k)
				Qi.removeFirst();
			while ((!Qi.isEmpty()) && a[i] >= a[Qi.peekLast()]) 
				Qi.removeLast();
			Qi.addLast(i);
		}
		System.out.println(a[Qi.peek()]);
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int k =3;
		printMax(a,a.length,k);
		

	}

}
