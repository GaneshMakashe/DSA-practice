package anujBhaiyyacourse;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Tree_61 {

	static class Pair{
		int hd;
		Node node;
		
		public Pair(int hd, Node node) {
			this.hd = hd;
			this.node = node;
		}
	}
	
	//Top view of binary tree 
	static ArrayList<Integer> topView(Node root){
		Queue<Pair> q =new ArrayDeque<>();
		Map<Integer,Integer> map = new TreeMap<>();
		
		q.add(new Pair(0,root));
		while(!q.isEmpty()) {
			Pair cur = q.poll();
			if(!map.containsKey(cur.hd)) {
				map.put(cur.hd, cur.node.data);
			}
			if(cur.node.left != null) {
				q.add(new Pair(cur.hd-1,cur.node.left));
			}
			if(cur.node.right != null) {
				q.add(new Pair(cur.hd+1,cur.node.right));
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			ans.add(entry.getValue());
		}
		return ans;
	}
	
	//bottom view of binary tree
	static ArrayList<Integer> bottomView(Node root){
		Queue<Pair> q =new ArrayDeque<>();
		Map<Integer,Integer> map = new TreeMap<>();
		
		q.add(new Pair(0,root));
		while(!q.isEmpty()) {
			Pair cur = q.poll();
			map.put(cur.hd, cur.node.data);
			
			if(cur.node.left != null) {
				q.add(new Pair(cur.hd-1,cur.node.left));
			}
			if(cur.node.right != null) {
				q.add(new Pair(cur.hd+1,cur.node.right));
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			ans.add(entry.getValue());
		}
		return ans;
	}
}
