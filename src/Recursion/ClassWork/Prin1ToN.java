package Recursion.ClassWork;

import java.util.Scanner;

public class Prin1ToN {
    public static void print(int n){
        // if n<=0 just return
        // base case
        if(n<=0) return;
        // print(n) is saying that i will do my task after print(n-1) will do his task
        // print(n) task is to print 1 to n
        // print(n) is saying that ask print(n-1) to print from 1 to n-1
        // after that i will print n
        print(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        System.out.println("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // calling the function to print 1 to n
        print(n);
    }
}
