package Week_6_ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class L324_WiggleSort {
    public static void wiggleSort(int[] nums) {
        int[] newArr = Arrays.copyOf(nums,nums.length); // space complexity = n
        Arrays.sort(newArr); // time complexity = nlogn
        int n = newArr.length-1;
        for(int i=1;i<nums.length;i+=2){
            nums[i] = newArr[n--]; // putting largest element in nums at odd indices in descending order,
        }
        for(int i=0;i<nums.length;i+=2){
            nums[i] = newArr[n--];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,3,1};
        print(nums);
        wiggleSort(nums);
        print(nums);
    }
    public static void print(int[] nums){
        for(int ele: nums){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
