package queueBasics;



public class QueueProblem {

	static void printLL(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data+"->");
			cur=cur.next;
		}
		System.out.println("End");
	}
	
	//flattening the multilevel linked list
	 Node flatten(Node root) {
		Node cur=root, last=root;
		
		while(cur!=null) {
			while(last.next!=null) {
				last=last.next;
			}
			while(cur.down!=null) {
				last.next=cur.down;
			}
			cur=cur.next;
		}
		return root;
	}

	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6); 
		Node n7=new Node(7); 
		Node n8=new Node(8);
		Node n9=new Node(9);
		Node n10=new Node(10);
		
		
		
		Node root=n1;
		n1.next=n2;
		n2.next=n3;
		n2.down=n6;
		n3.next=n4;
		n4.next=n5;
		n4.down=n8;
		n5.next=n6;
		n6.next=n7;
		n7.down=n10;
		n7.next=n8;
		n8.next=n9;

		printLL(root);
		QueueProblem q=new QueueProblem();
		Node head=q.flatten(root);
		printLL(head);
	}

}
class Node{
	int data;
	Node next,down;
	
	public Node(int data) {
		this.data=data;}
}
