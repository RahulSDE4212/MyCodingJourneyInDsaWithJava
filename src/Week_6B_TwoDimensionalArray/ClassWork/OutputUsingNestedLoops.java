package Week_6B_TwoDimensionalArray.ClassWork;
import java.util.Scanner;
public class OutputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //arr[0][0] = 9;

        //input of 2D array
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //
        // output of 2D array
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
