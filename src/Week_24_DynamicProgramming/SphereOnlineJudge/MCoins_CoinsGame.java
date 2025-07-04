package Week_24_DynamicProgramming.SphereOnlineJudge;

import java.util.Scanner;

public class MCoins_CoinsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();

        boolean[] dp = new boolean[1000005];
        dp[1] = true;
        dp[k] = true;
        dp[l] = true;

        for(int i = 2; i < dp.length; i++){
            if(i == k || i == l) continue;
            dp[i] = !(dp[i - 1] && (i - k < 1 || dp[i - k]) && (i - l < 1 || dp[i - l]));
        }

        for(int i = 0; i < m; i++){
            int input = sc.nextInt();
            if(dp[input]) System.out.print("A");
            else System.out.print("B");
        }
    }
}
