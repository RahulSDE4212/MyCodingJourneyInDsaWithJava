package Week_12_Recursion.ClassWork;

public class GenerateParentheses {
    public static void generateParentheses(int nOB, int nCB, String ans){
        if(nOB==0 && nCB==0) {
            System.out.println(ans);
            return;
        }
        if(nOB==nCB) generateParentheses(nOB-1,nCB,ans+'(');
        else if(nOB==0) generateParentheses(nOB,nCB-1,ans+')');
        else {
            generateParentheses(nOB,nCB-1,ans+')');
            generateParentheses(nOB-1,nCB,ans+'(');
        }
    }
    public static void add(int open, int close, int n, String ans){
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
        if(open<n) add(open+1,close,n,ans+"(");
        if(close<open) add(open, close+1, n, ans+")");
    }
    public static void main(String[] args) {
        int noOfParentheses = 3;
        //generateParentheses(3,3,"");
        add(0,0,3,"");
    }
}
