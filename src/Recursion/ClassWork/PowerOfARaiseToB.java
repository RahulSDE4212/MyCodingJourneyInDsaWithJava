package Recursion.ClassWork;
import java.util.*;
public class PowerOfARaiseToB {
    public static int power(int a, int b){
        if(b==1) return a;
        int ans = a * power(a,b-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A and B: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = power(a,b);
        System.out.println("A raise to power B is: " + ans);
    }
}
