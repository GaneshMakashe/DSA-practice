package anujBhaiyyacourse;

public class Tree_63 {

	//Calculate the diameter of a binary tree
	//number of nodes in the largest path b/w two leaf nodes
	int diameter(Node root) {
		if(root==null) return 0;
		int dl = diameter(root.left);
		int dr = diameter(root.right);
		int cur = height(root.left)+height(root.right)+1;
		return Math.max(cur, Math.max(dl, dr));
	}

	 int height(Node root) {
		if(root==null) return 0;
		return 1+Math.max(height(root.left), height(root.right));
	}
	 //above solution is in O(n2)
	 //below is in O(n)
	 int ans=0;
	 int height1(Node root) {
		 if(root==null) return 0;
		 int lh = height(root.left);
		 int rh = height(root.right);
		 ans=Math.max(ans,1+lh+rh);//gives diameter
		 return 1+Math.max(lh,rh);
	 }
	 
	 
	 
	 
}
