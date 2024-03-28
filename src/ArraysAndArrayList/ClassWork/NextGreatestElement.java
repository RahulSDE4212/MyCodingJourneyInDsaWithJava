package ArraysAndArrayList.ClassWork;
import java.util.*;
public class NextGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,51,49,47,44,32,12,10};
        int[] ans = new int[arr.length];

        // Brute Force Approach : jaan lagado bina soche samjhe.
//        for(int i=0;i<ans.length;i++){
//            if(i==ans.length-1) {
//                ans[i] = -1;
//                break;
//            }
//            int max = arr[i+1];
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]>max) max = arr[j];
//            }
//            ans[i] = max;
//        }
//
//        for(int ele: ans){
//            System.out.print(ele + " ");
//        }

        // Method 2: Optimized Approach.


        ans[arr.length-1] = -1;
        int nge = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            ans[i] = nge;
            nge = Math.max(nge,arr[i]);
        }
        for(int ele: ans){
            System.out.print(ele + " ");
        }


    }
}
