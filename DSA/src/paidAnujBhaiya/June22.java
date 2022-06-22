package paidAnujBhaiya;

public class June22 {

	//Rat in a Maze
	public static boolean ratInAMaze(int[][] a,boolean[][] vis, int i, int j) {
		
		//Base Conditions
		if(i>=a.length || j>=a.length || a[i][j]==0 || vis[i][j]) {
			return false;
		}
		//base condition is successfully reached
		if(i==a.length-1 && j==a.length-1)return true;
		
		//mark this cell as visited
		vis[i][j]=true;
		//check if a path is possible from down
		if(ratInAMaze(a, vis, i+1, j)) return true;
		//check if a path is possible from right
		if(ratInAMaze(a, vis, i, j+1)) return true;
		//mark this cell as unvisited and backtrack
		vis[i][j]=false;
		//backtrack
		return false;
			
	}
	
	//nqueen problem
	public static boolean nQueen(int[][] a,int n, int row) {
		
		if(row==n) return true;
		for(int col=0;col<n;col++) {
			if(isSafe(a,n,row,col)) {
				a[row][col]=1;
				if(nQueen(a, n, row+1)) {
					return true;
				}
				a[row][col]=0;
			}
		}
		return false;
	}
	
	public static boolean isSafe(int[][] a, int n, int row, int col) {
		for(int i=0;i<n;i++) {
			if(a[i][col]==1) return false;
		}
		
		for(int i=row, j=col;i>=0 && j>=0;i--,j--) {
			if(a[i][j]==1) return false;
		}
		for(int i=row, j=col;i>=0 && j<n;i--,j++) {
			if(a[i][j]==1) return false;
		}
	
		return true;
	}

	public static void main(String[] args) {
//		int[][] a= {
//				{0,1,0,0},
//				{0,0,0,1},
//				{1,0,0,0},
//				{0,0,1,0}
//		};
		
//		boolean[][] vis=new boolean[a.length][a.length];
//		boolean isPathpossible = ratInAMaze(a, vis, 0, 0);
//		System.out.println(isPathpossible);
		int n=5;
		int[][] a= new int[n][n];
		
		nQueen(a, n, 0);
		
		for(int[] array:a) {
			for(int e: array) {
				System.out.println(e+" ");
			}
			System.out.println();
		}
	}

}

