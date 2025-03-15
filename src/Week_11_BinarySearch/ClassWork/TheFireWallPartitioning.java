package Week_11_BinarySearch.ClassWork;

public class TheFireWallPartitioning {
    public static int agentHandler(int[] arr, int n, int m) {
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
            int mid = start + (end - start) / 2;

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
        int[] arr1 = {10, 20, 30, 40};
        int n = 4;
        int k = 2;
        System.out.println(agentHandler(arr1, n, k));

        int[] arr2 = {5, 10, 30, 20, 15};
        int n1 = 5;
        int k1 = 3;
        System.out.println(agentHandler(arr2, n1, k1));
    }
}
