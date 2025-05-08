package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycle {
	
	static class Pair{
		int node;
		int parent;
		Pair(int n,int p){
			this.node=n;
			this.parent=p;
		}
	}
	
	public boolean detectCycle(int src,ArrayList<ArrayList<Integer>> adj, int[] visited ) {
		visited[src]=1;
		Queue<Pair> queue=new LinkedList<>();
		queue.offer(new Pair(src,-1));
		while(!queue.isEmpty()) {
			Pair current=queue.poll();
			int node=current.node;
			int parent=current.parent;
			
			for(int adjacentnode:adj.get(node)) {
				if(visited[adjacentnode]==0) {
					visited[adjacentnode]=1;
					queue.offer(new Pair(adjacentnode,node));
				}
				else if(parent!=adjacentnode)
					return true;	
			}	
		}
		return false;	
	}
	
	public boolean checkAllComponents(int V,ArrayList<ArrayList<Integer>> adj) {
		int[] visited=new int[V];
		for(int i=0;i<V;i++) {
			if(visited[i]==0)
				if(detectCycle(i,adj,visited))
					return true;
		}
		return false;
		
	}
}
