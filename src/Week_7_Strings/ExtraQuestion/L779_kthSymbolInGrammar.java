package Week_7_Strings.ExtraQuestion;

public class L779_kthSymbolInGrammar {
    public static int solve(int n, int k){
        // base case
        if(n==1 && k==1) return 0;
        int length = (int)Math.pow(2,n-1); // length of the string at the ith row
        int mid = length / 2;
        // yadi kth bit first half me hai to n-1th row ke kth bit hi hamara answer hai
        // yadi kth bit second half me hai to n-th row ke k-mid bit ka complement humara answer hai.
        if(k<=mid) return solve(n-1,k);
        int num = solve(n-1,k-mid);
        if(num==0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        int ans = solve(n,k);
        System.out.println(ans);
    }
}
