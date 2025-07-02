package Week_24_DynamicProgramming.Leetcode;

import java.util.*;

public class Lcs {
    static int[][] dp;
    static int[][] dpTabu;
    // Recursive Approach
    public static int fRec(String s, String t, int i, int j){
        if(i == s.length()) return 0;
        if(j == t.length()) return 0;

        if(s.charAt(i) == t.charAt(j)) return 1 + f(s, t, i + 1, j + 1);
        return Math.max(f(s, t, i + 1, j), f(s, t, i, j + 1));
    }

    // Top - down method
    public static int f(String s, String t, int i, int j){
        if(i == s.length()) return 0;
        if(j == t.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(s.charAt(i) == t.charAt(j)){
            return  dp[i][j] = 1 + f(s, t, i + 1, j + 1);
        }

        return dp[i][j] = Math.max(f(s, t, i + 1, j), f(s, t, i, j + 1));

    }

    // Bottom - up method
    public static int f2(String s, String t){
        int n = s.length();
        int m = t.length();

        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j --){
                if(s.charAt(i) == t.charAt(j)){
                    dpTabu[i][j] = 1 + dpTabu[i + 1][j + 1];
                }
                else{
                    dpTabu[i][j] = Math.max(dpTabu[i + 1][j], dpTabu[i][j + 1]);
                }
            }
        }

        return dpTabu[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int n = s.length();
        int m = t.length();
        dp = new int[n + 1][m + 1];
        for(int[] array : dp){
            Arrays.fill(array, -1);
        }

        dpTabu = new int[n + 1][m + 1];
        System.out.println(f(s, t, 0, 0));
        System.out.println(f2(s, t));
    }
}
