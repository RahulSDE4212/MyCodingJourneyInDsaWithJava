package ArraysAndArrayList.HotsQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] ans,int target){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int i = 0;
        while(i<ans.length){
            int j = i+1;
            while(j<ans.length){
                int k = j +1;
                while(k<ans.length){
                    int sum = ans[j] + ans[k] + ans[i];
                    if(sum==target){
                        ArrayList<Integer> ls = new ArrayList<>();
                        ls.add(ans[i]);
                        ls.add(ans[j]);
                        ls.add(ans[k]);
                        arr.add(ls);
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        System.out.println(arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] ans = {-1,0,1,2,-1,4};
        //Arrays.sort(ans);
        ArrayList<ArrayList<Integer>> ls = threeSum(ans,0);
        System.out.println(ls);
    }
}
