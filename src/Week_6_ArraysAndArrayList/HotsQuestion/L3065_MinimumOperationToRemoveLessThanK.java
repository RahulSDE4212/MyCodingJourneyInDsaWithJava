package Week_6_ArraysAndArrayList.HotsQuestion;

public class L3065_MinimumOperationToRemoveLessThanK {
    public static int minOperations(int[] nums, int k) {
        // traversing the array to check how many elements in the array < k
        int count = 0; // will keep the count of no <k
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10,11,12,1,2,3};
        int min =  minOperations(nums,10); // function call
        System.out.println(min);

    }
}
