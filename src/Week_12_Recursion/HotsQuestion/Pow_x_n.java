package Week_12_Recursion.HotsQuestion;

public class Pow_x_n {
    public static double helper(double x, int n){
            if(n==0) return 1;
            double ans = helper(x,n/2);
            if(n%2==0) return ans * ans;
            else return ans * ans * x;
    }
    public static double myPow(double x, int n) {
        boolean bool = false;
        if(n<0){
            n = n * -1;
            bool = true;
        }
        double ans = helper(x,n);
        if(bool) ans = 1 / ans;
        return ans;
    }
    public static void main(String[] args) {
        double x = 2.000000;
        int n = -2;
        double ans = myPow(x,n);
        System.out.println(ans);
    }
}
