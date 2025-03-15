package Week_6_ArraysAndArrayList.HotsQuestion;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int lengthofConsecutiveSequence(int[] arr){
        int lastSmallest = Integer.MIN_VALUE;
        int maxLength = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==lastSmallest){
                count++;
            }
            else if(arr[i]-1 != lastSmallest){
                count = 1;
            }
            lastSmallest =arr[i];
            maxLength = Math.max(count,maxLength);
        }
        return maxLength;
    }
    public static boolean linearSearch(int[] nums, int x){
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==x) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        int n = arr.length;
        int maxLength = Integer.MIN_VALUE;
        /* ****************BruteForce Approach **************/
//        for(int i=0;i<n;i++){
//            int x = arr[i];
//            int count = 1;
//            while(linearSearch(arr, x + 1)){
//                count++;
//                x += 1;
//            }
//            maxLength = Math.max(count,maxLength);
//        }
        Arrays.sort(arr);
        maxLength = lengthofConsecutiveSequence(arr);
        System.out.println("The length of the longest consecutive sequence is: " + maxLength);
    }
}
