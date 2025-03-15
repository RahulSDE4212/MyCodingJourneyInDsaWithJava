package Week_6_ArraysAndArrayList.HotsQuestion;

public class LongestSubArraySummedTo0 {
    public static int longestSubArraySumTo0(int[] nums){
        int length = Integer.MIN_VALUE;
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==0) length = j - i +1;
                if(length>maxLength) maxLength = length;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {9, -3, 3, -1, 6, -5};
        int ans = longestSubArraySumTo0(nums);
        System.out.println("The length of the longest subArray is: "+ans);
    }
}
