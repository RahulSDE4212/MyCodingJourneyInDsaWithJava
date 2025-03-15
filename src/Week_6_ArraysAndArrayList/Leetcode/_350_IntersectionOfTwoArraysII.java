package Week_6_ArraysAndArrayList.Leetcode;
import java.util.*;
public class _350_IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        /* *************** Appproach-1 : using sorting and two pointers
        * Time complexity  : O(nlogn)
        * Space complexity : O(n)
        * Algorithm:
        *   Step 1 : sort both the arrays nums1 and nums2
        *   Step 2 : traverse both the arrays using two pointers i and j. until one of the array is
        *            fully traversed.
        *   Step 3 : if the number at index i and j are same. add it to the ans arraylist.
        *   Step 4 : if not same
        *           -> if nums1[i] < nums2[j] i++;
        *           -> else j++;
        *   Step 5 : convert the ans arraylist into an array and return it.
        * */
//        ArrayList<Integer> ans = new ArrayList<>(); // S.C = O(n)
//        Arrays.sort(nums1); // T.C.= O(n*logn)
//        Arrays.sort(nums2); // T.C.= O(n*logn)
//        int i = 0;
//        int j = 0;
//        while(i<nums1.length && j<nums2.length){ // O(maxof(nums1.length and nums2.length)
//            if(nums1[i]==nums2[j]){
//                ans.add(nums1[i]);
//                i++;
//                j++;
//            }
//            else if(nums1[i]<nums2[j]) i++;
//            else j++;
//        }
//        int[] finalAns = new int[ans.size()]; // S.C. = O(n)
//        for(int k=0;k<ans.size();k++){ // T.C. = O(n)
//            finalAns[k] = ans.get(k);
//        }
//        return finalAns;

        /* *************** Approach-2 : Using frequency array. ****************
        * time complexity  : O(m+n)
        * space complexity : O(n) where n is the range size of the both the array.
        *
        * Algorithm:
        *   Step 1 : make a frequency array of size 1000.
        *   Step 2 : traverse the array nums1 to count the number of occurrence of each element.
        *   Step 3 : traverse the array nums2 and check whether the element if present or not.
        *           -> if present add the element to the array ans decrement the freq[element]
        *   Step 4 : returnt the ans array
        * */

        int[] freq = new int[1000];
        for(int i=0;i<nums1.length;i++){ // O(m)
            int ele = nums1[i];
            freq[ele]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){ // O(n)
            int ele = nums2[i];
            if(freq[ele]>0){
                ans.add(ele);
                freq[ele]--;
            }
        }

        int[] finalAns = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            finalAns[i]= ans.get(i);
        }
        return finalAns;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

    }
}
