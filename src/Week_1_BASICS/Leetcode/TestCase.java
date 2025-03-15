package Week_1_BASICS;

public class TestCase {
    public static void updateString1(String ans){
        ans += "a";
        System.out.println(ans);
    }
    public static void updateString(String ans){
        ans += "c";
        updateString1(ans);
        System.out.println(ans);
    }
    public static void permutation(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            ans = ans + s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            permutation(left+right,ans);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permutation(s,"");
    }
}
