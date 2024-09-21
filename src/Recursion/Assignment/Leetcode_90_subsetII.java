package Recursion.Assignment;
import java.util.*;
public class Leetcode_90_subsetII {
    static List<List<Integer>> finalAns = new ArrayList<>();
    public static void subset(int[] nums,List<Integer> ans, int idx){
        finalAns.add(new ArrayList<>(ans));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            ans.add(nums[i]);
            subset(nums,ans,i+1);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        Arrays.sort(arr);
        subset(arr,new ArrayList<>(),0);
        System.out.println(finalAns);
    }
}
