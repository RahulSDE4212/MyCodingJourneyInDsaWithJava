package Week_11_BinarySearch.ClassWork;

import java.util.*;

public class IntruderTraceAlgorithm {
    public static int[] findSubarray(int[] arr, int n, int s) {
        int start = 0;
        int currSum = 0;

        for (int end = 0; end < n; end++) {
            currSum += arr[end];

            while (currSum > s && start <= end) {
                currSum -= arr[start];
                start++;
            }

            if (currSum == s) {
                return new int[] {start + 1, end + 1};
            }
        }

        return new int[] {-1};
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5};
        int n1 = 5;
        int s1 = 12;
        System.out.println(Arrays.toString(findSubarray(arr1, n1, s1)));

        int[] arr2 = {1, 4, 20, 3, 10, 5};
        int n2 = 6;
        int s2 = 33;
        System.out.println(Arrays.toString(findSubarray(arr2, n2, s2)));

        int[] arr3 = {1, 2, 3, 4, 5};
        int n3 = 5;
        int s3 = 15;
        System.out.println(Arrays.toString(findSubarray(arr3, n3, s3)));
    }
}