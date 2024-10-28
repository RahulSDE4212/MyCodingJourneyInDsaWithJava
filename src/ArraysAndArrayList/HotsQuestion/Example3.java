package ArraysAndArrayList.HotsQuestion;

import java.util.Scanner;

public class Example3 {
    public static int[] balanced(String str){
        int n = str.length();
        int[] ans = new int[2];
        int start = 0;
        int max = 0;
        while(start<str.length()-1){
            int Acount = 0;
            int Bcount = 0;
            if(str.charAt(start)=='A') Acount++;
            else Bcount++;
            int next = start+1;
            while(next<str.length()){
                if(str.charAt(next)=='A') Acount++;
                else Bcount++;
                if(Acount == Bcount){
                    if(next-start+1>max){
                        max = next-start+1;
                        ans[0] = start;
                        ans[1] = next;
                    }
                }
                next++;
            }
            start++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] ans = balanced(str);
        int i = ans[0];
        int j = ans[1];
        for(int k = i;k<=j;k++){
            System.out.print(str.charAt(k));
        }
    }
}
