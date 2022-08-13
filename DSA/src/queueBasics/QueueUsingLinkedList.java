package queueBasics;

public class QueueUsingLinkedList {

	private Node front, rear;
	
	//push
	void enqueue(int data) {
		Node newNode=new Node(data);
		if(isEmpty()) {
			front=rear=newNode;
			return;
		}
		rear.next=newNode;
		rear=newNode;
	}
	
	boolean isEmpty() {
		return front==null;
	}
	
	int dequeue() throws Exception{
		if(isEmpty()) throw new Exception("Queue is Empty");
		int ans=front.data;
		front=front.next;
		return ans;
	}
	
	int getFront() throws Exception{
		if(isEmpty()) throw new Exception("Queue is Empty");
		return front.data;
	}
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;}
	}
}
