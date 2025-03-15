package Week_12_Recursion.ClassWork;

import java.util.Scanner;

public class PrintSum {
    public static int sum(int n){
        // sum(n) task is to calculate the sum from 1 to n
        // Now, what sum(n) is saying that i do not know the exact answer
        // i am going to aks sum(n-1) to give me the sum of 1 to n-1
        // then i will be able to find the exact answer
        // hey but hold on if n == o i know the exact answer
        // base case
        if(n==0) return 0;
        int ans = n + sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // calling the method whose task is to return sum of 1 to n
        System.out.println(sum(n));
    }
}
