package ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class MaximumSubArrayWithSizeK {
    public static int[] maximum(int[] arr, int k){
        int[] ans = new int[3];
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int sum = 0;
            for(int j=i;j<=i+k-1;j++){
                sum += arr[j];
            }
            if(sum > maxSum) {
                ans[0] = i;
                ans[1] = i + k-1;
                ans[2] = sum;
                maxSum = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the size of the subarray: ");
        int k = sc.nextInt();
        int[] ans = maximum(arr,k);
        System.out.println(Arrays.toString(ans));

    }
}
