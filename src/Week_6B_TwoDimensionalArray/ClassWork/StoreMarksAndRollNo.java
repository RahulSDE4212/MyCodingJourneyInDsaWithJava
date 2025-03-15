package Week_6B_TwoDimensionalArray.ClassWork;
import java.util.*;
public class StoreMarksAndRollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        System.out.print("Enter the marks obtained by  students");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("RollNo   Marks");
        System.out.println();
        for(int[] ele: arr){
            for(int x : ele){
                System.out.print(x + "          ");
            }
            System.out.println();
        }

    }
}
