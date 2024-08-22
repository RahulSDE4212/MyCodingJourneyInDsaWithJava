package ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class Leetcode137_SingleNumberII {
    public static int singleNumber(int[] nums){ // Approach 1
        int n = nums.length;
        Arrays.sort(nums);
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1] == nums[n-2]) return nums[n-1];
        int i = 1;
        while(i<n-1){
            if(nums[i]==nums[i-1] || nums[i] == nums[i+1]) i++;
            else return nums[i];
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        int n = nums.length;
        int num = singleNumber(nums);
        System.out.println(num);
    }
}
