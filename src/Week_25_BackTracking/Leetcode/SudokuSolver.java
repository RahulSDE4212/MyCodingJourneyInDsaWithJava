// https://leetcode.com/problems/sudoku-solver/description/



package Week_25_BackTracking.Leetcode;

class SudokuSolver {
    public boolean isSafe(char[][] board, int r, int c, int num){
        // checking row;
        for(int j = 0; j < 9; j++){
            int n = board[r][j] - '0';
            if(n == num) return false;
        }

        // checking col
        for(int i = 0; i < 9; i++){
            int n = board[i][c] - '0';
            if(n == num) return false;
        }

        // checking big cell
        int startRow = (r / 3) * 3;
        int startCol = (c / 3) * 3;
        for(int i = startRow; i < startRow + 3; i++){
            for(int j = startCol; j < startCol + 3; j++){
                int n = board[i][j] - '0';
                if(n == num) return false;
            }
        }

        return true;
    }
    public boolean f(char[][] board, int r, int c){
        if(r == 9) return true;
        if(c == 9) return f(board, r + 1, 0);
        if(board[r][c] != '.') return f(board, r, c + 1);

        for(int i = 1; i <= 9; i++){
            if(isSafe(board, r, c, i)){
                board[r][c] = (char)('0' + i);
                boolean retVal = f(board, r, c + 1);
                if(retVal) return true;
                board[r][c] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        f(board, 0, 0);
    }
}