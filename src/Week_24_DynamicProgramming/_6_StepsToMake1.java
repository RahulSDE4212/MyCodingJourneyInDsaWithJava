package Week_24_DynamicProgramming;

import java.util.Arrays;

public class _6_StepsToMake1 {
    public static int fRecursive(int n){
        if(n == 1) return 0;
        if(n == 2 || n == 3) return 1;

        int first = 1 + fRecursive(n - 1);
        int second = (n % 2 == 0) ? 1 + fRecursive(n / 2) : Integer.MAX_VALUE;
        int third = (n % 3 == 0) ? 1 + fRecursive(n / 3) : Integer.MAX_VALUE;

        return Math.min(first, Math.max(second, third));
    }

    static int[] dp;
    public static int fTD(int n){
        if(n == 1) return 0;
        if(n == 2 || n == 3) return 1;
        if(dp[n] != -1) return dp[n];

        int first = 1 + fRecursive(n - 1);
        int second = (n % 2 == 0) ? 1 + fTD(n / 2) : Integer.MAX_VALUE;
        int third = (n % 3 == 0) ? 1 + fTD(n / 3) : Integer.MAX_VALUE;

        return dp[n] = Math.min(first, Math.max(second, third));
    }

    static int[] dp2;
    public static int fBU(int n){
        if(n == 1) return 0;
        if(n == 2 || n == 3) return 1;
        if(dp[n] != -1) return dp[n];

        dp[1] = 0;
        dp[2] = 1; dp[3] = 1;
        for(int i = 3; i <= n; i++) {
            int first = 1 + dp[n - 1];
            int second = (n % 2 == 0) ? 1 + dp[n / 2] : Integer.MAX_VALUE;
            int third = (n % 3 == 0) ? 1 + dp[n / 3] : Integer.MAX_VALUE;
            dp[n] = Math.max(first, Math.min(second, third));
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 7;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp2 = new int[10005];

        int stepRec = fRecursive(n);
        System.out.println(stepRec);

        int stepfTD = fTD(n);
        System.out.println(stepfTD);

        int stepfBU = fBU(n);
        System.out.println(stepfBU);
    }
}
