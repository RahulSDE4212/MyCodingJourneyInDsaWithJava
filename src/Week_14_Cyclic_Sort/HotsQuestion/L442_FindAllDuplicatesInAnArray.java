package Week_14_Cyclic_Sort.HotsQuestion;
import java.util.*;
public class L442_FindAllDuplicatesInAnArray {
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i<n){
            int idx = nums[i];
            if(idx == i+1) i++;
            else if(nums[idx-1]==idx) i++;
            else swap(nums,i,idx-1);
        }
        i = 0;
        while(i<n){
            if(nums[i] != i+1) ans.add(nums[i]);
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4,4,5};
        List<Integer> ans = findDuplicates(nums);
        System.out.println(ans);
    }
}
