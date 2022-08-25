package stackBasics;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Problems {
	
	public static void main(String[] args) throws Exception {
//		MinStack21 obj=new MinStack21();
		Kstacks obj = new Kstacks(4);
		obj.push(5, 0);
		obj.push(2, 1);
		
		System.out.println("popped "+obj.pop(0));
//		System.out.println("min "+obj.min);
		obj.push(9,2);
		obj.push(1,3);
		obj.push(6,4);
//		System.out.println("min "+obj.min);
		System.out.println("popped "+obj.pop(1));
//		System.out.println("min "+obj.min);
		System.out.println("popped "+obj.pop(2));
//		System.out.println("min "+obj.min);

	}

}

class MinStack21{
	
	ArrayDeque<Integer> stack= new ArrayDeque<>();
	int min=0;
	
	void push(int t) {
		if(stack.isEmpty()) {
			min=t;
			stack.push(t);
			return;
		}
		if(t>=min) {
			stack.push(t);
		}else {
			stack.push(2*t-min);
			min=t;
		}
	}
	
	int pop() throws Exception {
		if(stack.isEmpty()) throw new Exception("stack is empty");
		int t=stack.pop();
		if(t>=min) {return t;}
		else {
			int ans=min;
			min=2*min-t;
			return ans;
		}
	}
	
	int min() throws Exception {
		if(stack.isEmpty()) throw new Exception("stack is empty");
		return min;
	}
	
	int peek() throws Exception {
		if(stack.isEmpty()) throw new Exception("stack is empty");
		int t=stack.peek();
		if(t>=min) { return t;}
		else {
			return min;
		}
	}
}

class Kstacks{
	
	int SIZE=10;
	int k;
	int a[], next[], top[], free;
	public Kstacks(int k) {
		this.k=k;
		a=new int[SIZE];
		top=new int[k];
		free=0;
		
		Arrays.fill(top, -1);
		for(int i=0;i<SIZE-1;i++) {
			next[i]=i+1;
		}
		next[SIZE-1]=-1;
	}
	
	boolean isFull() {
		return free==-1;
	}
	
	boolean isStackEmpty(int sn) {
		return top[sn]==-1;
	}
	
	void push(int data, int sn) throws Exception{
		if(isFull()) throw new Exception("Array is Full");
		int i=free;
		free=next[i];
		top[sn]=i;
		a[i]=data;
	}
	
	int pop(int sn) throws Exception {
		if(isStackEmpty(sn)) throw new Exception("Stack is Empty");
		int i=top[sn];
		top[sn]=next[i];
		next[i]=free;
		free=i;
		return a[i];
	}
	
	int peek(int sn) throws Exception {
		if(isStackEmpty(sn)) throw new Exception("Stack is Empty");
		int i=top[sn];
		return a[i];
	}
	
	
}
