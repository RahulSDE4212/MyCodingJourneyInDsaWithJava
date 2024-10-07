package Strings.ExtraQuestion;
import java.util.*;
public class L1545_FindKthBitInNthBinaryString {
    public static String invert(String st){
        String ans = "";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='1') ans += '0';
            else ans += '1';
        }
        return ans;
    }
    public static String reverse(String st){
        String ans = "";
        for(int i=st.length()-1;i>=0;i--){
            ans += st.charAt(i);
        }
        return ans;
    }
    public static String solve(int n){
        // base case
        if(n==1) return "0";
        String ans = solve(n-1);
        String invert = invert(ans);
        ans += "1";
        String reverse = reverse(invert);
        ans += reverse;
        return ans;
    }
    public static int findKthBit(int n, int k){
        String ans = solve(n);    //011100110110001
        System.out.println(ans);  //011100110110001
        int num = ans.charAt(k-1)-'0';
        return num;
    }
    public static void main(String[] args) {
        int n = 3, k = 1;
        int ans = findKthBit(n,k);
        System.out.println(ans);
    }
}
