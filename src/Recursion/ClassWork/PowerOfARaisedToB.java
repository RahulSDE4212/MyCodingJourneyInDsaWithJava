package Recursion.ClassWork;

import java.util.Scanner;

public class PowerOfARaisedToB {
    public static int pow(int a, int b) throws Error{
        // this function task is to calculate a^b
        // this function tells that i do not know the exact answer
        // but i will be able to calculate the exact answer once
        // i will ask pow(a,b-1) to give me the answer of a^b-1
        // then my answer will be a * pow(a,b-1)
        // hey but there is one case where i know my exact answer
        // base case
        if(a==0 && b==0) throw new Error("not defined........");
        if(b==0) return 1;
        int ans = a * pow(a,b-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Enter the a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the b: ");
        int b = sc.nextInt();
        // calling the power method whose task is to calulte a ^b
        int ans = pow(a,b);
        System.out.println(a+" raised to the power "+b+" is: " + ans);
    }
}
