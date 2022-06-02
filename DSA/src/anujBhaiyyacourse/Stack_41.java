package anujBhaiyyacourse;

import java.util.Stack;

public class Stack_41 {
//last in first out
	class Mystack{
		int[] a;
		int top;
		int capacity;
		public Mystack(int capacity) {
			this.capacity=capacity;
			top =-1;
			a = new int[capacity];
			}
		void push(int data) throws Exception {//adds element
			if(top==capacity-1) {
				throw new Exception();//overflow
			}
			top++;
			a[top]=data;
		}
		int pop() throws Exception {//remove top element
			if(top==-1) {
				throw new Exception();//underflow
			}
			int res=a[top];
			top--;
			return res;
		}
		int peek() throws Exception {//checks top element
			if(top==-1) {
				throw new Exception();
			}
			
			int[] res = null;
			return res[top];
		}
		boolean isEmpty() {
			return top==-1;
		}
	}
	//using linked list
	//dynamic approach
	class MyStack{
		Node head;
		int size;
		public MyStack() {
			head=null;
			size=0;
		}
		void push(int data) {
			Node temp = new Node(data);
			temp.next = head;size++;
			head = temp;
		}
		
		int peek() throws Exception {
			if(head==null) {
				throw new Exception();
			}
			return head.data;
		}
		
		int pop() throws Exception {
			if(head==null) {
				throw new Exception();
			}
			int res = head.data;
			head = head.next;size--;
			return res;
		}
		
		boolean isEmpty() {
			return head==null;
		}
		int size() {
			return size;
		}
		
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();//inbuild framework no need to make sepearte class of stack
		s.push(10);
		s.push(15);
		//s.pop();
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
			
		}
		System.out.println(s.size());
	}
	
	
}
