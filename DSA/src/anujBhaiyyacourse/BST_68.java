package anujBhaiyyacourse;

public class BST_68 {

	//delete an element from A BST
	
	public static Node deleteNode(Node root, int key) {
		if(root==null) return root;
		if(key<root.data)
			root.left=deleteNode(root.left, key);
		else if(key>root.data)
			root.right=deleteNode(root.right, key);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			root.data=minvalue(root.right);
			root.right=deleteNode(root.right, root.data);
		}
		return root;
	}

	private static int minvalue(Node root) {
		int minv =root.data;
		while(root.left !=null) {
			minv=root.left.data;
			root=root.left;
		}
		return minv;
	}
}
