package stackBasics;

import java.util.ArrayDeque;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) throws Exception 
	{
		//StackUsingArray stack = new StackUsingArray(3);
		//StackUsingLL stack = new StackUsingLL();
		
		//Stack<Integer> stack = new Stack<>();
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();//most recommended
		
		stack.push(2);
		stack.push(3);
		stack.push(1);
		stack.push(8);
		
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
	}
}
