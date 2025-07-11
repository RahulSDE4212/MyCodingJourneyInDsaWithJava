package Week_28_Graph.Leetcode;
import java.util.*;

public class WallsAndGates {
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
    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE;
        int[][] grid = {
                {INF,  -1,  0,  INF},
                {INF, INF, INF, - 1},
                {INF, -1, INF, - 1},
                {0, -1,INF, INF}
        };

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            int l = curr.level;

            if(c + 1 < n && !visited[r][c + 1] && grid[r][c + 1] == INF){
                grid[r][c + 1] = l + 1;
                visited[r][c + 1] = true;
                q.add(new Pair(r, c + 1, l + 1));
            }
            if(r + 1 < m && !visited[r + 1][c] && grid[r + 1][c] == INF){
                grid[r + 1][c] = l + 1;
                visited[r + 1][c] = true;
                q.add(new Pair(r + 1, c, l + 1));
            }
            if(c - 1 >= 0 && !visited[r][c - 1] && grid[r][c - 1] == INF){
                grid[r][c - 1] = l + 1;
                visited[r][c - 1] = true;
                q.add(new Pair(r, c - 1, l + 1));
            }
            if(r - 1 >= 0 && !visited[r - 1][c] && grid[r - 1][c] == INF){
                grid[r - 1][c] = l + 1;
                visited[r - 1][c] = true;
                q.add(new Pair(r - 1, c, l + 1));
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
