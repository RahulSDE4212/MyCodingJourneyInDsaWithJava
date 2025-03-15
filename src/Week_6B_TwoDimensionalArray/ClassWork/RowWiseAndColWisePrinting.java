package Week_6B_TwoDimensionalArray.ClassWork;

public class RowWiseAndColWisePrinting {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4},{5,6}};
        int r1 = a.length,c1 = a[0].length;


        // printing row-wise
//        for (int i = 0; i < a.length; i++) { // rows
//            for (int j = 0; j < a[0].length; j++) { // cols
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }


        // column wise printing
//        for(int j=0;j<a[0].length;j++){ // cols
//            for (int i = 0; i < a.length; i++) { // rows
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        // storing transpose in a new matrix
        int[][] transpose = new int[c1][r1];
        for(int j=0;j<a[0].length;j++){
            for (int i = 0; i < a.length; i++) {
                transpose[j][i] = a[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
