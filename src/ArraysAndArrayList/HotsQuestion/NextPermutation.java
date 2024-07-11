package ArraysAndArrayList.HotsQuestion;
import java.util.*;
public class NextPermutation {
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void nextPermutation(int[] ans){
        int n = ans.length;
        int idx = -1;
        for(int i=n-1;i>0;i--){
            if(ans[i]>ans[i-1]){
                idx = i-1;
                break;
            }
        }
        if(idx==-1){
            int i = 0, j = n-1;
            while(i<=j){
                swap(ans,i,j);
                i++;
                j--;
            }
        }
        else{
            for(int i=n-1;i>idx;i--){
                if(ans[i]>ans[idx]){
                    swap(ans,i,idx);
                    break;
                }
            }
            int i = idx, j = n-1;
            while(i<=j){
                swap(ans,i,idx);
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] ans = {1,2,3,4,5};
        nextPermutation(ans);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
