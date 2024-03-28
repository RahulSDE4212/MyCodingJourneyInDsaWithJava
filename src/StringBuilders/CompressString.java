package StringBuilders;
import java.util.*;
public class CompressString {
    public static void main(String[] args) {
        String s = "aaaaabbbbccccdddd";
        char[] arr = s.toCharArray();
        int n = s.length();
        String ans = "";
        int i = 0, j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                ans += arr[i];
                int len = j-i;
                if(len>1) ans += len;
                i=j;
            }
        }
        ans += arr[i];
        if(j-i>1) ans += j-i;
        System.out.println(ans);
    }
}
