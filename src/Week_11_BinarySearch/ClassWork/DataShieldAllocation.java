package Week_11_BinarySearch.ClassWork;

import java.util.*;

public class DataShieldAllocation {
    public static int findMinLoad(int[] arr, int n, int m) {
        if (m > n) {
            return -1;
        }

        int start = Integer.MIN_VALUE;
        int end = 0;

        for(int num : arr){
            start = Math.max(start, num);
            end += num;
        }
        int result = end;

        while (start <= end) {
            int mid = start + (start + end) / 2;

            if (BlackBox(arr, n, m, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static boolean BlackBox(int[] arr, int n, int m, int mid) {
        int serversRequired = 1;
        int currentLoad = 0;

        for (int i = 0; i < n; i++) {
            if (currentLoad + arr[i] > mid) {
                serversRequired++;
                currentLoad = arr[i];

                if (serversRequired > m) {
                    return false;
                }
            } else {
                currentLoad += arr[i];
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 34, 67, 90};
        int n1 = 4;
        int m1 = 2;
        System.out.println(findMinLoad(arr1, n1, m1));

        int[] arr2 = {10, 20, 30, 40, 50};
        int n2 = 5;
        int m2 = 3;
        System.out.println(findMinLoad(arr2, n2, m2));
    }
}