package Week_24_DynamicProgramming.GeeksForGeeks;// User function Template for Java

class ShortestCommonSupersequence {
    // Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String str1, String str2) {
        // Your code here
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
        
        return dp[0][0];
    }
}