package linkedListBasics;

class Node<T>{
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data=data;
	}
}
	
public class MainClass {

	static void printLL(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"->");
			cur=cur.next;
		}
		System.out.println("End");
	}
	
	static Node<Integer> insert(int data, int position, Node<Integer> head) {
		Node<Integer> newNode = new Node<>(data);
		if(position==0) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		Node<Integer> cur=head;
		for(int i=0;i<position-1;i++) {
			cur=cur.next;
			if(cur==null) return head;
		}
		newNode.next=cur.next;
		cur.next=newNode;
		return head;
	}
	
	static Node<Integer> delete(int position,Node<Integer> head) {
		if(head==null) return null;
		if(position==0) {
			head=head.next;
			return head;
		}
		Node<Integer> cur=head;
		for(int i=0;i<position-1;i++) {
			cur=cur.next;
		}
		cur.next=cur.next.next;
		return head;
	}
	
	static int findMiddleLL(Node<Integer> head) {
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}
	
	//next day 
	//Reverse a linked list-->Iterately
	static Node reverseLL(Node head) {
		Node cur=head,prev=null;
		while(cur!=null) {
			Node temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		return prev;
	}
	
	//Reverse a linked list-->Recursively
	static Node reversaRecursiveLL(Node head) {
		if(head==null || head.next==null) return head;
		Node temp=head.next;
		Node newHead = reversaRecursiveLL(head.next);
		temp.next=head;
		head.next=null;
		return newHead;
		
	}
	
	//Reverse a linked list in a group of k
	static Node reverseK(Node head, int k) {
		Node cur=head, prevFirst=null, newHead=null;
		while(cur!=null) {
			int count=0;
			Node prev=null,first=cur;
			while(cur!=null && count<k) {
				Node temp =cur.next;
				cur.next=prev;
				prev=cur;
				cur=temp;
				count++;
			}
			if(newHead==null) {
				newHead=prev;
			}
			else {
				prevFirst.next=prev;
			}
			prevFirst=first;
		}
		return newHead;
		
	}
	
	
	//detect a cycle in a linked list
	static boolean detectACycleLL(Node head) {
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow) return true;
		}
		return false;
	}
	
	static Node isCyclePresent(Node head) {
		Node slow=head,fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return slow;
			}
		}
		return null;
	}
	
	//floyde's cycle detection algorithm
	static Node startingofCycle(Node head) {
		Node meet=isCyclePresent(head);
		if(meet==null) return null;
		Node cur=head;
		while(cur!=meet) {
			cur=cur.next;
			meet=meet.next;
		}
		return cur;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
	Node<Integer> n1=new Node<>(10);
	Node<Integer> n2=new Node<>(20);
	Node<Integer> n3=new Node<>(30);
	Node<Integer> n4=new Node<>(40);
	Node<Integer> n5=new Node<>(50);
	Node<Integer> n6=new Node<>(60); 
	Node<Integer> n7=new Node<>(70); 
	Node<Integer> n8=new Node<>(80); 
	
	
	Node head=n1;
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=n6;
	n6.next=n7;
	n7.next=n8;
	n8.next=n3;

	
	//printLL(head);
	//head=insert(100, 2, head);
	//head=delete(5, head);
	//printLL(head);
	//System.out.println(findMiddleLL(head));
//	head=reverseLL(head);
//	printLL(head);
//	head=reversaRecursiveLL(head);
//	head=reverseK(head, 3);
	System.out.println(detectACycleLL(head));
	Node firstNode=startingofCycle(head);
	System.out.println(firstNode.data);//error is coming is it is false update with bhaiiyya code
	
	}

}


