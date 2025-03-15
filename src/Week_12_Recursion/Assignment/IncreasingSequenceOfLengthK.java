package Week_12_Recursion.Assignment;
import java.util.*;
public class IncreasingSequenceOfLengthK {
    public static void helper(int n, int k, List<Integer> arr){
        if(arr.size()==k){
            System.out.println(new ArrayList<>(arr));
            return;
        }
        for(int i=1;i<=n;i++){
            boolean bool = false;
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)==i) {
                    bool = true;
                    break;
                }
            }
            if(bool) continue;
            arr.add(i);
            helper(n,k,arr);
            arr.remove(arr.size()-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        // function call
        helper(n,k,new ArrayList<>());
    }
}
