package ArraysAndArrayList.ClassWork;
import java.util.*;
public class rollNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] arr = {75,12,56,89,23,34,35};
        for (int i = 0; i < arr.length; i++) { // traversing elements of array
            if(arr[i] < 35) System.out.print(i + " ");
        }
    }
}
