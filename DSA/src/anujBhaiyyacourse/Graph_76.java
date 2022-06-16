package anujBhaiyyacourse;

import java.util.ArrayList;

//DFS-->depth first search
public class Graph_76 {

	
	public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj){
		boolean vis[] = new boolean[V];
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<V;i++) {
			if(!vis[i]) {
				dfs(i,adj,vis,ans);//to know number of connected components
			}
		}
		//dfs(0, adj, vis, ans);
		return ans;
	}

	public void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans) {
		vis[v]=true;
		ans.add(v);
		for(Integer neighbor: adj.get(v)) {
			if(!vis[neighbor]) {
				dfs(neighbor, adj, vis, ans);
			}
		}
	}
}
