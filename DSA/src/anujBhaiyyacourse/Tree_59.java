package anujBhaiyyacourse;

import java.util.LinkedList;
import java.util.Queue;

//level order traversal in a binary tree
public class Tree_59 {

	//time O(n2)
	void PrintCurrentLevel(Node root, int level) {
		if(root==null) return;
		if(level==1) {
			System.out.println(root.data+" ");
		}
		else if(level>1) {
			PrintCurrentLevel(root.left, level-1);
			PrintCurrentLevel(root.right, level-1);
		}
	}
	
	//O(n)
	void printLevelOrder(Node root) {
		Queue <Node> q = new LinkedList<>();
		q.add(root);q.add(null);
		while(!q.isEmpty()) {
			Node cur =q.poll();
			if(cur==null) {
				if(q.isEmpty()) return;
				q.add(null);
				System.out.println();
				continue;
			}
			System.out.println(cur.data);
			if(cur.left != null) {
				q.add(cur.left);
			}
			if(cur.right != null) {
				q.add(cur.right);
			}
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	}

}
