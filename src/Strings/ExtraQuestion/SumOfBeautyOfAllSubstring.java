package Strings.ExtraQuestion;
import java.util.*;
public class SumOfBeautyOfAllSubstring {
    public static int max(String s){
        int max = 1;
        for(int i=0;i<s.length();i++){
            int sum = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i)) sum++;
            }
            max = Math.max(sum,max);
        }
        return max;
    }
    public static int min(String s){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            int sum = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i)) sum++;
            }
            min = Math.min(sum,min);
        }
        return min;
    }
    public static int beautyOfString(String s){
        int min = min(s);
        int max = max(s);
        return max-min;
    }
    public static int beauty(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0 && arr[i]<min) min = arr[i];
            if(arr[i]>0 && arr[i]>max) max = arr[i];
        }
        return max - min;
    }
    public static void main(String[] args) {
        String s = "aabcbaa";

        /* ******* Brute-Force Approach ********** */
        int sumOfBeauty=0;
        for(int i=0;i<s.length();i++){
            int[] arr = new int[26];
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                int ascii = (int)ch-97;
                arr[ascii]++;
                int beauty = beauty(arr);
                sumOfBeauty += beauty;
            }
        }
        System.out.println(sumOfBeauty);
    }
}
