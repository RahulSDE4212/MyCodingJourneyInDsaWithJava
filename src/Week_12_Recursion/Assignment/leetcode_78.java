package Week_12_Recursion.Assignment;
import java.util.*;
public class leetcode_78 {
    static List<List<Integer>> finalAns = new ArrayList<>();
    public static void helper(int[] nums, List<Integer> aux, int index){
        // base case
        if(index==nums.length){
            finalAns.add(new ArrayList<>(aux));
            return;
        }
        helper(nums,aux,index+1);
        aux.add(nums[index]);
        helper(nums,aux,index+1);
        aux.remove(aux.size()-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        finalAns = new ArrayList<>();
        helper(arr,new ArrayList<>(),0);
        System.out.println(finalAns);
    }
}
