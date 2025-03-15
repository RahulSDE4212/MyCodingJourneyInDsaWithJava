package Week_12_Recursion.Assignment;

public class CountAndSay {
    public static String cAS(int n){
        if(n==1) return "1";
        String s = cAS(n-1) + "@";
        String ans = "";
        int i = 0;
        int j = i;
        while(j<s.length()){
            if(s.charAt(j) == s.charAt(i)) j++;
            else{
                ans += (j-i);
                ans += s.charAt(i);
                i = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 1;
        String s = cAS(n);
        System.out.println(s);
        s = cAS(2);
        System.out.println(s);
        s = cAS(3);
        System.out.println(s);
        s = cAS(4);
        System.out.println(s);
        s = cAS(5);
        System.out.println(s);
    }
}
