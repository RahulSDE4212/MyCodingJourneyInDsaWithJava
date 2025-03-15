package Week_6_ArraysAndArrayList.ClassWork;
import java.util.*;
public class Leetcode27_RemoveElements {
    public static void main(String[] args) {
        int[] nums ={0,1,2,2,3,0,4,2};
        int val =2;
        int i=0,j=0;
        while(j<nums.length){
            if(nums[i] != val && nums[j]!=val){
                i++;
                j++;
            }
            else if(nums[j] == val) j++;
            else if(nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
