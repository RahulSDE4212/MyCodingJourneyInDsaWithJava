package Week_6_ArraysAndArrayList.Assignment;
import java.util.*;
public class SecondLargestElementInOnePass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            if(arr[i]>smax && arr[i]<max){
                smax = arr[i];
            }
        }
        System.out.println("the largest element: " + max);
        System.out.println("the second largest element: " + smax);
    }
}
