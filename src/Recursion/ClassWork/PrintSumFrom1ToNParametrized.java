package Recursion.ClassWork;

import java.util.Scanner;

public class PrintSumFrom1ToNParametrized {
    public static void sum(int n, int sum){
        // base case
        if(n==0){
            System.out.println(sum);
            return;
        }
        // sum(n,sum) task is to calculate sum from 1 to n
        // what this function is saying that i am going to ask
        // sum(n-1,sum+n) to calculate the sum further
        sum(n-1,sum+n);

    }
    public static void main(String[] args) {
        System.out.println("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // calling the function whose task is to print sum from 1 to n
        int sum = 0;
        sum(n,sum);
    }
}
