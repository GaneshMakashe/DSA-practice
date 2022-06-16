package anujBhaiyyacourse;

import java.util.ArrayList;
import java.util.LinkedList;

//Grapg-->BFS-->Breadth first search
public class Graph_75 {

	//1.Find the minimum distance from source to destination
	private static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int u, int pred[], int dist[]) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[v];
		for(int i=0;i<v;i++) {
			visited[i] = false;
			dist[i]=Integer.MAX_VALUE;
			pred[i] = -1;
		}
		
		visited[src]=true;
		dist[src]=0;
		queue.add(src);
		
		while(!queue.isEmpty()) {
			int cur = queue.remove();
			for(int i=0;i<adj.get(u).size();i++) {
				int neighbor=adj.get(u).get(i);
				if(visited[neighbor]==false) {
					visited[neighbor]=true;
					dist[neighbor]=dist[cur]+1;
					pred[neighbor]=cur;
					queue.add(neighbor);
					
					
					if(neighbor==dest)
						return true;
				}
			}
		}
		return false;
	}
	
	//2.Find the number of connected components
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
