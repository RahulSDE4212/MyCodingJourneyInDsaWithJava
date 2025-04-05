package Week_23_SlidingWindow;

public class _1_MaximumSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {10,40,-30,-10,20,90,0};
        int k = 3;
        int n = arr.length;

        int maxSum = 0;
//        for(int i = 0; i < arr.length - k + 1; i++){
//            int sum = 0;
//            for(int j = i; j <= i + k - 1; j++){
//                sum += arr[j];
//            }
//            maxSum = Math.max(sum, maxSum);
//        }

        int i = 0, j = k - 1;
        int sum = 0;
        for(int a = 0; a <= k - 1; a++){
            sum += arr[a];
        }
        maxSum = Math.max(sum, maxSum);
        i++; j++;

        while(j < n){
            sum += arr[j] - arr[i - 1];
            maxSum = Math.max(sum, maxSum);
            i++; j++;
        }

        System.out.println(maxSum);
    }
}
