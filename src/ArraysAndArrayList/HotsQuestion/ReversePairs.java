package ArraysAndArrayList.HotsQuestion;

import java.util.ArrayList;

public class ReversePairs {
    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> ans = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if((long)(arr[left])<=(long)(arr[right])){
                ans.add(arr[left]);
                left++;
            }
            else{
                ans.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            ans.add(arr[left]);
            left++;
        }
        while(right<=high){
            ans.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = ans.get(i-low);
        }
    }
    public static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low>=high) return count;
        int mid = low + (high-low)/2;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }
    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid +1;
        int count = 0;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)(arr[i])>(long)((2L *arr[right]))) right++;
            count += right - (mid+1);
        }
        return count;
    }
    public static int reversePairs(int[] nums) {
        /* *********  Brute Force Approach t.c. = O(n^2) **********/
//        int count =0;
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                long num1 = (long)nums[i];
//                long num2 = (long)nums[j];
//                if(num1 > 2*num2) count++;
//            }
//        }
//        return count;

        /* *********Optimal Approach T.C. = O(nlogn) ******************* */
        return mergeSort(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        int ans = reversePairs(arr);
        System.out.println("The number of reverse pairs are : " + ans);
    }
}
