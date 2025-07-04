package Week_25_BackTracking.Leetcode;
import java.util.*;
class NQueens {
    public boolean canWePlaceQueen(char[][] grid, int row, int col){
        // check upwards
        for(int i = row - 1; i >= 0; i--){
            if(grid[i][col] == 'Q') return false;
        }

        // check right Diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < grid.length; i--, j++){
            if(grid[i][j] == 'Q') return false;
        }

        // check left Diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(grid[i][j] == 'Q') return false;
        }

        return true;
    }
    static List<List<String>> finalAnswer;
    public  void f(char[][] grid, int row){
        if(row == grid.length){
            List<String> ans = new ArrayList<>();
            for(int i = 0; i < grid.length; i++){
                String str = "";
                for(int j = 0; j < grid.length; j++){
                    str += grid[i][j];
                }
                ans.add(str);
            }
            finalAnswer.add(ans);
            return;
        }
        for(int col = 0; col < grid.length; col++){
            if(canWePlaceQueen(grid, row, col)){
                grid[row][col] = 'Q';
                f(grid, row + 1);
                grid[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        finalAnswer = new ArrayList<>();

        char[][] grid = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = '.';
            }
        }

        f(grid, 0);

        return finalAnswer;
    }
}