package Week_28_Graph.Leetcode;
import java.util.*;

// https://leetcode.com/problems/coloring-a-border/description/

class ColoringABorder {
    static int[] dx;
    static int[] dy;
    boolean[][] visited;
    public boolean isColor(int[][] grid, int row, int col, int originalColor){
        int m = grid.length;
        int n = grid[0].length;

        if(row < 0 || row >= m || col < 0 || col >= n) return false;

        if(row == 0 || row == m - 1 || col == 0 || col == n - 1) return true;
        

        if(!visited[row][col + 1] && grid[row][col + 1] != originalColor) return true; // right neighbour
        if(!visited[row + 1][col] && grid[row + 1][col] != originalColor) return true; // down neighbour
        if(!visited[row][col - 1] && grid[row][col - 1] != originalColor) return true; // left neighbour
        if(!visited[row - 1][col] && grid[row - 1][col] != originalColor) return true; // up neighbour

        return false;
    }
    public boolean isSafe(int[][] grid, int row, int col,int color, int originalColor){
        if(col < 0 || col >= grid[0].length || row < 0 || row >= grid.length || grid[row][col] == color || grid[row][col] != originalColor)
            return false;
        
        return true;
    }
    public void dfs(int[][] grid, int row, int col, int color, int originalColor){
        if(col == grid[0].length || col < 0 || row == grid.length || row < 0) return;
        if(visited[row][col]) return;

        if(isColor(grid, row, col, originalColor)){
            grid[row][col] = color;
        }
        visited[row][col] = true;

        for(int i = 0; i < 4; i++){
            if(isSafe(grid, row + dx[i], col + dy[i], color, originalColor))
                dfs(grid, row + dx[i], col + dy[i], color, originalColor);
        }
    }
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int m = grid.length;
        int n = grid[0].length;

        visited = new boolean[m][n];
        for(boolean[] array : visited){
            Arrays.fill(array, false);
        }

        dx = new int[]{0, +1, 0, -1};
        dy = new int[]{+1, 0, -1, 0};

        int originalColor = grid[row][col];
        dfs(grid, row, col, color, originalColor);

        return grid;
    }
}