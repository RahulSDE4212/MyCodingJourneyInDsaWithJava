package Week_6B_TwoDimensionalArray.ClassWork;

public class AdditionOfTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{1,9,2},{3,7,4},{8,5,6}};
        int[][] b = {{9,3,7},{8,6,5},{2,4,1}};
        int r1 = a.length;
        int c1 = a[0].length;
        int r2 = b.length;
        int c2 = b[0].length;

        int[][] res = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for (int j = 0; j < c1; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int[] ele: res){
            for(int x: ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }


    }
}
