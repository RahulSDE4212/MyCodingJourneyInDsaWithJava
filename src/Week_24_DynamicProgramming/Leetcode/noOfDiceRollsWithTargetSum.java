package Week_24_DynamicProgramming.Leetcode;
import java.util.*;
class noOfDiceRollsWithTargetSum {
    static int mod = 1000000007;
    static int[][] dp;
    public int f(int n, int k, int target){
        if(n == 0 && target == 0) return 1;
        if(n <= 0) return 0;
        if(dp[n][target] != -1) return dp[n][target];

        int answer = 0;
        for(int i = 1; i <= k; i++){
            if(target - i < 0) break;
            answer = ((answer) % mod + (f(n - 1, k, target - i)) % mod) % mod;
        }

        return dp[n][target] = answer;
    }
    public int numRollsToTarget(int n, int k, int target) {
        dp = new int[n + 1][target + 1];
        for(int[] array : dp){
            Arrays.fill(array, -1);
        }

        int answer = f(n, k, target);
        return answer;
    }
}