package Week_24_DynamicProgramming.CSES;
import java.util.*;
public class C_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] dp = new int[N][3];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        dp[0][0] = a;
        dp[0][1] = b;
        dp[0][2] = c;

        for(int i = 1; i < N; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            dp[i][0] = a + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = b + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = c + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }


        System.out.println(Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2])));

    }
}
