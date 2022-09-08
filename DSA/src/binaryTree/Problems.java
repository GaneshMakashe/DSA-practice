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
	
	
	
	
}
