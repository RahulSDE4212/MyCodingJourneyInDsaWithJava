package Recursion.HotsQuestion;
import java.util.*;
public class CombinationSumII {
    static List<List<Integer>> arr = new ArrayList<>();
    public static void helper(int i, int target,int[] candidates, ArrayList<Integer> ans){
        if(target==0){
                ArrayList<Integer> aux = new ArrayList<>();
                for(int j=0;j<ans.size();j++){
                    aux.add(ans.get(j));
                }
                arr.add(aux);
                return;
            }
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]) continue;
            if(candidates[j]>target) continue;
            else {
                ans.add(candidates[j]);
                helper(j + 1, target - candidates[j], candidates, ans);
            }
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        Arrays.sort(candidates);
        int target = 8;
        arr = new ArrayList<>();
        helper(0,target,candidates,new ArrayList<>());
        System.out.println(arr);
        
    }
}
