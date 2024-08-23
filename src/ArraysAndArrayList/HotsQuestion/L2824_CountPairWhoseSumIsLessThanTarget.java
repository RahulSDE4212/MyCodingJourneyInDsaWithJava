package ArraysAndArrayList.HotsQuestion;
import java.sql.Array;
import java.util.*;
public class L2824_CountPairWhoseSumIsLessThanTarget {
    public static int countPair(List<Integer> nums, int target){
        // ***************** Approach 1 - Brute Force ******************
        // int count = 0;
        // for(int i=0;i<nums.size()-1;i++){
        //     for(int j=i+1;j<nums.size();j++){
        //         if(nums.get(i)+nums.get(j)<target) count++;
        //     }
        // }
        // return count;

        // ************** Approach - 2: Sorting Technique******************
         Collections.sort(nums);
         int count = 0;
         int i = 0, j = nums.size()-1;
         while(i<j){
             if(nums.get(i)+nums.get(j)<target){
                 count = count +(j-i);
                 i++;
             }
             else j--;
         }
         return count;
    }
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 2;
        int count = countPair(nums,target);
        System.out.println(count);
    }
}
