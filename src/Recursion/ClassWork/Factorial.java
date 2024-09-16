package Recursion.ClassWork;

import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        // fact(n) says that if n==1 then i know my exact answer it is 1 only
        // base case
        if(n==1) return 1;
        // fact(n) is saying that i don't know the exact answer
        // please ask fact(n-1) first what is his answer
        // then i will be able to know the exact answer
        // because i know that my answer is n * fact(n-1)
        int ans = n * fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // calling the function fact whose task is to calculate factorial of n
        int ans = fact(n);
        System.out.println(ans);
    }
}
