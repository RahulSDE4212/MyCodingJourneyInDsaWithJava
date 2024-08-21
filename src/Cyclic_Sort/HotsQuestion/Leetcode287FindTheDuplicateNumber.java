package Cyclic_Sort.HotsQuestion;

public class Leetcode287FindTheDuplicateNumber {
    public static boolean present(int[] nums, int mid) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == mid) count++;
        }
        if (count > 1) return true;
        return false;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int smallCount(int[] nums, int mid) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < mid) count++;
        }
        return count;
    }

    public static int findDuplicate(int[] nums) {
        // *********** Approach 1 **************

        int lo = 1;
        int hi = nums.length + 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (present(nums, mid)) return mid;
            int smallThanMid = smallCount(nums, mid);
            if (smallThanMid >= mid) {
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return -1;

        // *********** Approach 2 **************
        // int i = 0;
        // while(i<nums.length){
        //     int ele = nums[i];
        //     if(nums[ele]==nums[i]) return ele;
        //     if(nums[i]==i) i++;
        //     else swap(nums,i,ele);
        // }
        // return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        int no = findDuplicate(nums);
        System.out.println(no);
    }
}