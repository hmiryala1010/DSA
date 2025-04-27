package graphs;

import java.util.ArrayList;

public class DirectedGraphExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        int n = 7; // Number of nodes (0 to 6)
		        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		        
		        for (int i = 0; i < n; i++) {
		            adjList.add(new ArrayList<>());
		        }

		        /*
		            Graph Structure (Directed):

		                0 → 1 → 3
		                 ↘︎  ↓
		                   2 → 5
		                      ↘︎
		                        6

		            - Node 0 has outgoing edges to 1 and 2
		            - Node 1 has outgoing edges to 3 and 4
		            - Node 2 has outgoing edges to 5 and 6
		        */

		        // Building the Directed Graph (edges one way)
		        adjList.get(0).add(1); // 0 → 1
		        adjList.get(0).add(2); // 0 → 2
		        adjList.get(1).add(3); // 1 → 3
		        adjList.get(1).add(4); // 1 → 4
		        adjList.get(2).add(5); // 2 → 5
		        adjList.get(2).add(6); // 2 → 6

		        System.out.println("BFS Traversal of Directed Graph starting from node given:");
		        Bfs.bfs(5, adjList); // calling bfs from bfs
		        System.out.println("DFS Traversal of Directed Graph starting from node given:");

		        SimpleDfs.dfs(0, adjList);
	 
	}

}
