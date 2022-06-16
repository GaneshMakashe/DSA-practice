package anujBhaiyyacourse;

import java.util.ArrayList;

public class Graph_74 {

	public static void main(String[] args) {
		int v = 5;//vertex
		int e = 10; //edges
		
		int a[][] = new int [v+1][v+1];
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i<=v;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
	}
	
	static void addEdges(int source, int dest) {
		int v = 5;//vertex
		int e = 10; //edges
		
		int a[][] = new int [v+1][v+1];
		a[source][dest]=1;
		a[dest][source]=1;
	}
	
	static void addedge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
		adj.get(source).add(dest);
		adj.get(dest).add(source);
	}
	
}
