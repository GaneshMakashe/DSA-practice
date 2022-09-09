package binarySearchTree;

public class MainClass {

	static boolean isPresent(Node root, int key) {
		if(root==null) return false;
		System.out.println(root.data);
		if(root.data==key) return true;
		
		if(key>root.data) {
			return isPresent(root.right, key);
		}
		return isPresent(root.left, key);
	}
	
	static boolean isPresentIterative(Node root, int key) {
		Node cur=root;
		while(cur!=null) {
			if(cur.data==key) return true;
			if(key>cur.data)cur=cur.right;
			else cur=cur.left;
		}return false;
	}
	//insert into bst
	public Node insertIntoBST(Node root, int key) {
        Node parent=null, cur=root;
        while(cur != null){
            if(key > cur.data){
                parent=cur;
                cur=cur.right;
            }else if(key < cur.data){
                parent=cur;
                cur=cur.left;
            }
        }
        Node newNode=new Node(key);
            if(parent==null)return newNode;
        
        if(key>parent.data){
            parent.right=newNode;
        }else if(key<parent.data){
            parent.left=newNode;
        }
        return root;
    }
	
	public Node insertIntoBSTRecursively(Node root, int key) {
		if(root==null) return new Node(key);
		if(key>root.data) {
			root.right=insertIntoBSTRecursively(root.right, key);
		}else if(key<root.data) {
			root.left=insertIntoBSTRecursively(root.left, key);
		}
		return root;
	}
	
	Node parent=null;
	//delete node in a bst
	public Node deleteNode(Node root, int key) {
		Node cur=root;
		while(cur!=null) {
			if(cur.data==key) {
				break;
			}else if(key>cur.data) {
				parent=cur;
				cur=cur.right;
			}else {
				parent=cur;
				cur=cur.left;
			}
		}
		if(cur==null) return root;
	
		if(cur.left==null) {
			 if(cur.data<parent.data) {
				 parent.left=cur.right;
			 }else if(cur.data>parent.data) {
				 parent.right=cur.right;
			 }
			 return root;
		}
		if(cur.right==null) {
			if(cur.data<parent.data) {
				 parent.left=cur.left;
			 }else if(cur.data>parent.data) {
				 parent.right=cur.left;
			 }
			 return root;
		}
		
				
		parent=cur;
		int inorderSuccessor=findMinAndDelete(cur.right);
		cur.data=inorderSuccessor; 
		
		return root;
	}
	
	public int findMinAndDelete(Node root) {
		Node cur=root;
		if(cur.left==null) {
			parent.right=cur.right;
			return cur.data;
		}
		while(cur.left!=null) {
			cur=cur.left;
		}
		parent.left=null;
		return cur.data;
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
		
		int key=60;  
//		System.out.println(isPresent(root,key));
		System.out.println(isPresentIterative(root, key));

	}
	
}
class Node{
	int data;
	Node left,right;
	
	Node(int data){
		this.data=data;
	}
}