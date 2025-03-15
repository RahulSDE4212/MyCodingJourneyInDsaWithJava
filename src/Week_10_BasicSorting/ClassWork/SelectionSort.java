package Week_10_BasicSorting.ClassWork;
import java.util.*;
public class SelectionSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap (int[] arr, int idx, int minidx){
        int temp = arr[idx];
        arr[idx] = arr[minidx];
        arr[minidx] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,-6,8};
        int n = arr.length;
        print(arr);
        // selection sort
        for(int i=0;i<n-1;i++) { // outer loop is for passes = n-1
            // finding the index of minimum element
            int min_idx = i;
            for (int j=i;j<n;j++) {
                if (arr[j] < arr[min_idx]) min_idx = j;
            }
            // swapping the ith index element to the minimum element
            swap(arr,i,min_idx);
        }
        print(arr);
    }
}