package Week_12_Recursion.ClassWork;
import java.util.ArrayList;
public class SubsetOfString {
    static ArrayList<String> ans = new ArrayList<>();
    public static void subset(int i,String s,String t){
        if(i==s.length()){
            ans.add(t);
            return;
        }
        char ch = s.charAt(i);
        subset(i+1,s,t);
        subset(i+1,s,t+ch);
    }
    public static void main(String[] args) {
        String s = "123";
        subset(0,s,"");
        System.out.println(ans);
    }
}
