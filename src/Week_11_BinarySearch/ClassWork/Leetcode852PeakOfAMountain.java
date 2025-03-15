package Week_11_BinarySearch.ClassWork;
import java.util.*;
public class Leetcode852PeakOfAMountain {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]) hi = mid -1;
            else  lo = mid +1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {3,4,5,1};
        int peak = peakIndexInMountainArray(arr);
        System.out.println(peak);
    }
}
