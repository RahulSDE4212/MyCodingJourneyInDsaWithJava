package Week_24_DynamicProgramming.Leetcode;
import java.util.*;
public class FibonacciSeries {
    static int[] dpMemo;
    static int[] dpTabulation;

    // Recursive
    public static int fibRec(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibRec(n - 1) + fibRec(n - 2);
    }

    // Memoization
    public static int fibMemo(int n) {
        dpMemo = new int[n + 1];
        Arrays.fill(dpMemo, -1);
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(dpMemo[n] != -1) return dpMemo[n];

        return dpMemo[n] = fibMemo(n - 1) + fibMemo(n - 2);
    }

    // Tabulation
    public static int fibTabu(int n) {
        dpTabulation = new int[n + 1];

        if(n <= 1) return n;
        dpTabulation[0] = 0; dpTabulation[1] = 1;


        for(int i = 2; i < n + 1; i++){
            dpTabulation[i] = dpTabulation[i - 1] + dpTabulation[i - 2];
        }

        return dpTabulation[n];
    }

    // Space Optimization
    public static int fib(int n) {
        int a = 0, b = 1;

        if(n <= 1) return n;
        for(int i = 2; i <= n; i++){
            int res = a + b;
            a = b;
            b = res;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 3;

        dpMemo = new int[n + 1];
        dpTabulation = new int[n + 1];
        Arrays.fill(dpMemo, -1);
        Arrays.fill(dpTabulation, -1);

        System.out.println(fibTabu(3));

    }
}
