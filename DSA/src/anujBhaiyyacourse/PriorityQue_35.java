package anujBhaiyyacourse;

import java.util.Collections;
import java.util.PriorityQueue;

//Heap - Find Median of Running stream of Integers

//O(nlogn)--->time complexity
//O(n)------>space complexity
public class PriorityQue_35 {

	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public void insertNum(int num) {
		if(maxHeap.isEmpty() || maxHeap.peek() >= num)
			maxHeap.add(num);
		else
			minHeap.add(num);
		
		
		if(maxHeap.size() > minHeap.size()+1)
			minHeap.add(maxHeap.poll());
		else if (maxHeap.size() < minHeap.size())
			maxHeap.add(minHeap.poll());
	}
	
	public double findMedian() {
		if(maxHeap.size() == minHeap.size()) {
			return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
					
		}
		return maxHeap.peek();
	}
	
	public static void main(String[] args) {
		PriorityQue_35 pq = new PriorityQue_35();
		pq.insertNum(3);
		pq.insertNum(1);
		System.out.println("The median is: " + pq.findMedian());
		pq.insertNum(5);
		System.out.println("The median is: " + pq.findMedian());
		pq.insertNum(4);
		System.out.println("The median is: " + pq.findMedian());
	}

}
