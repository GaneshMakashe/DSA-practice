package anujBhaiyyacourse;

public class BST_70 {

	//Floor and cell value in BST
	//without using space
	//solve iteratively and it is more optimizes over recursively
	int floor(Node root, int key) {
		int ans= Integer.MAX_VALUE;
		while(root!=null) {
			if(root.data==key) {
				return root.data;
			}
			if(root.data>key) {
				root=root.left;
			}else {
				ans=root.data;
				root=root.right;
			}
		}
		return ans;
	}
	
	int ceil(Node root, int key) {
		int ans= Integer.MIN_VALUE;
		while(root!=null) {
			if(root.data==key) {
				return root.data;
			}
			if(root.data>key) {
				ans=root.data;
				root=root.left;
			}else {
				root=root.right;
			}
		}
		return ans;
	}

}
