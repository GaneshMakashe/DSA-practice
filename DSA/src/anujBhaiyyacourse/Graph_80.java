package anujBhaiyyacourse;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Graph_80 {

	
	//topological sorting using bfs
	//kahn's algorithm
	static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
		int inDeg[]= new int[V];
		for(ArrayList<Integer> list: adj) {
			for(Integer e: list) {
				inDeg[e]++;
			}
		}
		boolean[] vis= new boolean[V];
		ArrayList<Integer> ansList = new ArrayList<>();
		bfs(adj,V,0,vis,ansList,inDeg);
		int ans[]=new int[V];
		int i=0;
		for(int e: ans) {
			ans[i++]=e;
		}
		
		return ans;
		
	}

	private static void bfs(ArrayList<ArrayList<Integer>> adj, int V, int v, boolean[] vis, ArrayList<Integer> ans,
			int[] inDeg) {
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<V;i++) {
			if(inDeg[i]==0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int cur = q.poll();
			ans.add(cur);
			
			for(int neighbor: adj.get(cur)) {
				if(--inDeg[neighbor]==0) {
					q.add(neighbor);
				}
			}
			
		}
		
	}
	
}
