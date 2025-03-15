package Week_12_Recursion.HotsQuestion;
import java.util.*;
public class ExpressionAddOperators {
    // ans will store all the desired expression
    static List<String> ans = new ArrayList<>();
    public static void solve(int index,String num, int target, String curr, long prev, long res){
        // base case
        if(index>=num.length()){
            if(res==target) ans.add(curr);
            return;
        }
        String st = "";
        long currelem = 0;
        for(int i=index;i<num.length();i++){
            // will avoid leading zero
            if(i>index && num.charAt(index)=='0') break;
            st += num.charAt(i); // store the current character
            currelem = currelem*10+(num.charAt(i)-'0'); // convert current character into number
            if(index == 0){
                // do not perform any operation
                // index 0 hai isliye agle index wale element ko call kar rha hia
                solve(i+1,num,target,st,currelem,currelem);
            }
            else {
                solve(i+1,num,target,curr+"+"+st,currelem,res+currelem); // addition
                solve(i+1,num,target,curr+"-"+st,-currelem,res-currelem); // subtraction
                solve(i+1,num,target,curr+"*"+st,prev*currelem,res-prev+(currelem*prev));// multiplication
            }
        }
    }
    public static void main(String[] args) {
        String num = "123";
        int target = 6;
        // function call
        solve(0,num,target,"",0,0);
        System.out.println(ans);
    }
}
