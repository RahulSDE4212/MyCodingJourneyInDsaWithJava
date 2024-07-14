package ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        /* **************** Brute Force Approach ***************/
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    for(int l=k+1;l<n;l++){
//                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
//                        if(sum == target){
//                            List<Integer> aux = new ArrayList<>();
//                            aux.add(nums[i]);
//                            aux.add(nums[j]);
//                            aux.add(nums[k]);
//                            aux.add(nums[l]);
//                            ans.add(aux);
//                        }
//                    }
//                }
//            }
//        }

        /* *************  optimal approach ******************  */

        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j != i+1 && nums[j]==nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int sum = nums[i]+nums[j] + nums[k]+nums[l];
                    if(sum==target){
                        ArrayList<Integer> aux = new ArrayList<>();
                        aux.add(nums[i]);
                        aux.add(nums[j]);
                        aux.add(nums[k]);
                        aux.add(nums[l]);
                        ans.add(aux);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k+1]) k++;
                        while(k<l && nums[l]==nums[l-1]) l--;
                    }
                    else if(sum<target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = fourSum(nums,0);
        System.out.println(ans);
    }
}
