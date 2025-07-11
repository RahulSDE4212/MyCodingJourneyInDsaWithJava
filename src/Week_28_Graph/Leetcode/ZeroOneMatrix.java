package Week_28_Graph.Leetcode;
import java.util.*;

// https://leetcode.com/problems/01-matrix/description/

class ZeroOneMatrix {
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
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
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

            if(c + 1 < n && !visited[r][c + 1] && mat[r][c + 1] != 0){
                mat[r][c + 1] = l + 1;
                q.add(new Pair(r, c + 1, l + 1));
                visited[r][c + 1]= true;
            }
            if(r + 1 < m && !visited[r + 1][c] && mat[r + 1][c] != 0){
                mat[r + 1][c] = l + 1;
                q.add(new Pair(r + 1, c, l + 1));
                visited[r + 1][c]= true;
            }
            if(c - 1 >= 0 && !visited[r][c - 1] && mat[r][c - 1] != 0){
                mat[r][c - 1] = l + 1;
                q.add(new Pair(r, c - 1, l + 1));
                visited[r][c - 1]= true;
            }
            if(r - 1 >= 0 && !visited[r - 1][c] && mat[r - 1][c] != 0){
                mat[r - 1][c] = l + 1;
                q.add(new Pair(r - 1, c, l + 1));
                visited[r - 1][c]= true;
            }
        }

        return mat;
    }
}