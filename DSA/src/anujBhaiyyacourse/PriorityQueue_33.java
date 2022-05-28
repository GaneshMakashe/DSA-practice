package anujBhaiyyacourse;

//import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_33 {
	//min heap is implementation
	//public static void main(String[] args) {
//		PriorityQueue<Integer> pq = new PriorityQueue<>();//min heap
//		//PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//maxheap
//		pq.add(5);
//		pq.add(15);
//		pq.add(10);
//		System.out.println(pq.size());
//		while(!pq.isEmpty())
//			System.out.println(pq.peek());
//		pq.poll();
	//}
//print kth largest element in an array
	// a[]= {20,10,60,30,50,40}; and k=3;
	static int kthLargest(int[] a,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(a[i]);
		}
		for(int i=k;i<a.length;i++) {
			if(pq.peek()<a[i]) {
				pq.poll();
				pq.add(a[i]);
				}
		}
		return pq.peek();
	}
	
	public static void main(String[] args) {
		int[] a= {20,10,60,30,50,40};
		System.out.println(kthLargest(a, 3));
	}
}
//for kth min element implement maxheap
//for kth max element implement minheap