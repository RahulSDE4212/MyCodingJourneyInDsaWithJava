package Week_12_Recursion.HotsQuestion;
import java.util.*;
public class Leetcode_60_Permutation_Sequence {
// *********** Method 1 - Brute-Force Approach *******************

//    static String finalAns = "";
//    static int req = 1;
//    public static void solve(String st, int k,String ans){
//        // base case
//        if(st.isEmpty() && req == k){
//            finalAns = ans;
//            req++;
//            return;
//        }
//        if(st.isEmpty()){
//            req++;
//            return;
//        }
//        for(int i=0;i<st.length();i++){
//            String left = st.substring(0,i);
//            String right = st.substring(i+1);
//            solve(left+right,k,ans+st.charAt(i));
//        }
//    }
//    public static String getPermutation(int n, int k) {
//        String st = "";
//        for(int i =1;i<=n;i++){
//            st += i;
//        }
//        req = 1;
//        solve(st,k,"");
//        return finalAns;
//    }

    // ***************** Approach-2 ***********************
    public static String getPermutation1(int n, int k) {
        int fact = 1;
        // calculating total permutation possible with each number of arrayList numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<n;i++){
            fact = fact * i;
            numbers.add(i);
        }
        k = k -1;
        numbers.add(n);
        String ans = ""; // will store the final result
        while(true){
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.isEmpty()) break;
            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        String ans = getPermutation1(n,k);
        System.out.println(ans);
        // 123 132 213 231 312 321
    }

}
