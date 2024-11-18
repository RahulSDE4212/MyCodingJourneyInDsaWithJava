package ArraysAndArrayList.Leetcode;

public class L2563_CountTheNumberOfFairPairs {
    public static  long countFairPairs(int[] nums, int lower, int upper) {
        /*
        *********** Approach 1 : Brute Force **********************
        * Time complexity : O(n2)
        * Space complexity : O(1)
        Algorithm :
           check for every pair possible in the array.
           if you find any pair whose sum <= upper and >= lower, increment the count.
           return the count
        */
//        int count = 0;
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=i+1;j<nums.length;j++){
//                int sum = nums[i] + nums[j];
//                if(sum>=lower && sum<=upper) count++;
//            }
//        }
//        return count;

        /*
        *************** Approach 2 : using sorting, binary search, two pointer
        Time Complexity:
        Space Complexity : O(1)
        Algorithm:
            Step 1 : Sort the array nums.
            Step 2 : loop from i = 0 to n-2
                     -> for every i find the index j such that nums[i]+nums[j] >=lower. This is the index start
                     -> similarly find the index j such that nums[i]+nums[j] <= upper. This is the index end
                     -> all the number btw index start and end both inclusive is the required pairs.
        */

        int count = 0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int left = i+1;
            int right = n-1;
            while(left<=right){
                int mid = left + (right - left )/2;
                int sum = nums[i] + nums[mid];
                if(sum>=lower){
                    right = mid -1;
                }
                else left = mid + 1;
            }
            int start = left;

            left = i+1;
            right = n-1;
            while(left<=right){
                int mid = left + (right - left )/2;
                int sum = nums[i] + nums[mid];
                if(sum<=upper){
                    left = mid + 1;
                }
                else right = mid - 1;
            }
            int end = right;

            if(start<=end){
                count = count + (end-start+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5};
        int lower = 3, upper = 6;
        long ans = countFairPairs(nums,lower,upper);
        System.out.println(ans);
    }
}
