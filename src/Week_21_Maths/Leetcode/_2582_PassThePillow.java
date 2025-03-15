package Week_21_Maths.Leetcode;

public class _2582_PassThePillow {
    public static int helper(int curr,int n, int time, char dir){
        if(time==0) return curr;
        if(curr <= n-1 && dir=='f') return helper(curr+1,n,time--,'f');
        return helper(curr--,n,time--,'b');

    }
    public static int passThePillow(int n, int time) {
        /* **** Approach-1 : using maths ****************
        * Time complexity  : O(1)
        * Space complexity : O(1)
        *  */
//        int rem = time % (n-1);
//        int quot = time / (n-1);
//        if(quot%2==0) return 1 + rem;
//        else return n - rem;
        /* **** Approach-2 : using recursion **************
        *
        * */
        return helper(1,n,time,'f');
    }
    public static void main(String[] args) {
        int n = 4, time = 5;
        int ans = passThePillow(n,time);
        System.out.println(ans);
    }
}
