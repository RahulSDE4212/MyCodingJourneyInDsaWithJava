package Week_28_Graph.Leetcode;
import java.util.*;

// https://leetcode.com/problems/rotting-oranges/description/

class RottenOranges {
    static class Pair {
        int row;
        int col;
        int level;

        Pair(int row, int col, int level){
            this.row = row;
            this.col = col;
            this.level = level;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2) q.add(new Pair(i, j, 0));
            }
        }

        int minutes = 0;
        while(!q.isEmpty()){
            Pair curr = q.poll();

            int row = curr.row;
            int col = curr.col;
            int level = curr.level;

            minutes = level;
            if(col + 1 < n && grid[row][col + 1] == 1){ 
                q.add(new Pair(row, col + 1, level + 1));
                grid[row][col + 1] = 2;
            }
            if(row + 1 < m && grid[row + 1][col] == 1){ 
                q.add(new Pair(row + 1, col, level + 1));
                grid[row + 1][col] = 2;
            }
            if(col - 1 >= 0 && grid[row][col - 1] == 1){ 
                q.add(new Pair(row, col - 1, level + 1));
                grid[row][col - 1] = 2;
            }
            if(row - 1 >= 0 && grid[row - 1][col] == 1){ 
                q.add(new Pair(row - 1, col, level + 1));
                grid[row - 1][col] = 2;
            }
        }

        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1) return -1;
            }
        }

        return minutes;
    }
}