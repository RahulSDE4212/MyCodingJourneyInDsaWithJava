package Week_28_Graph.Leetcode;
import java.util.*;

// https://leetcode.com/problems/surrounded-regions/description/

class SurroundedRegions {
    static class Pair {
        int row;
        int col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public void bfs(char[][] board, int row, int col){
        int m = board.length;
        int n = board[0].length;

        Queue<Pair> q = new LinkedList<>();
        board[row][col] = 'y';
        q.add(new Pair(row, col));

        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int r = curr.row;
            int c = curr.col;

            if(c + 1 < n && board[r][c + 1] == 'O'){
                board[r][c + 1] = 'y';
                q.add(new Pair(r, c + 1));
            }
            if(r + 1 < m && board[r + 1][c] == 'O'){
                board[r + 1][c] = 'y';
                q.add(new Pair(r + 1, c));
            }
            if(c - 1 >= 0 && board[r][c - 1] == 'O'){
                board[r][c - 1] = 'y';
                q.add(new Pair(r, c - 1));
            }
            if(r - 1 >= 0 && board[r - 1][c] == 'O'){
                board[r - 1][c] = 'y';
                q.add(new Pair(r - 1, c));
            }
        }
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++){
            if(board[i][0] == 'O') bfs(board, i, 0);
            if(board[i][n - 1] == 'O') bfs(board, i, n - 1);
        }

        for(int j = 0; j < n; j++){
            if(board[0][j] == 'O') bfs(board, 0, j);
            if(board[m - 1][j] == 'O') bfs(board, m - 1, j);
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'y') board[i][j] = 'O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }
}