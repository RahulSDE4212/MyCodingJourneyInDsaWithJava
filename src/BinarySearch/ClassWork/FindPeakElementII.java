package BinarySearch;

public class FindPeakElementII {
    public static int maximumElementInColumnMid(int[][] mat, int mid){
        int maxRow = 0;
        int max = mat[0][mid];
        int i = 0;
        while(i<mat.length){
            if(mat[i][mid]>max){
                max = mat[i][mid];
                maxRow = i;
            }
            i++;
        }
        return maxRow;
    }
    public static int[] findPeakGrid(int[][] mat) {
        int[] ans = new int[2];
        int m = mat.length, n = mat[0].length;
        int lo = 0, hi = n -1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            int row = maximumElementInColumnMid(mat,mid);
            System.out.println(row);
            int left = mid-1>0? mat[row][mid-1]:-1;
            int right = mid+1<n? mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                ans[0] = row;
                ans[1] = mid;
                break;
            }
            else if(mat[row][mid]<left) hi = mid - 1;
            else lo = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
        int[] ans = findPeakGrid(mat);
        System.out.print(ans[0] + " ");
        System.out.print(ans[1] + " ");
    }
}
