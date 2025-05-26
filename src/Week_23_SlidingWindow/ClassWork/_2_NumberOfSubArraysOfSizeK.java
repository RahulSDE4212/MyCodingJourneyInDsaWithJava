package Week_23_SlidingWindow.ClassWork;
import java.util.*;
public class _2_NumberOfSubArraysOfSizeK {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;

        int start = 0, end = k - 1;
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum += arr[i];
        }
        start++; end++;

        int count = 0;
        if((sum / k) >= threshold) count++;

        while(end < n){
            sum += arr[end] - arr[start - 1];
            if((sum / k) >= threshold) count++;
            start++; end++;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3, threshold = 5;
        int ans = numOfSubarrays(arr, k, threshold);
        System.out.println(ans);
    }
}
