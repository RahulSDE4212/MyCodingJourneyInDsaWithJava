package Week_22_PrefixSum;
import java.util.*;
public class _1_RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] += arr[i - 1];
        }

        System.out.println(Arrays.toString(arr));
    }
}
