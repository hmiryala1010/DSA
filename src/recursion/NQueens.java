package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++)
			Arrays.fill(board[i], '.');

		boolean[] leftRow = new boolean[n];
		boolean[] upperDiagonal = new boolean[2 * n - 1];
		boolean[] lowerDiagonal = new boolean[2 * n - 1];

		placeQueens(0, n, board, result, leftRow, upperDiagonal, lowerDiagonal);
		return result;
	}

	void placeQueens(int col, int n, char[][] board, List<List<String>> result, boolean[] leftRow,
			boolean[] upperDiagonal, boolean[] lowerDiagonal) {
		if (col == n) {
			List<String> ds = new ArrayList<>();
			for (char[] row : board)
				ds.add(new String(row));
			result.add(ds);
			return;
		}

		for (int row = 0; row < n; row++) {
			if (!leftRow[row] && !upperDiagonal[row + col] && !lowerDiagonal[n - 1 + col - row]) {
				board[row][col] = 'Q';
				leftRow[row] = true;
				upperDiagonal[row + col] = true;
				lowerDiagonal[n - 1 + col - row] = true;

				placeQueens(col + 1, n, board, result, leftRow, upperDiagonal, lowerDiagonal);

				board[row][col] = '.';
				leftRow[row] = false;
				upperDiagonal[row + col] = false;
				lowerDiagonal[n - 1 + col - row] = false;
			}
		}
	}
}
