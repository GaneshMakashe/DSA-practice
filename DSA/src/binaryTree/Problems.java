package binaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Problems {

	
	//inorder traversal without using recursion
	public List<Integer> inOrderTraversal(Node root){
		List<Integer> ans=new ArrayList<>();
		ArrayDeque<Node> stack = new ArrayDeque<>();
		
		Node cur=root;
		
		while(cur!=null || !stack.isEmpty()) {
			while(cur!=null) {
				stack.push(cur);
				cur=cur.left;
			}
			
			Node pop=stack.pop();
			ans.add(pop.data);
			
			cur=pop.right;
		}
		return ans;
	}
	
	
	//preorder Traversal without using recurison
	public List<Integer> preOrderTraversal(Node root){
		List<Integer> ans=new ArrayList<>();
		if(root==null) return ans;
		
		ArrayDeque<Node> stack = new ArrayDeque<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			Node pop=stack.pop();
			
			ans.add(pop.data);
			
			if(pop.right!=null) {
				stack.push(pop.right);
			}
			if(pop.left!=null) {
				stack.push(pop.left);
			}
		}
		return ans;
	}
	
	
	//postorder traversal
	public List<Integer> postorderTraversal(Node root){
		List<Integer> ans=new ArrayList<>();
		if(root==null) return ans;
		ArrayDeque<Node> s1= new ArrayDeque<>();
		ArrayDeque<Node> s2= new ArrayDeque<>();
		
		s1.push(root);
		while(!s1.isEmpty()) {
			Node pop=s1.pop();
			s2.push(pop);
			if(pop.left!=null) {
				s1.push(pop.left);
			}
			if(pop.right!=null) {
				s1.push(pop.right);
			}
		}
		while(!s2.isEmpty()) {
			ans.add(s2.pop().data);
		}
		return ans;
	}
	
	//diameter of binary tree
	public int diameterOfBinaryTree(Node root) {
		if(root==null) return 0;
		
		int ld=diameterOfBinaryTree(root.left);
		int rd=diameterOfBinaryTree(root.right);
		
		int lh=height(root.left);
		int rh=height(root.right);
		int cur=lh+rh ;

		return Math.max(cur, Math.max(ld, rd));
	}
	
	int height(Node root) {
		if(root==null) return 0;
		
		int lh=height(root.left);
		int rh=height(root.right);
		
		return Math.max(lh, rh)+1;
	}
	
	//ancestor of node given
	public static ArrayList<Integer> Ancestors(Node root, int target){
		 ArrayList<Integer> ans=new ArrayList<>();
		 isPresent(root,target,ans);
		 return ans;
	}
	
	public static boolean isPresent(Node root, int target,  ArrayList<Integer> ans) {
		if(root==null) return false;
		if(root.data==target||isPresent(root.left, target, ans)||isPresent(root.right, target, ans)) {
			ans.add(root.data);
			return true;
		}
		return false;
	}
	
	public static boolean isPresent1(Node root, int target,  ArrayList<Node> ans) {
		if(root==null) return false;
		if(root.data==target||isPresent1(root.left, target, ans)||isPresent1(root.right, target, ans)) {
			ans.add(root);
			return true;
		}
		return false;
	}
	
	//	Lowest ancestors of a binary tree
	 public Node lowestCommonAncestor(Node root,Node p,Node q) {
//		 ArrayList<Node> l1=new ArrayList<>();
//		 ArrayList<Node> l2=new ArrayList<>();
//		 isPresent1(root, p.data, l1);
//		 isPresent1(root, q.data, l2);
//		 
//		 int i=l1.size()-1;
//		 int j=l2.size()-1;
//		 
//		 while((i>=0&&j>=0)||l1.get(i).data==l2.get(j).data) {
//			 i--;
//			 j--;
//		 }
//		 if(i==l1.size()-1) return null;
//		 return l1.get(i+1);
		 
		 if(root==null) return null;
		 if(root.data==p.data||root.data==q.data) return root;
		 
		 Node left=lowestCommonAncestor(root.left, p, q);
		 Node right=lowestCommonAncestor(root.right, p, q);
		 
		 if(right==null) return left;
		 if(left==null) return right;
		 
		 return root;
	 }
	
	 Node prev=null,head=null;
	Node bToDLL(Node root) {
		bToDLLUtil(root);
		return head;
	}
	void bToDLLUtil(Node root) {
		if(root==null) return;
		
		bToDLLUtil(root.left);
		if(prev==null) {
			head=root;
		}else {
		root.left=prev;
		prev.right=root;
		}
		bToDLLUtil(root.right);
		
	}
	
}
