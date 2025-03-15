package Week_12_Recursion.ClassWork;
import java.util.ArrayList;
public class subsetsOfArray {
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static void helper(int i,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        helper(i+1,nums,ans);
        ans.add(nums[i]);
        helper(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        helper(0,nums,new ArrayList<>());
        System.out.println(arr);
    }
}
