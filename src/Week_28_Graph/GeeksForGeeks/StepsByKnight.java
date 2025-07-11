package Week_28_Graph.GeeksForGeeks;
import java.util.*;

// https://www.geeksforgeeks.org/problems/steps-by-knight5927/1

class StepsByKnight {
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
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // Code here
        int ir = knightPos[0] - 1, ic = knightPos[1] - 1;

        int fR = targetPos[0] - 1, fC = targetPos[1] - 1;

        boolean[][] visited = new boolean[n][n];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ir, ic, 0));
        visited[ir][ic] = true;
        
        int ans = 0;
        int[] dx = {-1, +1, +2, +2, +1, -1, -2, -2};
        int[] dy = {+2, +2, +1, -1, -2, -2, -1, +1};
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;
            int l = curr.level;

            if(r == fR && c == fC){
                ans = l;
                break;
            }
            for(int i = 0; i < 8; i++){
                int nR = r + dx[i];
                int nC = c + dy[i];
                if(nR >= 0 && nR < n && nC >= 0 && nC < n && !visited[nR][nC]){
                    visited[nR][nC] = true;
                    q.add(new Pair(nR, nC, l + 1));
                }
            }
        }
        
        return ans;
    }
}