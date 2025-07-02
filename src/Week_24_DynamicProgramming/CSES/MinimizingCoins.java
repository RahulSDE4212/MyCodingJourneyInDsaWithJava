package Week_24_DynamicProgramming.CSES;

import java.util.*;
 
public class MinimizingCoins {
    static int[] dp = new int[10000006];

    public static int fTB(int[] coins, int target) {
        if (target == 0) return 0;
        if (dp[target] != -2) return dp[target]; // Memoization check

        int minSteps = Integer.MAX_VALUE;
        for (int coin : coins) {
            if (target - coin < 0) continue;
            minSteps = Math.min(minSteps, fTB(coins, target - coin));
        }

        if (minSteps == Integer.MAX_VALUE) return dp[target] = Integer.MAX_VALUE;
        return dp[target] = 1 + minSteps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        dp = new int[x + 1];
        Arrays.fill(dp, -2); // Use -1 to indicate uncomputed states

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int result = fTB(coins, x);
        if (result == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(result);
    }
}