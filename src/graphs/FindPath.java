package graphs;

import java.util.LinkedList;
import java.util.Queue;

 
public class FindPath {
	static class Pair {
		int row, col,dist;

		Pair(int r, int c,int d) {
			this.row = r;
			this.col = c;
			this.dist=d;
		}
	}
	public static final int[][] directions= {{0,-1},{-1,0},{0,1},{1,0}};
	public int findPathFrom1To2(char[][] game,int[] start,int[] end) {
		int row=game.length;
		int col=game[0].length;
		int[][] visited=new int[row][col];
		Queue<Pair> queue=new LinkedList<>();
		int dist=0;
		
		queue.offer(new Pair(start[0],start[1],dist));
		visited[start[0]][start[1]]=1;
		
		while(!queue.isEmpty()) {
			Pair current= queue.poll();
			int current_row=current.row;
			int current_col=current.col;
			int current_dist=current.dist;
			
			if(current_row==end[0] && current_col==end[1])
				return current_dist+1;
			
			for(int[] neighbour:directions) {
				int new_row=current_row+neighbour[0];
				int new_col=current_col+neighbour[1];
				
				if((new_row>=0 && new_row<row && new_col>=0 && new_col<col 
						&& game[new_row][new_col]!='X' && visited[new_row][new_col]==0)) {
					 visited[new_row][new_col]=1;
					 queue.offer(new Pair(new_row,new_col,current_dist+1));
				}
				
			}
		}
		
		return -1;
		
	}
}
