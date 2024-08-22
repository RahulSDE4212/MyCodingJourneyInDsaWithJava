package ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class Leetcode260_SingleNumberIII {
    public static int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int n = nums.length;
        if(n==2){
            ans[0] = nums[0];
            ans[1] = nums[1];
            return ans;
        }
        int j = 0;
        if(nums[0]!=nums[1]){
            ans[j++] = nums[0];
        }
        if(nums[n-1]!=nums[n-2]) {
            ans[j++] = nums[n-1];
        }
        int i = 1;
        while(i<n-1){
            if(nums[i] == nums[i+1] || nums[i] == nums[i-1]) i++;
            else ans[j++] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0};
        Arrays.sort(nums);
        int[] ans = singleNumber(nums);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
