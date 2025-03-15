package Week_10_BasicSorting.ClassWork;

import java.util.Arrays;

public class NDistinctElement {
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
        int[] arr = {54,11,28,47,91,63};
        //           3  0  1  2  5  4

        /* method - 1   */
//        print(arr);
//        int[] brr = Arrays.copyOf(arr,arr.length);
//        print(brr);
//        for(int i=1;i<brr.length;i++){
//            for(int j=i;j>=1;j--){
//                if(brr[j]<brr[j-1]) swap(brr,j,j-1);
//                else break;
//            }
//        }
//        print(brr);
//        int k = 0;
//        while(k<brr.length)
//        {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == brr[k]) {
//                    arr[i] = k;
//                }
//            }
//            k++;
//        }
//        print(arr);
        
        /* Method 2 */
        int n = arr.length;
        int x = 0;
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int min_dx = i;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0) {
                    min = arr[j];
                    min_dx = j;
                }
            }
           arr[min_dx] = x;
            x--;
        }
        print(arr);
        for(int i=0;i<arr.length;i++){
            arr[i] = -1 * arr[i];
        }
        print(arr);
    }
}
