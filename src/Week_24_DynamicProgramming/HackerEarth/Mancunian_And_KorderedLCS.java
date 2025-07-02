package Week_24_DynamicProgramming.HackerEarth;
import java.util.*;
public class Mancunian_And_KorderedLCS {
    static int[][][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int k = sc.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[M];

        for(int i = 0; i < N; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++){
            arr2[i] = sc.nextInt();
        }

        dp = new int[N + 1][M + 1][k + 1];
        for(int[][] array : dp){
            for(int[] arr : array){
                Arrays.fill(arr, -1);
            }
        }
        int answer = LcsWithK(arr1, arr2, 0, 0, k);
        System.out.println(answer);
    }

    // Top-Down Approach
    private static int LcsWithK(int[] arr1, int[] arr2, int i, int j, int k) {
        if(i == arr1.length || j == arr2.length) return 0;
        if(dp[i][j][k] != -1) return dp[i][j][k];

        if(arr1[i] == arr2[j]) return dp[i][j][k] = 1 + LcsWithK(arr1, arr2, i + 1, j + 1, k);
        if(k > 0){
            return dp[i][j][k] = Math.max((1 + LcsWithK(arr1, arr2, i + 1, j + 1, k - 1)), Math.max(LcsWithK(arr1, arr2, i +1, j , k), LcsWithK(arr1, arr2, i, j + 1, k)));
        }
        else{
            return dp[i][j][k] = Math.max(LcsWithK(arr1, arr2, i +1, j , k), LcsWithK(arr1, arr2, i, j + 1, k));
        }
    }


}
