package Week_7_Strings.ExtraQuestion;

public class L459_RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        boolean bool = false;
        int n = s.length();
        for(int len=n/2;len>=1;len--){
            if(n%len==0){
                int times = n / len;
                String str = s.substring(0,len);
                String ans = "";
                while(times>0){
                    ans += str;
                    times--;
                }
                if(s.equals(ans)) return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String s = "abcabcabcabcabcabcabc";
        boolean bool = repeatedSubstringPattern(s);
        System.out.println(bool);
    }
}
