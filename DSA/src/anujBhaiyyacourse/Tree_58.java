package anujBhaiyyacourse;

public class Tree_58 {

	//size of a binary tree
	static int size(Node root) {
		if(root==null) return 0;
		return size(root.left) + size(root.right)+1;
	}

	
	//maximum in a binary tree
	//spaceO(h)
	//timeO(n)
	static int max(Node root) {
		if(root==null) return Integer.MIN_VALUE;
		return Math.max(root.data, Math.max(max(root.left), max(root.right)));
	}
}
