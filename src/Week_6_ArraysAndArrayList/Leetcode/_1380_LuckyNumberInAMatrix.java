package Week_6_ArraysAndArrayList.Leetcode;
import java.util.*;
public class _1380_LuckyNumberInAMatrix {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        /* Approach 1: Using Extra Space for Tracking Column Indices
        Time Complexity : O(m*n)
        Space Complexity: O(m)
        Algorithm:
            1. Create an array desiredColInRow of size row to store the column index of the minimum value in each row.
            2. Iterate through each row to find the column index of the smallest element.
            3. For each stored column index, verify if the element is the maximum in its column.
            4. If both conditions are satisfied, add the element to the result list.
          */


        // List<Integer> ans = new ArrayList<>();
        // int row = matrix.length;
        // int col = matrix[0].length;
        // int[] desiredColInRow = new int[row];

        // for(int i = 0; i < row; i++){
        //     int min = matrix[i][0];
        //     int index = 0;
        //     for(int j = 0; j < col; j++){
        //         if(matrix[i][j] < min){
        //             min = matrix[i][j];
        //             index = j;
        //         }
        //     }
        //     desiredColInRow[i] = index;
        // }

        // for(int i = 0;i < desiredColInRow.length; i++){
        //     int idx = desiredColInRow[i];
        //     int minInRow = matrix[i][idx];
        //     int maxInCol = matrix[0][idx];
        //     for(int j = 0; j < row; j++){
        //         maxInCol = Math.max(maxInCol, matrix[j][idx]);
        //     }
        //     if(minInRow == maxInCol) ans.add(minInRow);
        // }

        // return ans;


        /* Approach 2: Brute Force Using a Helper Function
        Time Complexity:  O(m*n*(m+n))
        Space Complexity: O(1)
        Algorithm:
            1. Iterate through each element of the matrix.
            2. Use a helper function desired(matrix, luckyN, row, col) to:
            3. Check if the element is the maximum in its column.
            4. Check if the element is the minimum in its row.
            5. If both conditions are satisfied, add the element to the result list.
           */


        // int row = matrix.length;
        // int col = matrix[0].length;
        // List<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j < col; j++){
        //         if(desired(matrix, matrix[i][j], i, j)) ans.add(matrix[i][j]);
        //     }
        // }

        // return ans;

        // public boolean desired(int[][] matrix, int luckyN, int row, int col){
        //     // check uss column me usse bada koi hai to nhi.
        //     for(int i = 0; i < matrix.length; i++){
        //         if(matrix[i][col] > luckyN) return false;
        //     }

        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(matrix[row][j] < luckyN) return false;
        //     }

        //     return true;
        // }



        /* Approach 3: Precomputing Row Minima and Column Maxima
        Time Complexity:  O(m*n)
        Space Complexity: O(m+n)
        Algorithm:
            1. Create an array minInRow to store the smallest value in each row.
            2. Create an array maxInCol to store the largest value in each column.
            3. Iterate through the matrix to find the row minima:
            4. For each row, find the smallest value and store it in minInRow.
            5. Iterate through the matrix to find the column maxima:
            6. For each column, find the largest value and store it in maxInCol.
            7. Iterate through the matrix again:
            8. If an element is equal to its row minimum and column maximum, add it to the result list.
        */


        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int[] minInRow = new int[row];
        int[] maxInCol = new int[col];

        for(int i = 0; i < row ; i++){
            int min = matrix[i][0];
            for(int j = 0; j < col; j++){
                min = Math.min(matrix[i][j], min);
            }
            minInRow[i] = min;
        }

        for(int j = 0; j < col ; j++){
            int max = matrix[0][j];
            for(int i = 0; i < row; i++){
                max = Math.max(matrix[i][j], max);
            }
            maxInCol[j] = max;
        }

        for(int i = 0; i < row ; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == minInRow[i] && matrix[i][j] == maxInCol[j]) ans.add(matrix[i][j]);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }
}
