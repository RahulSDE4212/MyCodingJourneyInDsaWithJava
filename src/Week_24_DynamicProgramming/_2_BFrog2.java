package Week_24_DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class _2_BFrog2 {
    static int[] h;
    static int k;
    static int[] dp;

    /*
    Approach: Recursion
    Time Complexity: O(k^n)
    Space Complexity: O(n) stack space
    */
    public static int f(int i){
        if(i >= h.length) return Integer.MAX_VALUE;

        if(i == h.length - 1) return 0;

        int ans = Integer.MAX_VALUE;
        for(int j = 1; j <= k; j++){
            if(i + j >= h.length) break;
            ans = Math.min(ans, Math.abs(h[i] - h[i + j]) + f(i + j));
        }

        return ans;
    }

    /*
    Approach: Recursion + Memoization
    Time Complexity: O(n * k)
    Space Complexity: O(n) + O(n) stack space
    */
    public static int f2(int i){
        if(i >= h.length) return Integer.MAX_VALUE;

        if(i == h.length - 1) return 0;

        int ans = Integer.MAX_VALUE;

        if(dp[i] != 0) return dp[i];
        for(int j = 1; j <= k; j++){
            if(i + j >= h.length) break;
            ans = Math.min(ans, Math.abs(h[i] - h[i + j]) + f(i + j));
        }

        return dp[i] = ans;
    }

    /*
    Approach: Tabulation (Bottom-Up DP)
    Time Complexity: O(n * k)
    Space Complexity: O(n)
    */
    public static int f3(int i){
        if(i >= h.length) return Integer.MAX_VALUE;

        if(i == h.length - 1) return 0;

        dp[dp.length - 1] = 0;

        for(int j = dp.length - 2; j >= 0 ; j--){
            for(int l = 1; l <= k; l++){
                if(j + l >= dp.length) break;
                dp[j] = Math.min(dp[j], Math.abs(h[j] - h[j + l]) + dp[j + l]);
            }
        }

        return dp[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        k = sc.nextInt();
        h = new int[size];
        for(int i = 0; i < h.length; i++){
            h[i] = sc.nextInt();
        }

        dp = new int[size];
        Arrays.fill(dp, Integer.MAX_VALUE);
        System.out.println(f3(0));
    }
}
