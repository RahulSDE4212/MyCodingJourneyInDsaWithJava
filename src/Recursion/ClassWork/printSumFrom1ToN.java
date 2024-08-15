package Recursion.ClassWork;

import java.util.Scanner;

public class printSumFrom1ToN {
    public static int sumFrom1ToN(int n){
        if(n==1) return 1;
        return n + sumFrom1ToN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int ans = sumFrom1ToN(n);
        System.out.println(ans);
    }
}
