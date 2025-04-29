package graphs;

import java.util.ArrayList;

public class NumberOfProvince {
	 public int findCircleNum(int[][] isConnected) {
	        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
	        int n=isConnected.length;
	        for(int i=0;i<n;i++){
	            adjlist.add(new ArrayList<>());
	        }
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(isConnected[i][j]==1){
	                    adjlist.get(i).add(j);
	                }
	            }
	        }


	        int[] visited=new int[n];
	         int count=0;
	         for(int i=0;i<n;i++){
	            if(visited[i]==0){
	                count++;
	                dfs(adjlist,i,visited);
	            }
	         }
	          
	return count;

	    }
	    void dfs(ArrayList<ArrayList<Integer>> adjlist, int starting_node, int[] visited){
	        visited[starting_node]=1;
	        for(Integer neighbour : adjlist.get(starting_node)){
	            if(visited[neighbour]==0)
	            dfs(adjlist,neighbour,visited);
	        }


	    }
}
