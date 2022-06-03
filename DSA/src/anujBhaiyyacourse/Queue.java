package anujBhaiyyacourse;

public class Queue {

	Node front, rear;
	
	void enqueue(int data) {
		Node newNode = new Node(data);
		if(front==null) {
			front=rear=newNode;return;
		}
		rear.next=newNode;
		rear=newNode;
	}
	 int dequeue() throws Exception {
		if(front==null) {
			throw new Exception();
		}
		int result = front.data;
		front=front.next;
		return result;
	}
}

