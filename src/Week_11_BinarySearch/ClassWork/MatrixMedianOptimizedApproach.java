package Week_11_BinarySearch.ClassWork;

public class MatrixMedianOptimizedApproach {
    public static int magic(int[][] mat, int num){
        int smallerEqual = 0;
        for(int i=0;i<mat.length;i++){
            int lo = 0, hi = mat[0].length-1;
            // 1 2 3 4 5 5 7    9    9 10 10 11 12 14 16
            while(lo<=hi){
                int mid = lo + (hi-lo)/2;
                if(mat[i][mid]<=num) lo = mid +1;
                else hi = mid - 1;
            }
            int aux = lo;
            smallerEqual += aux;
            System.out.println("after " + i + " row is: " + smallerEqual);
        }
        return smallerEqual;
    }
    public static int largest(int[][] mat){
        int num = Integer.MIN_VALUE;
        int n = mat[0].length-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][n]>num) num = mat[i][n];
        }
        return num;
    }
    public static int smallest(int[][] mat){
        int num = Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++){
            if(mat[i][0]<num) num = mat[i][0];
        }
        return num;
    }
    public static int median(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int lo = smallest(mat); // generate smallest number in the grid.
        int hi = largest(mat); // generate largest number in the grid.
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int smallerEqual = magic(mat,mid);
            if(smallerEqual <= (m*n)/2) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,5,7,9,11},{2,3,4,5,10},{9,10,12,14,16}};
        // 1 2 3 4 5 5 7    9    9 10 10 11 12 14 16
        // median is : 8
        int ans = median(mat); // calling median function.
        System.out.println("The median is: " + ans);
    }
}
