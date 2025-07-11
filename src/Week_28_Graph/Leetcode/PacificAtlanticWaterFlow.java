package Week_28_Graph.Leetcode;
import java.util.*;

// https://leetcode.com/problems/pacific-atlantic-water-flow/description/

class PacificAtlanticWaterFlow {
    static class Pair {
        int row;
        int col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] visitedPacific = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            q.add(new Pair(i, 0));
        }
        for(int j = 0; j < n; j++){
            q.add(new Pair(0, j));
        }

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;

            visitedPacific[row][col] = true;

            if(col + 1 < n && heights[row][col + 1] >= heights[row][col] && !visitedPacific[row][col + 1]) q.add(new Pair(row, col + 1));
            if(row + 1 < m && heights[row + 1][col] >= heights[row][col] && !visitedPacific[row + 1][col]) q.add(new Pair(row + 1, col));
            if(col - 1 >= 0 && heights[row][col - 1] >= heights[row][col] && !visitedPacific[row][col - 1]) q.add(new Pair(row, col - 1));
            if(row - 1 >= 0 && heights[row - 1][col] >= heights[row][col] && !visitedPacific[row - 1][col]) q.add(new Pair(row - 1, col));
        }

        boolean[][] visitedAtlantic = new boolean[m][n];
        for(int i = 0; i < m; i++){
            q.add(new Pair(i, n - 1));
        }
        for(int j = 0; j < n; j++){
            q.add(new Pair(m - 1, j));
        }
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;

            visitedAtlantic[row][col] = true;

            if(col + 1 < n && heights[row][col + 1] >= heights[row][col] && !visitedAtlantic[row][col + 1]) q.add(new Pair(row, col + 1));
            if(row + 1 < m && heights[row + 1][col] >= heights[row][col] && !visitedAtlantic[row + 1][col]) q.add(new Pair(row + 1, col));
            if(col - 1 >= 0 && heights[row][col - 1] >= heights[row][col] && !visitedAtlantic[row][col - 1]) q.add(new Pair(row, col - 1));
            if(row - 1 >= 0 && heights[row - 1][col] >= heights[row][col] && !visitedAtlantic[row - 1][col]) q.add(new Pair(row - 1, col));
        }

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(visitedPacific[i][j] && visitedAtlantic[i][j]){
                    List<Integer> arr = new ArrayList<>();
                    arr.add(i);
                    arr.add(j);
                    result.add(arr);
                }
            }
        }

        return result;
    }
}