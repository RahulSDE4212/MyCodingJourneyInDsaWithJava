package Recursion.HotsQuestion;

import java.util.ArrayList;
import java.util.*;
public class SubsetII {
    static List<List<Integer>> arr = new ArrayList<>();
    public static void helper(int i, int[] nums, ArrayList<Integer> ans){
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            ans.add(nums[j]);
            ArrayList<Integer> aux = new ArrayList<>(); //work done
            for(int k=0;k<ans.size();k++){
                aux.add(ans.get(k));
            }
            arr.add(aux);
            helper(j+1,nums,ans);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        helper(0, nums,new ArrayList<>());
        System.out.println(arr);
    }
}
