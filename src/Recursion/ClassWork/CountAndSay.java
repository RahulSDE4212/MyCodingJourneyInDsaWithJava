package Recursion.ClassWork;
import java.util.*;
public class CountAndSay {
    public static String countAndSay(int n){
        if(n==1) return "1"; // base case
        String s = countAndSay(n-1);
        String ans= "";
        int i = 0;
        int j = 0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }
        int len = j-i;
        ans += len;
        ans += s.charAt(i);
        return ans;
    }
    public static void main(String[] args) {
        String ans = countAndSay(2);
        System.out.println(ans);
    }
}
