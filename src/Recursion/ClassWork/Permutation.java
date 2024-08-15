package Recursion.ClassWork;
import java.util.*;
public class Permutation {
    public static void permutation(String s, String ans){
        if(s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            String t = s.substring(0,j)+ s.substring(j+1,s.length());
            permutation(t,ans+ch);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permutation(s,"");
    }
}
