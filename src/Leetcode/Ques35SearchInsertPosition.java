package Leetcode;

public class Ques35SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) end = mid - 1;
            if(nums[mid] < target) start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {4,7,11,16};
        int target = 18;
        int res = searchInsert(nums, target);
        System.out.println(res);

    }
}
