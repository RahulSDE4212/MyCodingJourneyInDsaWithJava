package ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class Leetcode2200_FindAllK_DistantIndicesInAnArray {
    public static List<Integer> k_distantIndicesInAnArray(int[] nums, int key , int k){
        // key element ko nums array me pata karo
        int start = 0;
        List<Integer> ans = new ArrayList<>(); // this will store the final ans
        int end = 0;
        int j = 0;
        while(j<nums.length){
            if(nums[j]==key){ // j index par key element hai
                // if start pehle se hi j-k se bada element pe pada hua hai to start ko update mat karna
                if(j-k > start) start = j - k; // matlab i = j-k se j+k tak final ans me add karna hai
                end = j + k;
                while(start<=end){
                    if(start>=0 && start<nums.length) ans.add(start);
                    start++;
                }
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2,2};
        int key = 2;
        int k = 2;
        List<Integer> ans = k_distantIndicesInAnArray(nums,key,k);
        System.out.println(ans);
    }
}
