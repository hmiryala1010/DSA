package graphs;

import java.util.*;

public class NumberOfIslands {
 
	static class Pair {
		int row, col;

		Pair(int r, int c) {
			this.row = r;
			this.col = c;
		}
	}

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0)
			return 0;

		int rows = grid.length;
		int cols = grid[0].length;
		boolean[][] visited = new boolean[rows][cols];
		int count = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == '1' && !visited[i][j]) {
					bfs(grid, visited, i, j);
					count++;
				}
			}
		}

		return count;
	}

	private void bfs(char[][] grid, boolean[][] visited, int startRow, int startCol) {
		Queue<Pair> queue = new LinkedList<>();
		queue.offer(new Pair(startRow, startCol));
		visited[startRow][startCol] = true;

		while (!queue.isEmpty()) {
			Pair current = queue.poll();
			int r = current.row;
			int c = current.col;
			
			for (int dr = -1; dr <= 1; dr++) {
				for (int dc = -1; dc <= 1; dc++) {
					if (dr == 0 && dc == 0)
						continue;

					int newRow = r + dr;
					int newCol = c + dc;

					if (newRow >= 0 && newCol >= 0 && newRow < grid.length && newCol < grid[0].length
							&& grid[newRow][newCol] == '1' && !visited[newRow][newCol]) {
						visited[newRow][newCol] = true;
						queue.offer(new Pair(newRow, newCol));
					}
				}
			}
		}
	}
}//tc O(m*n)
//sc O(m*n)
