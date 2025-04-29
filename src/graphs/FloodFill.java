package graphs;

public class FloodFill {
    private static final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // up, down, left, right

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor) {
            dfs(image, sr, sc, oldColor, newColor);
        }
        return image;
    }

    private void dfs(int[][] image, int r, int c, int oldColor, int newColor) {
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != oldColor) {
            return;
        }

        image[r][c] = newColor;

        for (int[] dir : directions) {
            int newRow = r + dir[0];
            int newCol = c + dir[1];
            dfs(image, newRow, newCol, oldColor, newColor);
        }
    }
}
 
