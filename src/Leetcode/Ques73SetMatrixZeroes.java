package Leetcode;

public class Ques73SetMatrixZeroes {
    public static void print(int[][] arr){
        for(int[] ele: arr){
            for(int x: ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void setZeroes(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        /* ******Method 1************** */
//        int[][] brr = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                brr[i][j]=arr[i][j];
//            }
//        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(brr[i][j]==0){
//                    //set the ith row and jth col to 0 in arr
//                    for(int b=0;b<n;b++){
//                        arr[i][b]=0;
//                    }
//                    for(int a=0;a<m;a++){
//                        arr[a][j]=0;
//                    }
//                }
//            }
//        }

      /* ********Method 2 ************** */
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//
//        for(int i = 0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(arr[i][j]==0){
//                    row[i]= true;
//                    col[j] = true;
//                }
//            }
//        }
//        // setting ith row of arr to 0 if ith index of row has true
//        for(int i=0;i<m;i++){
//            if(row[i]){
//                for(int j=0;j<n;j++){
//                    arr[i][j]=0;
//                }
//            }
//        }
//        // setting jth col of arr to 0 if jth index of col has true
//        for(int j=0;j<n;j++){
//            if(col[j]){
//                for(int i=0;i<m;i++){
//                    arr[i][j]=0;
//                }
//            }
//        }

       /* *********** Method 3 *********** */

        boolean row0 = false, col0 = false;
        for(int i=0;i<m;i++){
            if(arr[i][0] == 0) col0 = true;
        }
        for(int j=0;j<n;j++){
            if(arr[0][j] == 0) row0 = true;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        // setting ith row to 0 which has 0 at the 0th index
        for(int i=1;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }
        // setting jth col to 0 which has 0 at the 0th index
        for(int j=1;j<n;j++){
            if(arr[0][j]==0){
                for(int i=0;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
        if(row0){
            for(int j=0;j<n;j++){
                arr[0][j] = 0;
            }
        }
        if(col0){
            for(int i=0;i<m;i++){
                arr[i][0] = 0;
            }
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        print(arr);
        setZeroes(arr);
        print(arr);

    }
}
