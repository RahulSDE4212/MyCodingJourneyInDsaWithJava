package Leetcode;

public class Ques861ScoreAfterFlippingMatrix {
    public static void print(int[][] arr){
        for(int[] ele: arr){
            for(int x: ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int matrixScore(int[][] arr) {
        int m = arr.length,n = arr[0].length;
        // put 1 at the 0th index of every row
        for(int i=0;i<m;i++){
            if(arr[i][0] == 0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        // flip those columns in which no of zeroes > no of ones
        for(int j=1;j<n;j++){
            int noOfOnes = 0, noOfZeroes = 0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) noOfZeroes++;
                else noOfOnes++;
            }
            if(noOfZeroes > noOfOnes){
                // flip the columns
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }

        // calculating the score of the matrix
        // by converting every row to the decimal no and adding it
        int score = 0;
        int x = 1;
        for(int j=n-1;j>=1;j--){
            for(int i=0;i<m;i++){
                score = arr[i][j] * x;
            }
            x *= 2;
        }
        return score;
    }
    public static void main(String[] args) {
         int[][] arr= {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
         print(arr);
         int res = matrixScore(arr);
         print(arr);
        System.out.println(res);
    }
}
