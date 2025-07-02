package Week_24_DynamicProgramming.Atcoder;

import java.util.*;

class LCS {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    
    int n = s1.length();
    int m = s2.length();
    
    int[][] dp = new int[n + 1][m + 1];
    for(int i = n - 1; i >= 0; i--){
      for(int j = m - 1; j >= 0; j--){
        if(s1.charAt(i) == s2.charAt(j)){
          dp[i][j] = dp[i + 1][j + 1] + 1;
        }
        else{
          dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
        }
      }
    }
    
    StringBuilder sb = new StringBuilder();
    int i = 0, j = 0;
    while(i < n && j < m) {
        if(s1.charAt(i) == s2.charAt(j)){
          sb.append(s1.charAt(i));
          i++;
          j++;
        }
        else{
          if(dp[i][j + 1] <= dp[i + 1][j]) i++;
          else j++;
        }
    }
    
    System.out.println(sb.toString());
  }
}