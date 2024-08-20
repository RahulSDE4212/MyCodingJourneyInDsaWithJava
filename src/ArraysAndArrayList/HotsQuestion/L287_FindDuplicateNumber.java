package ArraysAndArrayList.HotsQuestion;
import java.sql.SQLOutput;
import java.util.*;
public class L287_FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int lo = 1;
        int hi = nums.length + 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (present(nums, mid)) return mid;
            int smallThanMid = smallCount(nums, mid);
            if (smallThanMid >= mid) {
                hi = mid - 1;
            } else lo = mid + 1;
        }
        return -1;
    }

    public static boolean present(int[] nums, int mid) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == mid) count++;
        }
        if (count > 1) return true;
        return false;
    }

    public static int smallCount(int[] nums, int mid) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < mid) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 3, 3, 3};
        Arrays.sort(nums);

        /* ************Brute-Force Approach ************** */
//        for(int i=1;i<nums.length;i++){
//            if(nums[i]==nums[i-1]) {
//                System.out.println(nums[i]);
//                break;
//            }

        /* ********* Optimized Approach ********/
        int number =  findDuplicate(nums);
        System.out.println(number);

    }
}
