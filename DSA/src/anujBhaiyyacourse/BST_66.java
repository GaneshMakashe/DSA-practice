package anujBhaiyyacourse;

public class BST_66 {

	//function to search a node in bst
	boolean search(Node root, int x) {
		if(root==null) return false;
		if(root.data==x) return true;
		if(root.data>x) {
			return search(root.left,x);
		}
		return search(root.right,x);
	}
}
