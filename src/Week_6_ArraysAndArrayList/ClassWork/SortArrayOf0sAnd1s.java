package Week_6_ArraysAndArrayList.ClassWork;
import java.util.*;
public class SortArrayOf0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        /* ************Method 1: Brute force approach *************** */

//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

        /* ************Method 2 Two pass Solution *************** */

//        int noOfOs = 0;
//        int noOf1s = 0;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0) noOfOs++;
//            else noOf1s++;
//        }
//        int i=0;
//        while(noOfOs>0){
//            arr[i] = 0;
//            i++;
//            noOfOs--;
//        }
//        while(noOf1s>0){
//            arr[i] = 1;
//            i++;
//            noOf1s--;
//        }

        /* ************ Method 3 One pass Solution *************** */

        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(arr[i]==1 && arr[j]==0 && i<j){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
