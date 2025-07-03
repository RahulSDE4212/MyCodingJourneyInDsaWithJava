package Week_24_DynamicProgramming.GeeksForGeeks;
import java.util.*;
class ShortestUncommonSubsequence {
    static int[][] dp;

    public static int f(String s, String t, int i, int j) {
        if(i == s.length()) return 1005;
        if(j == t.length()) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        int k = j;
        while(k < t.length() && t.charAt(k) != s.charAt(i)) {
            k++;
        }

        if(k == t.length()) return dp[i][j] = 1;

        return dp[i][j] = Math.min(f(s, t, i + 1, j), 1 + f(s, t, i + 1, k + 1));
    }

    static int shortestUnSub(String s, String t) {
        int n = s.length();
        int m = t.length();

        dp = new int[n + 1][m + 1];
        for(int[] array : dp) {
            Arrays.fill(array, -1);
        }

        int ans = f(s, t, 0, 0);
        return ans >= 1005 ? -1 : ans;
    }
}
