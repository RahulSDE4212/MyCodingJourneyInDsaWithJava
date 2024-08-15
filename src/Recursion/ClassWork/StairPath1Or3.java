package Recursion.ClassWork;

import java.util.Scanner;

public class StairPath1Or3 {
    public static int stair(int n){
        if(n<=2) return 1;
        if(n==3) return 2;
        return stair(n-1) + stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int ans = stair(n);
        System.out.println("No. of ways to climb "+n+" stairs are : "+ans);

    }
}
