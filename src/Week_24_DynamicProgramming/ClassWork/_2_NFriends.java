package Week_24_DynamicProgramming.ClassWork;
import java.util.*;


public class _2_NFriends {
    public static int f(int n){
        if(n == 1 || n == 2) return n;
        return f(n - 1) + (n - 1) * f(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(f(n));
    }
}
