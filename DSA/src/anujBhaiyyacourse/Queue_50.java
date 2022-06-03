package anujBhaiyyacourse;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_50 {

	public static void main(String[] args) {
		//Queue <Integer> q = new LinkedList<>();
		Queue <Integer> q = new ArrayDeque<>(); //recommmeded
		q.offer(10);//add element
		q.offer(20);
		q.offer(30);
		q.poll();//delete
		q.peek();//top element
		q.size();
		q.isEmpty();

	}

}
//throw exception --->element(),add(),remove()
//do not throw---->peek(),offer(),poll()