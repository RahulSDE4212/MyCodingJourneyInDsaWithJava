package Week_6_ArraysAndArrayList.ClassWork;
import java.util.*;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,23,13,45,67};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // traversing elements of array
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
