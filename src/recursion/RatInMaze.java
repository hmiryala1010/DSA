package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class RatInMaze {

	public ArrayList<String> ratInMaze(int[][] maze) {
		ArrayList<String> res = new ArrayList<>();
		int n = maze.length;

		if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0)
			return res;

		boolean[][] visited = new boolean[n][n];
		solve(0, 0, maze, n, "", visited, res);
		Collections.sort(res);
		return res;
	}

	void solve(int i, int j, int[][] maze, int n, String path, boolean[][] visited, ArrayList<String> res) {
		if (i == n - 1 && j == n - 1) {
			res.add(path);
			return;
		}

		visited[i][j] = true;

		if (isSafe(i + 1, j, maze, n, visited))
			solve(i + 1, j, maze, n, path + "D", visited, res);

		if (isSafe(i, j - 1, maze, n, visited))
			solve(i, j - 1, maze, n, path + "L", visited, res);

		if (isSafe(i, j + 1, maze, n, visited))
			solve(i, j + 1, maze, n, path + "R", visited, res);

		if (isSafe(i - 1, j, maze, n, visited))
			solve(i - 1, j, maze, n, path + "U", visited, res);

		visited[i][j] = false;
	}

	boolean isSafe(int i, int j, int[][] maze, int n, boolean[][] visited) {
		return i >= 0 && j >= 0 && i < n && j < n && maze[i][j] == 1 && !visited[i][j];
	}
}
