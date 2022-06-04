package anujBhaiyyacourse;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

//Implement Queue using stack
public class Queue_51 {

	class MyQueue{
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		void push(int data) {
			s1.push(data);//--->O(1)
		}
		
		int pop() {
			while(!s1.empty()) {
				s2.push(s1.pop());
			}
			int ans =s2.pop();
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			return ans;
		}
	}

	///Implement stack using queue
	
	class Mystack{
		Queue <Integer> q1 = new ArrayDeque<>();
		Queue <Integer> q2 = new ArrayDeque<>();
		
		void push(int data) {
			while(!q1.isEmpty()) {
				((MyQueue) q2).push(q1.poll());
			}
			((MyQueue) q1).push(data);
			while(!q2.isEmpty()) {
				((MyQueue) q1).push(q2.poll());
			}
		}
		int poll(){
			return q1.poll();
		}
		
     }
}
