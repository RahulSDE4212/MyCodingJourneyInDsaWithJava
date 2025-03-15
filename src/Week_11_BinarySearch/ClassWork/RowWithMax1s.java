package Week_11_BinarySearch.ClassWork;
import java.util.*;
public class RowWithMax1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size and column size: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        /* ****************Brute-Force Approach ************************* */
//        int i = 0;
//        int noOf1InRow = 0;
//        int desiredIdx = -1;
//        while(i<mat.length){
//            int j=0;
//            int noof1=0;
//            while(j<mat[0].length){
//                if(mat[i][j]==1) noof1++;
//                j++;
//            }
//            if(noof1>noOf1InRow){
//                noOf1InRow = noof1;
//                desiredIdx = i;
//            }
//            i++;
//        }
//        System.out.println("The row with maximum no of 1 is : " + desiredIdx);

        /* ****************Optimized Approach *******************/
        int i = 0;
        int noOf1InRow = 0;
        int desiredIdx = -1;
        while(i<mat.length){
            int lo = 0 , hi = m-1;
            while(lo<=hi){
                int mid = lo + (hi - lo)/2;
                if(mat[i][mid]==1) hi = mid - 1;
                else lo = mid + 1;
            }
            int noOfOne = m - hi - 1;
            if(noOfOne>noOf1InRow){
                noOf1InRow = noOfOne;
                desiredIdx = i;
            }
            if(i<mat.length-1){
                if(mat[i+1][hi]==0) i++;
            }
            i++;
        }
        if(noOf1InRow==0) desiredIdx = -1;
        System.out.println("The desired idx " + desiredIdx);
    }
}
