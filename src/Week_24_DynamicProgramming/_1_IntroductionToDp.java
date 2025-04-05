package Week_24_DynamicProgramming;

/*
💥 FULL DOCUMENTATION ON DYNAMIC PROGRAMMING (DP) 💥
--------------------------------------------------------

📌 WHAT IS DYNAMIC PROGRAMMING?

Dynamic Programming (DP) is a technique used to solve problems that have:
1. Overlapping Subproblems — subproblems repeat again and again.
2. Optimal Substructure — solution to the big problem depends on smaller subproblems.

DP avoids recomputation by storing results of subproblems in a table (array/hashmap).

--------------------------------------------------------

📦 TYPES OF DYNAMIC PROGRAMMING

1️⃣ TOP-DOWN DP (MEMOIZATION)
------------------------------
- Think recursion + caching.
- You solve the problem by going down the tree (recursive calls),
  and store answers in a dp[] to avoid recomputation.

🔧 EXAMPLE: Climbing Stairs
------------------------------
Steps: You can take 1 or 2 steps at a time.
Ways to reach step n = ways(n-1) + ways(n-2)

Code:
int climbStairs(int n, int[] dp) {
    if(n <= 1) return 1;
    if(dp[n] != 0) return dp[n];
    return dp[n] = climbStairs(n-1, dp) + climbStairs(n-2, dp);
}

🧠 Time: O(n) | Space: O(n) (dp[] + recursion stack)

--------------------------------------------------------

2️⃣ BOTTOM-UP DP (TABULATION)
------------------------------
- Build up from the base cases.
- No recursion involved. Pure iteration.

🔧 EXAMPLE: Climbing Stairs (Tabulation)
------------------------------
dp[0] = 1;
dp[1] = 1;
for(int i = 2; i <= n; i++){
    dp[i] = dp[i-1] + dp[i-2];
}
return dp[n];

🧠 Time: O(n) | Space: O(n)

--------------------------------------------------------

3️⃣ SPACE-OPTIMIZED DP
------------------------------
- Used when only a few previous values are needed.
- No need to store the full dp[] array.

🔧 EXAMPLE: Fibonacci / Climbing Stairs Optimized
------------------------------
int prev1 = 1, prev2 = 1;
for(int i = 2; i <= n; i++) {
    int curr = prev1 + prev2;
    prev2 = prev1;
    prev1 = curr;
}
return prev1;

🧠 Time: O(n) | Space: O(1)

--------------------------------------------------------

🛠️ COMPONENTS OF A DP SOLUTION

✅ Subproblem — What are we trying to solve?
✅ State — What uniquely defines each subproblem? (like `i`, `j`, `sum`, etc.)
✅ Recurrence Relation — How does dp[i] relate to dp[i-1], dp[i-2], etc.?
✅ Base Case — What's the simplest version with a known answer?
✅ Final Answer — Which dp[i] or dp[i][j] gives the final solution?

--------------------------------------------------------
🚫 WHEN NOT TO USE DP?

- If subproblems don't overlap (each call is unique).
- If a greedy algorithm gives a correct + optimal solution.
- If recursion is not possible or meaningful.

--------------------------------------------------------
*/

public class _1_IntroductionToDp {

    // 🚀 3️⃣ SPACE OPTIMIZED DP — Fib Example
    // Only store last 2 values to compute the next one
    public static int fib1(int n) {
        if(n <= 1) return n;

        int num1 = 0; // fib(0)
        int num2 = 1; // fib(1)

        for(int i = 2; i <= n; i++){
            int sum = num1 + num2; // fib(i) = fib(i-1) + fib(i-2)
            num1 = num2;
            num2 = sum;
        }

        return num2; // Return fib(n)
    }

    // 🌀 NAIVE RECURSION — For understanding, not for use in production
    // Exponential time, very slow for n > 30
    public static int fib2(int n){
        if(n <= 1) return n;
        return fib2(n - 1) + fib2(n - 2); // redundant calls!
    }

    // 🧠 1️⃣ TOP-DOWN DP — Memoization
    // Store results to avoid repeated computation
    public static int fib3(int n, int[] dp){
        if(n <= 1) return n;

        if(dp[n] != 0) return dp[n];

        dp[n] = fib3(n - 1, dp) + fib3(n - 2, dp); // Recurrence
        return dp[n];
    }

    // 📊 2️⃣ BOTTOM-UP DP — Tabulation
    // Build table from small to large problems
    public static int fib(int n){
        if(n <= 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]; // Answer at top
    }

    public static void main(String[] args) {
        int n = 8;

        // 👇 Test all methods
        int ans1 = fib1(n); // Space optimized
        int ans2 = fib2(n); // Naive recursion
        int[] dp = new int[n + 1];
        int ans3 = fib3(n, dp); // Top-down memoization
        int ans4 = fib(n); // Bottom-up tabulation

        // 🖨️ Output all results
        System.out.println("fib1 (Space Optimized) : " + ans1);
        System.out.println("fib2 (Naive Recursion) : " + ans2);
        System.out.println("fib3 (Memoization)     : " + ans3);
        System.out.println("fib  (Tabulation)      : " + ans4);
    }
}
