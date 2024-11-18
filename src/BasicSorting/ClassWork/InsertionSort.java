package BasicSorting;
import java.util.*;
public class InsertionSort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        print(arr);
//        for(int i=1;i<arr.length;i++){ // n-1 passes
//            for(int j=i;j>=1;j--){
//                if(arr[j]<arr[j-1]) swap(arr,j,j-1);
//                else break;
//            }
//        }

        for(int i=1;i<arr.length;i++){ // n-1 passes
            int j = i;
            while(j>=1 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        print(arr);
    }
}
