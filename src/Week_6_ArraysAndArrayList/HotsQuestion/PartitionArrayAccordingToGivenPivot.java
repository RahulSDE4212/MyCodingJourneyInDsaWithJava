package Week_6_ArraysAndArrayList.HotsQuestion;

public class PartitionArrayAccordingToGivenPivot {
    public static int[] pivotArray(int[] nums, int pivot) {
        // *************** Approach 1 *******************
        int n = nums.length;
        // int[] arr = new int[n];
        // int i = 0;
        // for(int j=0;j<n;j++){ // O(n)
        //     if(nums[j]<pivot) arr[i++]=nums[j];
        // }
        // for(int j=0;j<n;j++){ // O(n)
        //     if(nums[j]==pivot) arr[i++] = nums[j];
        // }
        // for(int j=0;j<n;j++){ // O(n)
        //     if(nums[j]>pivot) arr[i++] = nums[j];
        // }
        // return arr;

        // *************** Approach 2 ****************
        int[] ans = new int[n];
        int left = 0; // left pointer
        int right = n-1; // right pointer
        for(int i=0;i<n;i++){
            // checking from the left side of the nums array.
            // if <pivot element id present storing it in ans in relative order
            if(nums[i]<pivot) ans[left++] =  nums[i];
            // checking from the right side of the nums array.
            // if >pivot element is present storing it in ans from right side in relative order.
            if(nums[n-1-i]>pivot) ans[right--] = nums[n-1-i];
        }
        while(left<=right){
            ans[left++] = pivot;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {12,2,3,10,14,15,16};
        int[] ans = pivotArray(nums,10);
        for(int ele: ans){
            System.out.print(ele + " ");
        }

    }
}
