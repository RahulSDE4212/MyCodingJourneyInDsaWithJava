package Week_6B_TwoDimensionalArray.ClassWork;

public class SumOfAllTheElements {
    public static void main(String[] args) {
        int[][] arr={{12,55,34,99},{21,46,37,88}};
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
