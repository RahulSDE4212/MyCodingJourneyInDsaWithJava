package Week_11_BinarySearch.Leetcode;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+nums2.length];
        int i = 0 , j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                nums3[k] = nums1[i];
                i++;
            }
            else{
                nums3[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        for(int m = 0;m<nums3.length;m++){
            System.out.print(nums3[m] + " ");
        }
        int low = 0, high = nums3.length-1;
        int mid = low + (high-low)/2;
        if(high % 2==0) return (nums3[mid]);
        else {
            int val1 = nums3[mid];
            int val2 = nums3[mid+1];
            return ((val1+val2)/2.0);
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
}
