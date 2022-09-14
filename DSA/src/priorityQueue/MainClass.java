package priorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainClass {
	
	//check once
	
	static int findKthSmallest(int a[], int k) {
		if(k>a.length) return -1;
		Queue<Integer> pq= new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.offer(a[i]);
		}
		for(int i=k;i<a.length;i++) {
			System.out.println(pq);
			if(pq.peek()>a[i]) {
				pq.poll();
				pq.offer(a[i]);
			}
		}
		System.out.println(pq);
		return pq.peek();
	}
	static int findKthLArgest(int a[], int k) {
		if(k>a.length) return -1;
		Queue<Integer> pq= new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.offer(a[i]);
		}
		for(int i=k;i<a.length;i++) {
			System.out.println(pq);
			if(pq.peek()<a[i]) {
				pq.poll();
				pq.offer(a[i]);
			}
		}
		System.out.println(pq);
		return pq.peek();
	}
	
	
	//connect n ropes with minimum cost
	static long minCost(long a[], int n) {
		PriorityQueue<Long> pq=new PriorityQueue<>();
		for(long e:a) {
			pq.offer(e);
		}
		
		long ans=0;
		while(pq.size()>1) {
			long first =pq.poll();
			long second=pq.poll();
			
			long cost=first+second;
			ans+=cost;
			pq.offer(cost);
			
		}
		return ans;
	}
	
	//
	static int splitArrayInKSubArray(int a[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.offer(0);
		}
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
			int cur=a[i];
			int top=pq.poll();
			int toAdd=cur+top;
			pq.offer(toAdd);
		}
		int max=-1;
		for(int e:pq) {
			max=Math.max(max, e);
		}
		return max;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	Queue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());

//	pq.offer(5);
//	pq.offer(10);
//	pq.offer(9);
//	pq.offer(1);
//	
//	System.out.println(pq);
//	System.out.println(pq.poll());
//	System.out.println(pq);
//	System.out.println(pq.poll());
//	System.out.println(pq);
//	System.out.println(pq.poll());
//	System.out.println(pq);
//	System.out.println(pq.poll());
//	System.out.println(pq);
	
//	int a[]= {1,4,9,2,5,6,7};
//	int k=3;
//	System.out.println(findKthLArgest(a, k));
//	System.out.println(findKthSmallest(a, k));
	
//	long a[]= {4,3,2,6};
//	System.out.println(minCost(a, 0));
//	int a[]= {1,4,2,3,7,2,4,5,6,3};
//	int k=3;
//	System.out.println(splitArrayInKSubArray(a, k));
	
	MedianFinder m=new MedianFinder();
	m.addNum(2);
	m.addNum(1);
	m.addNum(7);
	m.addNum(3);
	m.addNum(4);
	m.addNum(5);
	System.out.println(m.findMedian());
	
	}
}
