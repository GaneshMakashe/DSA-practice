package queueBasics;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueProblems1 {

	//reverse the first k elements of a queue
	static Queue<Integer> reverse(Queue<Integer> q, int k){
		if(q.isEmpty() || k<=0 || k>q.size()) return q;
		int n=q.size();
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int i=0;i<k;i++) {
			stack.push(q.poll());
		}
		
		while(!stack.isEmpty()) {
			q.add(stack.pop());
		}
		
		for(int i=0;i<n-k;i++) {
			q.add(q.poll());
		}
		return q; 
	}
	
	
	//Circular Tour Problem
	static int circularTour(int p[], int d[]) {
		int n=p.length;
		int cur=0;
		int start=0;
		int deficit=0;
		
		for(int i=0;i<n;i++) {
			cur +=(p[i]-d[i]);
			if(cur<0) {
				deficit +=cur;
				cur=0;
				start=i+1;
			}
		}
		if(cur+deficit>=0) return start;
		return -1;
	}
	
	//sliding window maximum problem
	

	public static void main(String[] args) {
//		Queue<Integer> q=new ArrayDeque<>();
//		
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		q.add(5);
//		q.add(6);
//		int k=3;
//		System.out.println(q);
//		reverse(q, k);
//		System.out.println(q);

		int[] p= {6,10,2,3,20};
		int[] d= {5,8,4,5,6};
		
		System.out.println(circularTour(p, d));
	}

}
