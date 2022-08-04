package linkedListBasics;

public class MainClass2 {
	
	
	static void printLL(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"->");
			cur=cur.next;
		}
		System.out.println("End");
	}
	
	static Node findMiddleLL(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
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
	
	static boolean isPalindrome(Node head) {
		if(head==null || head.next==null) return true;
		Node mid=findMiddleLL(head);
		Node reverse=reverseLL(mid);
		Node left=head;
		Node right = reverse;
		while(right!=null) {
		if(left.data==right.data) {
			left=left.next;
			right=right.next;
		}else
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Node n1=new Node(3);
		Node n2=new Node(1);
		Node n3=new Node(2);
		Node n4=new Node(2);
		Node n5=new Node(1);
		Node n6=new Node(3);
		
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		
		printLL(head);
		System.out.println(isPalindrome(head));
		
	}
}
