package binaryTree;

public class MainClass {

	public static void main(String[] args) {
		
		BinaryTree bTree = new BinaryTree();
	
		Node root=bTree.createBinaryTree();

//		bTree.inOrderTraversal(root);
//		System.out.println(bTree.heightofBinaryTree(root));
		
//		System.out.println(bTree.levelOrder(root));
//		System.out.println(bTree.rightSideView(root));
		System.out.println(bTree.verticalOrder(root));

	}

}
