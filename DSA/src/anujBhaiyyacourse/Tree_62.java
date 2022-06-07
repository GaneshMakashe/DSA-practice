package anujBhaiyyacourse;

public class Tree_62 {

	//convert a binary tree to a doubly linked list //inorder traversal
	//no extra space
	//no extra space
	 Node prev=null;
	 Node head=null;
	 void convertToDll(Node root) {
		if(root==null) return;
		convertToDll(root.left);
		if(prev==null)head=root;
		else {
			root.left=prev;
			prev.right=root;
		}
		prev=root;
		convertToDll(root.right);
	}
	
	
	
}
