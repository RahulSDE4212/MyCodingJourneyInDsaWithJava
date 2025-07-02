package Week_24_DynamicProgramming.CSES;

import java.util.*;
 
public class RemovingDigits {
    static int[] dp;
    public static int f(int num) {
        if(num == 0) return 0; // Base case
        if(num <= 9) return 1;
        if(dp[num] != -1) return dp[num];
 
 
        int minSteps = Integer.MAX_VALUE;
        int numAux = num;
        while (numAux > 0) {
            int rem = numAux % 10;
            if (rem > 0) {
                minSteps = Math.min(minSteps, 1 + f(num - rem)); // Recursive step
            }
            numAux /= 10;
        }
 
        return dp[num] = minSteps;
    }
 
    public static int fbu(int num){
        dp[0] = 0;
        for(int i = 1; i <= (Math.min(num, 9)); i++){
            dp[i] = 1;
        }
 
        for(int i = 10; i <= num ; i++){
            int numAux = i;
            while(numAux != 0){
                int rem = numAux % 10;
                if(rem > 0){
                    dp[i] = Math.min(dp[i], 1 + dp[i - rem]);
                }
                numAux /= 10;
            }
        }
 
        return dp[num];
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
 
        dp = new int[num + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        System.out.println(fbu(num));
    }
}