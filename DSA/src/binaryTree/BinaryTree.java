package binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Queue;


public class BinaryTree {
	Scanner sc;
	Node root;
	
	public BinaryTree() {
		sc=new Scanner(System.in);
	}
	
	//creates a binary tree and return the root node
	Node createBinaryTree() {
		System.out.println("Enter the node data:");
		int data=sc.nextInt();
		
		if(data==-1) return null;
		Node node=new Node(data);
		
		System.out.println("Enter "+data+"'s left data");
		node.left=createBinaryTree();
		
		System.out.println("Enter "+data+"'s right data");
		node.right=createBinaryTree();
		
		return node;
		
	}
	
	//inorder traversal in a binary tree
	void inOrderTraversal(Node root) {
		if(root==null) return;
		
		inOrderTraversal(root.left);//left
		System.out.println(root.data);//node
		inOrderTraversal(root.right);//right
		
	}

	//preordertraversal
	void preOrderTraversal(Node root) {
		if(root==null) return;
		
		System.out.println(root.data);//node
		inOrderTraversal(root.left);//left
		inOrderTraversal(root.right);//right
		
	}
	//post order traversal
	void postOrderTraversal(Node root) {
		if(root==null) return;
		
		
		inOrderTraversal(root.left);//left
		inOrderTraversal(root.right);//right
		System.out.println(root.data);//node
		
	}
	
	//height of a tree
	int heightofBinaryTree(Node root) {
		if(root==null) return 0;
		
		int lh=heightofBinaryTree(root.left);
		int rh=heightofBinaryTree(root.right);
		return Math.max(lh, rh)+1;
	}
	
	//print all the nodes present at k distance
	void printNodesAtKDistance(Node root,int k) {
		if(root==null) return;
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		
		printNodesAtKDistance(root.left, k-1);
		printNodesAtKDistance(root.right, k-1);
	}
	
	
	
	//print all the nodes level wise
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		if(root==null) return ans;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		ArrayList<Integer> curList=new ArrayList<>();
		while(!q.isEmpty()) {
			Node cur=q.poll();
			if(cur==null) {
				ans.add(curList);
				if(q.isEmpty()) return ans;
				q.add(null);
				curList=new ArrayList<>();
			}
			else {
				curList.add(cur.data);
				
				if(cur.left!=null) {
					q.add(cur.left);
				}
				if(cur.right!=null) {
					q.add(cur.right);
				}
			}
		}
		return ans;
	}
	
	//right view of binary tree
	public List<Integer> rightSideView(Node root){
		ArrayList<Integer> ans=new ArrayList<>();
		int level=0;
		rightSideViewUtil(root, level, ans);
		return ans;
	}
	
	void rightSideViewUtil(Node root, int level, ArrayList<Integer> ans) {
		if(root==null) return;
		if(ans.size()==level) {
			ans.add(root.data);
		}
		
		rightSideViewUtil(root.right, level+1, ans);
		rightSideViewUtil(root.left, level+1, ans);
	}
	
	
	//vertical order traversal
	static ArrayList<Integer> verticalOrder(Node root){
		
		Map<Integer,ArrayList> map=new TreeMap<>();
		if(root==null ) return null;
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(0,root));
		while(!q.isEmpty()) {
			Pair cur=q.poll();
			int key=cur.hd;
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<Integer>());
			}
			map.get(key).add(cur.node.data);
			
			if(cur.node.left!=null) {
				q.add(new Pair(key-1,cur.node.left));
			}
			if(cur.node.right!=null) {
				q.add(new Pair(key-1,cur.node.right));
			}
		}
		
		ArrayList<Integer> ans= new ArrayList<>();
		for(ArrayList<Integer> e:map.values()) {
			ans.addAll(e);
		}
		return ans;
	}
	
	static class Pair{
		int hd;
		Node node;
		
		public Pair(int hd, Node node) {
			this.hd = hd;
			this.node = node;
		}
		
		
	}
	
	
	
	
}

class Node{
	int data;
	Node left,right;
	 public Node(int data) {
		 this.data=data;
	 }
}
