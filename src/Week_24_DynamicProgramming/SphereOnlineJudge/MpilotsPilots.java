package Week_24_DynamicProgramming.SphereOnlineJudge;

import java.io.*;
import java.util.*;

class MpilotsPilots {
    static int[][] dp;

    public static int f(int[] captain, int[] assistant, int i, int k) {
        if (i == captain.length) return 0;

        if (dp[i][k] != -1) return dp[i][k];

        if (k == 0) {
            return dp[i][k] = f(captain, assistant, i + 1, k + 1) + assistant[i];
        }

        if (k == captain.length - i) {
            return dp[i][k] = f(captain, assistant, i + 1, k - 1) + captain[i];
        }

        return dp[i][k] = Math.min(
            f(captain, assistant, i + 1, k + 1) + assistant[i],
            f(captain, assistant, i + 1, k - 1) + captain[i]
        );
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] captain = new int[N];
        int[] assistant = new int[N];

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            captain[i] = Integer.parseInt(parts[0]);
            assistant[i] = Integer.parseInt(parts[1]);
        }

        dp = new int[N + 1][N + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int answer = f(captain, assistant, 0, 0);
        System.out.println(answer);
    }
}
