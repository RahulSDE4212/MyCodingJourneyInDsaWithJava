package Recursion.Assignment;
import java.util.*;
public class Combination {
    public static void helper(int[] arr, List<Integer> ans){
        // base case
        if(ans.size()==arr.length){
            System.out.println(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<arr.length;i++){
            boolean bool = false;
            for(int j=0;j<ans.size();j++){
                if(ans.get(j)==arr[i]) bool = true;
            }
            if(!ans.isEmpty() && bool) continue;
            ans.add(arr[i]);
            helper(arr,ans);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        helper(arr,new ArrayList<>());
    }
}
