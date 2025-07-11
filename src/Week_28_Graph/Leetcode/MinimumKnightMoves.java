package Week_28_Graph.Leetcode;

import java.util.*;
import java.util.LinkedList;

public class MinimumKnightMoves {
    static class Pair {
        int row;
        int col;
        int level;

        Pair(int row, int col, int level) {
            this.row = row;
            this.col = col;
            this.level = level;
        }
    }
    public static void main(String[] args) {
        int[][] chess = new int[6][6];

        int m = chess.length;
        int n = chess[0].length;

        int ir = 0, ic = 0;

        int fR = 0, fC = 0;

        boolean[][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ir, ic, 0));
        visited[ir][ic] = true;

        int[] dx = {-1, +1, +2, +2, +1, -1, -2, -2};
        int[] dy = {+2, +2, +1, -1, -2, -2, -1, +1};
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            int l = curr.level;

            if(r == fR && c == fC){
                System.out.println(l);
                break;
            }
            for(int i = 0; i < 8; i++){
                int nR = r + dx[i];
                int nC = c + dy[i];
                if(nR >= 0 && nR < m && nC >= 0 && nC < n && !visited[nR][nC]){
                    visited[nR][nC] = true;
                    q.add(new Pair(nR, nC, l + 1));
                }
            }
        }

    }
}
