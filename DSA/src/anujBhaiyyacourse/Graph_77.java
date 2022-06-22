package anujBhaiyyacourse;

import java.util.ArrayList;

public class Graph_77 {

	//detect a cycle in a undirected graph
	//dfs time complexity  O(V+E)
	public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
		boolean vis[] = new boolean[v];
		
		for(int i=0;i<v;i++) {
			if(!vis[i]) {
				if (dfs(i,adj,vis,-1)) return true;
			}
		}
		return false;
	}
	public boolean dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent) {
		vis[v]=true;
		
		for(Integer neighbor: adj.get(v)) {
			if(!vis[neighbor]) {
			   if(dfs(neighbor, adj, vis, v))
				   return true;
			}
			else if(parent != neighbor) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
