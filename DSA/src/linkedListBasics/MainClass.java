package linkedListBasics;

class Node{
	int data;
	Node next;

	
	public Node(int data) {
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
	
	static Node insert(int data, int position, Node head) {
		Node newNode = new Node(data);
		if(position==0) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		Node cur=head;
		for(int i=0;i<position-1;i++) {
			cur=cur.next;
			if(cur==null) return head;
		}
		newNode.next=cur.next;
		cur.next=newNode;
		return head;
	}
	
	static Node delete(int position,Node head) {
		if(head==null) return null;
		if(position==0) {
			head=head.next;
			return head;
		}
		Node cur=head;
		for(int i=0;i<position-1;i++) {
			cur=cur.next;
		}
		cur.next=cur.next.next;
		return head;
	}
	
	static int findMiddleLL(Node head) {
		Node slow=head;
		Node fast=head;
		
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
		Node slow=head;
		Node fast=head;
		
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
	
	//merge two sorted Linked list
	static Node mergeTwoSortedLL(Node head1, Node head2) {
		Node head=null,tail=null;
		Node a=head1, b=head2;
		
		if(a==null) return b;
		if(b==null) return a;
		if(a.data <= b.data) {
			head=a;
			tail=a;
			a=a.next;
		}else {
			head=b;
			tail=b;
			b=b.next;
		}
		
		while(a!=null && b!=null) {
			if(a.data <= b.data) {
				tail.next=a;
				tail=a;
				a=a.next;
			}else {
				tail.next=b;
				tail=b;
				b=b.next;
			}
		}
		if(a==null) tail.next=b;
		if(b==null) tail.next=a;
		
		return head;
	}
	
	
	
	public static void main(String[] args) {
	Node n1=new Node(2);
	Node n2=new Node(4);
	Node n3=new Node(8);
	Node n4=new Node(10);
	Node n5=new Node(1);
	Node n6=new Node(3); 
	Node n7=new Node(5); 
	Node n8=new Node(9); 
	Integer.MAX_VALUE
	
	Node head1=n1;
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	Node head2=n5;
	n5.next=n6;
	n6.next=n7;
	n7.next=n8;
	

	
	//printLL(head);
	//head=insert(100, 2, head);
	//head=delete(5, head);
	//printLL(head);
	//System.out.println(findMiddleLL(head));
//	head=reverseLL(head);
//	printLL(head);
//	head=reversaRecursiveLL(head);
//	head=reverseK(head, 3);
//	System.out.println(detectACycleLL(head));
//	Node firstNode=startingofCycle(head);
//	System.out.println(firstNode.data);//error is coming is it is false update with bhaiiyya code
	Node head=mergeTwoSortedLL(head1, head2);
	printLL(head);
	
	
	
	
	
	}

}


