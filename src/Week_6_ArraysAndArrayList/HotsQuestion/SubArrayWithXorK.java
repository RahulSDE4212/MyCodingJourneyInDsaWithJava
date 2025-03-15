package Week_6_ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class SubArrayWithXorK {
    public static List<List<Integer>> subArrayWithXorK(int[] nums, int k){
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int xor = 0;
            for(int j=i;j<n;j++){
                xor = xor ^ nums[j];
                if(xor == k) {
                    List<Integer> ls = new ArrayList<>();
                    for(int l = i;l<=j;l++){
                        ls.add(nums[l]);
                    }
                    ans.add(ls);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;
        List<List<Integer>> ans = subArrayWithXorK(nums,k);
        System.out.println(ans);
    }
}
