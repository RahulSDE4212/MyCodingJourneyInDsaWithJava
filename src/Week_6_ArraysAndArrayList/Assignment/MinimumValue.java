package Week_6_ArraysAndArrayList.Assignment;
import java.util.*;
public class MinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the element of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;

        // Method-1
//        for (int i = 0; i < arr.length; i++) {
//            min = Math.min(min,arr[i]);
//        }

        // Method-2
        int start=0,end=arr.length-1;
        while(start<=end){
            int target = Math.min(arr[start],arr[end]);
            if(target<min) min = target;
            start++;
            end--;
        }
        System.out.println(min);
    }
}
