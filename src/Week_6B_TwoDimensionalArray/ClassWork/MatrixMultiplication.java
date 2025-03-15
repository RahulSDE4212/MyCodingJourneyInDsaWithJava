package Week_6B_TwoDimensionalArray.ClassWork;

public class MatrixMultiplication {
    public static void print(int[][] arr){
        for(int[] ele: arr){
            for(int x: ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3,4},{5,6,7,8}};
        int[][] arr2 = {{1,2},{3,4},{5,6},{7,8}};
        print(arr1);
        print(arr2);
        int r1 = arr1.length,c1 = arr1[0].length;
        int r2 = arr2.length,c2 = arr2[0].length;
        if(c1 != r2){
            System.out.println("Multiplication not possible: ");
            return;
        }
            int[][] res = new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    int sum = 0;
                    for(int k=0;k<c1;k++){
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    res[i][j] = sum;
                }
            }
        print(res);
    }
}
