package TwoDimensionalArray.ClassWork;
import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr={{12,55,34,99},{21,46,37,88}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.println(max);
    }
}
