package Week_24_DynamicProgramming.Leetcode;
import java.util.*;
public class BestTimeToBuyAndSellStockIV {
    static int[][][] dp;
    public static int f(int[] prices, int i, int k, int bool){
        if(i == prices.length) return 0;
        if(dp[i][k][bool] != -1) return dp[i][k][bool];

        int avoid = f(prices, i + 1, k, bool);
        int sell = 0;
        if(bool == 1){
            sell = f(prices, i + 1, k - 1, 0) + prices[i];
        }
        int buy = 0;
        if(bool == 0 && k > 0) buy = f(prices, i + 1, k, 1) - prices[i];

        return dp[i][k][bool] = Math.max(avoid, Math.max(sell, buy));

    }
    public static  int maxProfit(int[] prices) {
        int n = prices.length;

        dp = new int[n + 1][3][2];
        for(int[][] array : dp){
            for(int[] arr : array){
                Arrays.fill(arr, -1);
            }
        }
        // the signature of function f is : f(int[] prices, int indexOfArray, int k, boolean bool);
        return f(prices, 0, 2, 0); // 0 means false here
    }
}
