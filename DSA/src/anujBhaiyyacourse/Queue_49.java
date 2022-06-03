package anujBhaiyyacourse;

public class Queue_49 {
	
	class CircularArrayQueue{
		int[] a;
		int n;
		int front=-1,rear=-1;
		public CircularArrayQueue(int n) {
			this.n=n;
			a=new int[n];
		}
		
	void enqueue(int data) {
		if((rear+1)%n==front) {
         return;
	}
	if(front==-1) front=0;
	rear=(rear+1)%n;
	a[rear]=data;
	}

	int dequeue() throws Exception {
		if(front==-1) {
			throw new Exception();
		}
		int result = a[front];
		if(front==rear) {
			front=rear=-1;
	 } else {
		front=(front+1)%n;
	}
	return result;
	}
  }
}
 

