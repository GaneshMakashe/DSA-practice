package binarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class MainClass1 {

	public static boolean isValidBST(Node root) {
		return isValidBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
		
	}
	 static boolean isValidBST(Node root, long minValue, long maxValue) {
		 if(root==null) return true;
		 
		 if(root.data<=minValue || root.data>=maxValue) return false;
		 
		 return isValidBST(root.left, minValue, root.data)&&
				 isValidBST(root.right, root.data, maxValue);
	 }
	 
	 //shortest distance between two bst nodes
	 static int findDist(Node root,int a, int b) {
		 if(root==null) return 0;
		 if(a>b) {
			 return findDist(root, b, a);
		 }
		 
		 if(a<root.data&&b<root.data) {
			 return findDist(root.left, a, b);
		 }
		 if(a>root.data&&b>root.data) {
			 return findDist(root.right, a, b);
		 }
		 return distance(root, a)+distance(root,b);
	 }
	 
	 static int distance(Node root, int a) {
		 if(root==null || root.data==a) return 0;
		 if(root.data==a) return 0;
		 if(a<root.data) return 1+distance(root.left, a);
		 return 1+distance(root.right, a);
	 }
	 
	 
	 //find a pair with the given target sum in a BST
	 
	 //inorder traversal without recursion and iteration
	public List<Integer>inorderTraversal(Node root){
		List<Integer> ans=new ArrayList<>();
		
		Node cur=root;
		while(cur!=null) {
			if(cur.left==null) {
				ans.add(cur.data);
				cur=cur.right;
			}else {
				Node temp=cur.left;
				while(temp.right!=null && temp.right!=cur) {
					temp=temp.right;
				}
				if(temp.right==cur) {
					temp.right=null;
					ans.add(cur.data);
					cur=cur.right;
				}else {
					temp.right=cur;
					cur=cur.left;
				}
			}
		}
		return ans;
	}
	 
	 
	 
	public static void main(String[] args) {
		Node root=new Node(50);
		root.left=new Node(30);
		root.right=new Node(80);
		root.left.left=new Node(20);
		root.left.right=new Node(40);
		root.right.left=new Node(70);
		root.right.right=new Node(100);
		root.right.left.left=new Node(60);
		
		System.out.println(isValidBST(root));
		System.out.println(findDist(root, 20, 80));

	}

}
