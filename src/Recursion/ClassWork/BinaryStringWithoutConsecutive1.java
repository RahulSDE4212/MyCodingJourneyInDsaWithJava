package Recursion.ClassWork;
import java.util.*;
public class BinaryStringWithoutConsecutive1 {
    public static void bsWithoutConsecutive1(int n,String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        if(ans.isEmpty() || ans.charAt(ans.length()-1)=='0') {
            bsWithoutConsecutive1(n, ans + '0');
            bsWithoutConsecutive1(n,ans+'1');
        }
        else bsWithoutConsecutive1(n,ans+'0');
    }
    public static void main(String[] args) {
        int n = 3;
        bsWithoutConsecutive1(n,"");
    }
}
