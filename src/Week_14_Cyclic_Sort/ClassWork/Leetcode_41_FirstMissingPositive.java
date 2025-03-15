package Week_14_Cyclic_Sort.ClassWork;
import java.util.*;
public class Leetcode_41_FirstMissingPositive {
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // *********** approach 1 *******************
    public static int firstMissingPosNum(int[] nums){ // approach 1
        int i = 1;
        int n = nums.length;
        while(i<=n){
            boolean bool = false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==i){
                    bool = true;
                    break;
                }
            }
            if(!bool) return i;
            i++;
        }
        return i;
    }
    // *********** approach 2 *******************
    public static int firstMissingPos(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=n+1;i++){
            if(!set.contains(i)) return i;
        }
        return 100000;
    }
    // *************** approach 3 ***************
    public static int firstMissingNum(int[] nums){
        int i = 0;
        int n = nums.length;
        while(i<n){
            int ele = nums[i];
            if(ele==i+1 || ele<=0 || ele>n || nums[ele-1]==ele) i++;
            else swap(nums,i,ele-1);
        }
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,4,2,5};
        int no = firstMissingNum(nums);
        System.out.println(no);
    }
}
