package Recursion.Assignment;
import java.util.*;
public class practice {
    public static void helper(int[] arr,List<Integer> ans){
        if(ans.size()>0) System.out.println(ans);
        for(int i=0;i<arr.length;i++){
            ans.add(arr[i]);
            int[] aux = new int[arr.length-1];
            int k = 0;
            for(int j=0;j<arr.length;j++){
                if(j==i) continue;
                aux[k++] = arr[j];
            }
            helper(aux,ans);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        helper(arr,new ArrayList<>());
    }
}
