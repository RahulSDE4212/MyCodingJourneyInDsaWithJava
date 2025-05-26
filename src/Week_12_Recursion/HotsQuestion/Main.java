package Week_12_Recursion.HotsQuestion;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int solve(int n, int k, int[] height, int i){
        if(i == n - 1) return 0;
        int minCost = Integer.MAX_VALUE;
        for(int j = 1; j <= k; j++){
            if(i + j >= n) break; 
            int cost = Math.abs(height[i] - height[i + j]) + solve(n, k, height, i + j);
            minCost = Math.min(cost, minCost);
        }
        return minCost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] height = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = sc.nextInt();
        }
        
        int result = solve(n, k, height, 0);
        System.out.println(result);
    }
}