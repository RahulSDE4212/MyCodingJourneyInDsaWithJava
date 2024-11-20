package ArraysAndArrayList.Leetcode;
import java.util.*;
public class _1863_SumOfAllSubsetXorTotal {
    static int finalAns;
    public static int xor(ArrayList<Integer> nums){
        int ans = 0;
        for(int i=0;i<nums.size();i++){
            ans = ans ^ nums.get(i);
        }
        return ans;
    }
    public static void helper(int[] nums, int index, ArrayList<Integer> ans){
        if(index==nums.length){
            finalAns += xor(ans);
            return;
        }
        helper(nums,index+1,ans);
        ans.add(nums[index]);
        helper(nums,index+1,ans);
        ans.remove(ans.size()-1);
    }
    public static int subsetXORSum(int[] nums) {
        // ********* Approach 1 : using recursion **********************
        helper(nums,0,new ArrayList<>());
        return finalAns;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8};
        int result = subsetXORSum(nums);
        System.out.println(result);
    }
}
