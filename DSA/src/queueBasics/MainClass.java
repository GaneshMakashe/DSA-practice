package queueBasics;

import java.io.ObjectInputStream.GetField;

public class MainClass {


	public static void main(String[] args)throws Exception {
//		QueueUsingLinkedList q=new QueueUsingLinkedList();
//		QueueUsingArray q=new QueueUsingArray(4);
		QueueUsingCircularArray q= new QueueUsingCircularArray(4);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		//q.enqueue(50);
		
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(50);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.getSize());
		
		

	}

}
