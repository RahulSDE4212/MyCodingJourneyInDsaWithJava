package Week_6B_TwoDimensionalArray.ClassWork;

public class RotateTheMatrixBy90Degree {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // transpose of a matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <  i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Rotating the matrix by 90 degree
        for (int i = 0; i < arr.length; i++) {
            int high = arr[i].length-1;
            int low = 0;
            while(low<=high){
                int temp = arr[i][high];
                arr[i][high] = arr[i][low];
                arr[i][low] = temp;
                low++;
                high--;
            }
        }

        // printing the rotated matrix
        for(int[] ele: arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
