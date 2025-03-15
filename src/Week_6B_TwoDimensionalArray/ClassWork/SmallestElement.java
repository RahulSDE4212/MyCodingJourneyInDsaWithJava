package Week_6B_TwoDimensionalArray.ClassWork;
import java.util.*;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{12,55,34,99},{21,46,37,88}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                min = Math.min(min,arr[i][j]);
            }
        }
        System.out.println(min);
    }
}
