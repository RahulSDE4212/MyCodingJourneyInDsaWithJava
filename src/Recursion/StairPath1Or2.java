package Recursion;
import java.util.*;
public class StairPath1Or2 {
    public static int stair(int n){
        if(n<=2) return n;
        return stair(n-1) + stair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int ans = stair(n);
        System.out.println("No. of ways to climb "+n+" stairs are : "+ans);

    }
}
