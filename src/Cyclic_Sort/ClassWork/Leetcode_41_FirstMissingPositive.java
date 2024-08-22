package Cyclic_Sort.ClassWork;
import java.util.*;
public class Leetcode_41_FirstMissingPositive {
    public static int firstMissingPosNum(int[] nums){
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
    public static void main(String[] args) {
        int[] nums = {3,1,4,2,5};
        int no = firstMissingPosNum(nums);
        System.out.println(no);
    }
}
