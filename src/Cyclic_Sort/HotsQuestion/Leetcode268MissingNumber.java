package Cyclic_Sort.HotsQuestion;
import java.util.*;
public class Leetcode268MissingNumber {
    public static  void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i<nums.length){
            int ele = nums[i];
            if(nums[i]==n || nums[i]==i) i++;
            else {
                swap(nums,i,ele);
            }
        }
        i = 0;
        while(i<n){
            if(nums[i] != i) return i;
            i++;
        }
        return i;
    }
    public static int missingNumber2(int[] nums){
        int sum = 0;
        int n = nums.length;
        int requiredSum = n *(n+1)/2;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return requiredSum-sum;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int num = missingNumber2(nums);
        System.out.println(num);
    }
}
