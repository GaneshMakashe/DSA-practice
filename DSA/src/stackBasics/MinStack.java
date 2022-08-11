package stackBasics;

import java.util.ArrayDeque;

public class MinStack {

	ArrayDeque<Integer> stack=new ArrayDeque<>();
	ArrayDeque<Integer> minStack=new ArrayDeque<>();
	
	void push(int e) {
		stack.push(e);
		if(minStack.isEmpty()) {
			minStack.push(e);
			return;
		}
		if(e<=minStack.peek()) {
			minStack.push(e);
		}
	}
	
	int pop() throws Exception {
		if(stack.isEmpty()) throw new Exception("Stack is empty");
		int ans=stack.pop();
		if(ans==minStack.peek()) {
			minStack.pop();
		}
		return ans; 
	}
	
	int min() throws Exception {
		if(stack.isEmpty()) throw new Exception("Stack is empty");
		return minStack.peek();
	}
}
