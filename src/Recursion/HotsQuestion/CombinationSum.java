package Recursion.HotsQuestion;
import java.util.*;
public class CombinationSum {
    static List<List<Integer>> arr = new ArrayList<>();
    public static void findCombination(int i, int target,int[] candidates, ArrayList<Integer> ans){
        if(i==candidates.length){
            if(target==0){
                ArrayList<Integer> aux = new ArrayList<>();
                for(int j=0;j<ans.size();j++){
                    aux.add(ans.get(j));
                }
                arr.add(aux);
            }
            return;
        }
        if(candidates[i] <= target){
            ans.add(candidates[i]);
            findCombination(i,target-candidates[i],candidates,ans);
            ans.remove(ans.size()-1);
        }
        findCombination(i+1,target,candidates,ans);
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        findCombination(0,target,candidates,new ArrayList<>());
        System.out.println(arr);
    }
}
