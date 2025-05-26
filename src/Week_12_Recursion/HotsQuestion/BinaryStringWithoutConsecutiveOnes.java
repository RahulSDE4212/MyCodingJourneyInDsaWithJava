package Week_12_Recursion.HotsQuestion;
import java.util.*;
public class BinaryStringWithoutConsecutiveOnes {
    //public static ArrayList<String> result;
    static int count;
    public static void solve(int n, String str){
        if(str.length() == n){
            //result.add(str);
            count++;
            return;
        }

        if(str.isEmpty() || str.charAt(str.length() - 1) == '0'){
            solve(n, str + '0');
            solve(n, str + '1');
        }
        else{
            solve(n, str + '0');
        }
    }
    public static void main(String[] args) {
        //result = new ArrayList<>();
        count = 0;
        int n = 3;
        solve(n, "");
        System.out.println(count);
    }
}
