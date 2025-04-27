package graphs;

import java.util.ArrayList;

public class UndirectedGraphExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        int n = 7; // Number of nodes (0 to 6)
		        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		        
		        for (int i = 0; i < n; i++) {
		            adjList.add(new ArrayList<>());
		        }

		        /*
		            Graph Structure (Undirected):

		                0
		               / \
		              1   2
		             / \  / \
		            3  4 5  6

		            - Node 0 connected to 1 and 2
		            - Node 1 connected to 3 and 4
		            - Node 2 connected to 5 and 6
		            (and because it's undirected, edges both ways)
		        */

		        // Building the Undirected Graph (edges both ways)
		        adjList.get(0).add(1);
		        adjList.get(1).add(0);

		        adjList.get(0).add(2);
		        adjList.get(2).add(0);

		        adjList.get(1).add(3);
		        adjList.get(3).add(1);

		        adjList.get(1).add(4);
		        adjList.get(4).add(1);

		        adjList.get(2).add(5);
		        adjList.get(5).add(2);

		        adjList.get(2).add(6);
		        adjList.get(6).add(2);

		        System.out.println("BFS Traversal of Undirected Graph starting from node given:");
		        Bfs.bfs(2, adjList); // calling bfs from SimpleBFS
		        System.out.println("DFS Traversal of Directed Graph starting from node given:");
		        SimpleDfs.dfs(0, adjList);
	

	}

}
