package Week_6_ArraysAndArrayList.ClassWork;
import java.util.*;
public class CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {10,23,32,23,22,10};
        for(int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
//        int[] brr = arr; // shallow copy
//
//        brr[0] = 256;
//        System.out.println(arr[0]);
//        for(int x: brr){
//            System.out.print(x + " ");

        int[] brr = Arrays.copyOf(arr,arr.length); // hard copy
        brr[0] = 234;
        System.out.println(arr[0]);
        for(int x : brr){
            System.out.print(x + " ");
        }
    }
}
