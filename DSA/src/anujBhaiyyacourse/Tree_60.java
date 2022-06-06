package anujBhaiyyacourse;

import java.util.ArrayList;

public class Tree_60 {

	//left view of binary tree
	void printLeftView(Node root) {
		ArrayList<Node> list = new ArrayList<>();
		printLeftViewUtil(root,list,0);
		for(Node cur: list) {
			System.out.println(cur.data+" ");
		}
	}

	 void printLeftViewUtil(Node root, ArrayList<Node> list, int level) {
		if(root==null) return;
		if(list.get(level)==null) {
			list.add(root);
		}
		printLeftViewUtil(root.left, list, level+1);
		printLeftViewUtil(root.right, list, level+1);
	}
	
	 
	 //right view of binary tree
	 void printRightView(Node root) {
			ArrayList<Node> list = new ArrayList<>();
			printLeftViewUtil(root,list,0);
			for(Node cur: list) {
				System.out.println(cur.data+" ");
			}
		}

		 void printRightViewUtil(Node root, ArrayList<Node> list, int level) {
			if(root==null) return;
			list.set(level, root);
			printLeftViewUtil(root.left, list, level+1);
			printLeftViewUtil(root.right, list, level+1);
		}
	
	
	
	
	
	
	
	
}
