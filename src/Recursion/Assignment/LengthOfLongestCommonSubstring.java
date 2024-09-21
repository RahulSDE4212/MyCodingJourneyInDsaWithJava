package Recursion.Assignment;
import java.util.*;
public class LengthOfLongestCommonSubstring {
    public static int LCSLength(String s1,String s2,int i, int j,int currentLength){
        // base case
        if(i==s1.length() || j==s2.length()){
            return currentLength;
        }
        int matchLength = currentLength;
        if(s1.charAt(i)==s2.charAt(j)){
            currentLength++;
            matchLength = LCSLength(s1,s2,i+1,j+1,currentLength);
        }
        int skips1 = LCSLength(s1,s2,i+1,j,0);
        int skips2 = LCSLength(s1,s2,i,j+1,0);
        return Math.max(matchLength,Math.max(skips2,skips1));
    }
    public static void main(String[] args) {
        String s1 = "rahulsingh";
        String s2 = "raghavgarg";
        // calling longestCommonSubstringLength method which will return me the length of the longest
        // common substring present between s1 and s2.
        int length = LCSLength(s1,s2,0,0,0);
        System.out.println(length);
    }
}
