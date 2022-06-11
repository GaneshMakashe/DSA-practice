package anujBhaiyyacourse;

import java.util.HashSet;
import java.util.Set;

public class bst_71 {

	//find pair with the given sum in a bst
	//space O(n) and time O(n)
	
	public int isPairPresent(Node root, int target) {
		Set<Integer> set = new HashSet<>();
		boolean ans = util(root,target,set);
		return ans ? 1:0;
		
	}
	
	public boolean util(Node root, int sum, Set<Integer> set) {
		if(root ==null) return false;
		if(util(root.left,sum,set)== true) {
			return true;
		}
		
		if(set.contains(sum-root.data)) {
			return true;
		}
		set.add(root.data);
		
		return util(root.right, sum ,set);
	}
}
