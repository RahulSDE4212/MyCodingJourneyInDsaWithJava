package ArraysAndArrayList.Assignment;
import java.util.*;
public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,1,2,3,5};
        int n = arr.length;

        // Brute force approach
//        for(int i=0;i<arr.length;i++){
//            int count = 0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[j] == arr[i]) count++;
//            }
//            if(count == 1) System.out.println(arr[i]);
//        }

        // Method 2: optimized approach.
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        System.out.println(res);

    }
}
