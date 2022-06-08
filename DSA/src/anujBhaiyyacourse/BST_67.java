package anujBhaiyyacourse;

public class BST_67 {

	//insert function in a binary search tree
	//recurisvely
	//time complexity O(h)h-->height of tree
	//space-->O(h)
	Node insert(Node root, int key) {
		if(root==null) {
			return new Node(key);
		}
		if(root.data>key) {
			root.left=insert(root.left,key);
		}else if(root.data<key) {
			root.right = insert(root.right,key);
		}
		return root;
	}
	
	//iterative code
	Node insert1(Node root, int key) {
		Node newnode = new Node(key);
		Node cur= root;
		Node parent = null;
		
		while(cur!=null) {
			parent = cur;
			if(key<cur.key)
				cur=cur.left;
			else
				cur=cur.right;
		}
		if(parent==null)
			parent=newnode;
		else if(key<parent.key)
			parent.left=newnode;
		else
			parent.right=newnode;
		
		return root;
		
	}
//	space--O(1)
//	time--O(h)
}
