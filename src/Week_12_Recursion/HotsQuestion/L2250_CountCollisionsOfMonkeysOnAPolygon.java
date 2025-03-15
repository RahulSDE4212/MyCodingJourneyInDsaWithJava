package Week_12_Recursion.HotsQuestion;

public class L2250_CountCollisionsOfMonkeysOnAPolygon {
    public static int mod = 1000000007;
    public static long countCollisions(int n){
        long noOfMovement = pow(n);
        long ans = (pow(n)%mod-2)%mod;
        return ans;
    }
    public static long pow(int n){
        // this method is created to count the no. of ways monkeys can move.
        if(n==0) return 2;
        long ans = pow(n/2);
        if(n%2==0) {
            return (ans * ans)%mod;
        }
        else return ((ans*ans)%mod*2)%mod;
    }
    public static void main(String[] args) {
        int n = 3;
        long ans = countCollisions(n);
        System.out.println("The no. of collisons are: " + ans);
    }
}
