package Week_24_DynamicProgramming.CSES;

import java.util.*;
public class DiceCombination {
    static int[] dp;
    static int mod = 1000000007;

    public static int f(int n) {
        if (n == 0) return 1;
        if (dp[n] != -1) return dp[n];
        int answer = 0;
        for (int i = 1; i <= 6; i++) {
            if (n - i < 0) break;
            answer = (answer + f(n - i)) % mod;
        }
        return dp[n] = answer;
    }

    public static int fbu(int n) {
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i - j < 0) break;
                dp[i] = (dp[i] + dp[i - j]) % mod;
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1];
        Arrays.fill(dp, 0);

        int answer = fbu(n);
        System.out.println(answer);
    }
}
