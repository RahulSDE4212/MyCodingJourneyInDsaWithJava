package StringBuilders;
import java.util.*;
public class StringWithMaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = {"10000","999","00999","00000000999"};
        String max = s[0];
        for(int i=1;i<s.length;i++){
            max = maximum(max,s[i]);
        }
        System.out.println(max);
    }
    public static String maximum(String a, String b){
        String s = purify(a), t = purify(b);
        if(s.length() > t.length()) return a;
        if(t.length() > s.length()) return b;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != t.charAt(i)){
                if((int)s.charAt(i) > (int)t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length() >= b.length()) return a;
        else return b;
    }
    public static String purify(String a){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='0') return a.substring(i);
        }
        return a;
    }
}
