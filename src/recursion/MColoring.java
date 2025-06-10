package recursion;

public class MColoring {

	boolean graphColoring(int v, int[][] edges, int m) {
		// code here
		int[] color = new int[v];
		return f(0, v, edges, m, color);
	}

	boolean f(int node, int v, int[][] edges, int m, int[] color) {
		if (node == v)
			return true;
		for (int i = 1; i <= m; i++) {
			if (isSafe(node, edges, i, color)) {
				color[node] = i;
				if (f(node + 1, v, edges, m, color))
					return true;
				color[node] = 0;
			}
		}
		return false;
	}

	boolean isSafe(int node, int[][] edges, int m, int[] color) {
		for (int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			if (u == node && color[v] == m)
				return false;
			if (v == node && color[u] == m)
				return false;
		}
		return true;

	}
}