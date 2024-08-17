package Recursion.HotsQuestion;
import java.util.*;
public class ExpressionAddOperators {
    static List<String> ans = new ArrayList<>();
    public static void solve(int index,String num, int target, String curr, long prev, long res){
        if(index>=num.length()){
            if(res==target) ans.add(curr);
            return;
        }
        String st = "";
        long currelem = 0;
        for(int i=index;i<num.length();i++){
            if(i>index && num.charAt(index)=='0') break;
            st += num.charAt(i);
            currelem = currelem*10+(num.charAt(i)-'0');
            if(index == 0){
                solve(i+1,num,target,st,currelem,currelem);
            }
            else {
                solve(i+1,num,target,curr+"+"+st,currelem,res+currelem);
                solve(i+1,num,target,curr+"-"+st,-currelem,res-currelem);
                solve(i+1,num,target,curr+"*"+st,prev*currelem,res-prev+(currelem*prev));
            }
        }
    }
    public static void main(String[] args) {
        String num = "123";
        int target = 6;
        solve(0,num,target,"",0,0);
        System.out.println(ans);
    }
}
