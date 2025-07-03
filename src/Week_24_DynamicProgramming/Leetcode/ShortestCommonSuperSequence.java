package Week_24_DynamicProgramming.Leetcode;

class ShortestCommonSuperSequence {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n + 1][m + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                if(i == n){
                    dp[i][j] = m - j;
                }
                else if(j == m) dp[i][j] = n - i;
            }
        }

        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                if(str1.charAt(i) == str2.charAt(j)) dp[i][j] = 1 + dp[i + 1][j + 1];
                else dp[i][j] = 1 + Math.min(dp[i][j + 1], dp[i + 1][j]);
            }
        }

        StringBuilder sb = new StringBuilder();
        
        int i = 0, j = 0;
        while(i < n && j < m) {
            if(str1.charAt(i) == str2.charAt(j)){
                sb.append(str1.charAt(i));
                i++;
                j++;
            }
            else {
                if(dp[i][j + 1] <= dp[i + 1][j]){
                    sb.append(str2.charAt(j));
                    j++;
                }
                else{
                    sb.append(str1.charAt(i));
                    i++;
                }
            }
        }

        if(i == n) sb.append(str2.substring(j));
        if(j == m) sb.append(str1.substring(i));

        return sb.toString();
    }
}