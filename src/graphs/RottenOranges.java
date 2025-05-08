package graphs;

import java.util.LinkedList;
import java.util.Queue;

class RottenOranges {
    static class Pair{
        int row;
        int col;
        int time;
        Pair(int r,int c,int t){
            this.row=r;
            this.col=c;
            this.time=t;
        }
    }

    public int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};

    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Queue<Pair> queue=new LinkedList<>();
        int[][] visited =new int[row][col];
        int fresh_count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==2){
                    visited[i][j]=2;
                    queue.offer(new Pair(i,j,0));

                }
                else if(grid[i][j]==1)
                    fresh_count++;
            }
                 
        }
        int time_max=0;
        int rotted_count=0;
        while(!queue.isEmpty()){
            Pair current=queue.poll();
            int r=current.row;
            int c=current.col;
            int t=current.time;
            time_max=Math.max(t,time_max);
            for(int[] neighbour:directions){
                int new_row=r+neighbour[0];
                int new_col=c+neighbour[1];
                 
    
            
            if(new_row>=0 && new_row<row && new_col>=0 && new_col<col &&
            visited[new_row][new_col]==0 && grid[new_row][new_col]==1){
                queue.offer(new Pair(new_row,new_col,t+1));
                visited[new_row][new_col]=2;
                rotted_count++;
            }            

        }
        }
        if(fresh_count!=rotted_count) return -1;
           

        return time_max;
        

    }
}
//sc O(n+m)
//tc O(n+m)