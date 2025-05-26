package Week_24_DynamicProgramming;

public class _5_HouseRobberI {
    /*
        Approach: Recursive approach
        Time Complexity: O(2^n)
        Space Complexity: O(n)
    */
    public static int fRecursive(int[] nums, int index){
        if(index > nums.length) return 0;
        if(index == nums.length - 1) return nums[index];
        if(index == nums.length - 2) return Math.max(nums[index], nums[index + 1]);

        return Math.max(nums[index] + fRecursive(nums, index + 2), fRecursive(nums, index + 1));
    }

    /*
        Approach: Recursive + Memoization
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    static int[] dp;
    public static int fTD(int[] nums, int index){
        if(index > nums.length) return 0;
        if(index == nums.length - 1) return nums[index];
        if(index == nums.length - 2) return Math.max(nums[index], nums[index + 1]);
        if(dp[index] != -1) return dp[index];

        return dp[index] = Math.max(nums[index] + fTD(nums, index + 2), fTD(nums, index + 1));
    }

    /*
        Approach: Bottom-up DP
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    static int[] dp2;
    public static int fbu(int[] nums){
        int n = nums.length;

        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        dp2[n - 1] = nums[n - 1];
        dp2[n - 2] = Math.max(nums[n - 2], nums[n - 1]);
        for(int i = n - 3; i >= 0; i--){
            dp2[i] = Math.max(nums[i] + dp2[i + 2], dp2[i + 1]);
        }

        return dp2[0];
    }

    /*
        Approach: Optimized Bottom-up DP (without extra space)
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public static  int f(int[] nums){
        int n = nums.length;

        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        int a = nums[n - 1];
        int b = Math.max(nums[n - 2], nums[n - 1]);

        for(int i = n - 3; i >= 0; i--){
            int res = Math.max(nums[i] + a, b);
            int temp = b;
            b = res;
            a = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int result = fTD(nums, 0);
        System.out.println(result);
    }
}
