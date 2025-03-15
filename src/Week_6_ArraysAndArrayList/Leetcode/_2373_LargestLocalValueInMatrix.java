package Week_6_ArraysAndArrayList.Leetcode;

public class _2373_LargestLocalValueInMatrix {
    public static int maximum(int[][] num, int starti, int startj){
        int max = Integer.MIN_VALUE;
        for(int i=starti;i<=starti+2;i++){
            for(int j=startj;j<=startj+2;j++){
                max = Math.max(max,num[i][j]);
            }
        }
        return max;
    }
    public static int[][] largestLocal(int[][] grid) {
        /* ***************** Approach-1 : Brute Force *****************************
        * Time complexity  : O(n)
        * Space complexity : O(1)
        * Algorithm :
        *   Step 1 : traverse the matrix (n,n) num to find the largest number in the sub-matrix of length i+1, j+1
        *            where i and j is the coordinate of the given matrix of size (n-2,n-2).
        *   step 2 : store the largest num found in step 1 in matrix of size (n-2,n-2) one by one.
        *   step 3 : return the matrix of step 2.
        * */
//        int[][] ans = new int[grid.length-2][grid.length-2];
//        int row = ans.length;
//        int col = ans[0].length;
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                ans[i][j] = maximum(grid,i,j);
//            }
//        }
//        return ans;

        /* ***************** Approach-2 : sliding window **************************
        * Time complexity  : O(n2)
        * Space complexity : O(n2)
        * */
        int n = grid.length;
        int[][] auxiliary = new int[n][n-2];
        int[][] finalAns = new int[n-2][n-2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n-2;j++){
                auxiliary[i][j] = Math.max(grid[i][j],Math.max(grid[i][j+1],grid[i][j+2]));
            }
        }
        for(int i=0;i<n-2;i++){
            for(int j= 0;j<n-2;j++){
                finalAns[i][j] = Math.max(auxiliary[i][j],Math.max(auxiliary[i+1][j],auxiliary[i+2][j]));
            }
        }
        return finalAns;


    }

    public static void main(String[] args) {
        int[][] nums = {
                {9,9,8,1},
                {5,6,2,6},
                {8,2,6,4},
                {6,2,2,2}
        };
        int[][] ans = largestLocal(nums);
        for(int[] arr: ans){
            for(int num: arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
