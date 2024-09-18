package Recursion.Assignment;

public class ReverseANumber {
    public static int reverse(int n, int ans){
        // this function task is to reverse the number
        // this function says that what i am going to do is that i am going to add last
        // no in the final ans
        // base case
        if(n==0){
            return ans;
        }
        int rem = n % 10;
        ans = ans * 10 + rem;
        return reverse(n/10,ans);
    }
    public static void main(String[] args) {
        int n = 123;
        int reversedNo = reverse(n,0);
        System.out.println(reversedNo);
    }
}
