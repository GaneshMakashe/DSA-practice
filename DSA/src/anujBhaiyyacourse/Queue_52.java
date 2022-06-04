package anujBhaiyyacourse;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//flatten a multilevel linkedlist
public class Queue_52 {
//uisng queue uses space O(n)
//	public static Node convertList(Node head) {
//		Node curr =head;
//		Queue<Node> q = new ArrayDeque<>();
//		while(curr != null) {
//			if(curr.next == null) {
//				curr.next = q.poll();
//			}
//			if(curr.down != null) {
//				q.add(curr.down);
//			}
//			curr=curr.next;
//		}
//		return head;
//	}
	 
	public static Node flattenList(Node head) {
		if(head==null) {
			return null;
		}
		Node temp=null;
		Node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		Node cur =  head;
		while(cur != tail) {
			if(cur.down != null) {
				tail.next = cur.down;
				temp = cur.down;
				while(temp.next !=null) {
					temp = temp.next;
				}
				tail =temp;
			}
			cur=cur.next;
		}
		return cur;
	}
	
	public static void printOriginalList(Node head)
    {
        if (head == null) {
            return;
        }
 
        System.out.print(" " + head.data + " ");
 
        if (head.down != null)
        {
            System.out.print("[");
            printOriginalList(head.down);
            System.out.print("]");
        }
 
        printOriginalList(head.next);
    }
 
    // Utility function to print a linked list
    public static void printFlattenedList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
	
	public static void main(String[] args) {
		Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);
        Node fourteen = new Node(14);
        Node fifteen = new Node(15);
 
        // set head node
        Node head = one;
 
        // set next pointers
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;
 
        // set down pointers
        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;
 
        System.out.println("The original list is :");
        printOriginalList(head);
 
        head = flattenList(head);
        System.out.println("\n\nThe flattened list is :");
        printFlattenedList(head);
    }

	}


