package Recursion.Assignment;
import java.util.*;
public class DecimalToBinary {
    public static String decimalToBin(int n){
        String aux = helper(n,"");
        String rev = "";
        int i = aux.length()-1;
        while(i>=0){
            char ch = aux.charAt(i);
            rev += ch;
            i--;
        }
        return rev;
    }
    public static String helper(int n,String s){
        // base case
        if(n==0) return s;
        // this method will do some task
        int rem = n % 2;
        s += rem;
        return helper(n/2,s);
    }
    public static void main(String[] args) {
        int n = 4;
        String rev = decimalToBin(n);
        System.out.println(rev);
    }
}
