package anujBhaiyyacourse;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stack_42 {

	//Q1.Previous smaller Element
	static void previousSmallerElement(int a[]) {
		Stack <Integer> s =new Stack<>();
		for(int i=0;i<a.length;i++) {
			while(!s.isEmpty() && s.peek() >= a[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				System.out.println(-1);
			}
			else {
				System.out.println(s.peek());
			}
			s.push(a[i]);
		}
	}
	//Q3.Previous Greater Element
	static void previousGreaterElement(int a[]) {
		Stack <Integer> s =new Stack<>();//Deque<Integer> s = new ArrayDeque<>();
		for(int i=0;i<a.length;i++) {
			while(!s.isEmpty() && s.peek() <= a[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				System.out.println(-1);
			}
			else {
				System.out.println(s.peek());
			}
			s.push(a[i]);
		}
	}
	//Q2.Next Smaller Element
	static void nextSmallerElement(int[] a) {
		Stack <Integer> s =new Stack<>();
		for(int i=a.length-1;i>=0;i--) {
			while(!s.isEmpty() && s.peek() >= a[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				System.out.println(-1);
			}
			else {
				System.out.println(s.peek());
			}
			s.push(a[i]);
		}
	}
	//Q4.Next Greater Element
	static void nextGreaterElement(int a[]) {
		Deque<Integer> s = new ArrayDeque<>();
		for(int i=a.length-1;i>=0;i--) {
			while(!s.isEmpty() && s.peek() <= a[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				System.out.println(-1);
			}
			else {
				System.out.println(s.peek());
			}
			s.push(a[i]);
		}
	}
	
	
	public static void main(String[] args) {
		int[] a = {3,10,5,1,15,10,7,6};
		//previousSmallerElement(a);
		//previousGreaterElement(a);
		//nextSmallerElement(a);
		nextGreaterElement(a);
	}

}
