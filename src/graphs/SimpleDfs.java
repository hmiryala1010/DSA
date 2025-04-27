package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SimpleDfs {

	static void dfs(int starting_node, ArrayList<ArrayList<Integer>> adjlist) {
		Set<Integer> set = new HashSet<>();
		dfsTraversal(starting_node, adjlist, set);

	}

	static void dfsTraversal(int starting_node, ArrayList<ArrayList<Integer>> adjlist, Set<Integer> set) {
		// TODO Auto-generated method stub
		set.add(starting_node);
		System.out.println(starting_node);
		for (int neighbour : adjlist.get(starting_node)) {
			if (!set.contains(neighbour))
				dfsTraversal(neighbour, adjlist, set);
		}

	}

}
//tc=O(V+E)
//sc=O(V+E)