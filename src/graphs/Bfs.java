package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Bfs {

	static void bfs(int starting_node, ArrayList<ArrayList<Integer>> adjlist) {
		Queue<Integer> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<>();

		queue.offer(starting_node);
		set.add(starting_node);

		while (!queue.isEmpty()) {
			int current_node = queue.poll();
			System.out.println(current_node);
			for (int neighbour : adjlist.get(current_node)) {
				if (!set.contains(neighbour)) {
					queue.offer(neighbour);
					set.add(neighbour);
				}
			}

		}

	}

}
//tc O(V+E)
//sc O(V+E)