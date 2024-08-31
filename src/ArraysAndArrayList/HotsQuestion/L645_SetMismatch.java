package ArraysAndArrayList.HotsQuestion;
import java.sql.SQLOutput;
import java.util.*;
public class L645_SetMismatch {
    public static void swap(int[] nums, int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int n = nums.length;
        int[] ans = new int[2];
        while(i<n){
            int idx = nums[i];
            if(idx == i+1) i++;
            else if(nums[idx-1]==idx) i++;
            else swap(nums,idx-1,i);
        }
        i = 0;
        while(i<n){
            if(nums[i] != i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] ans = findErrorNums(nums);
        System.out.println(Arrays.toString(ans));
    }
}
