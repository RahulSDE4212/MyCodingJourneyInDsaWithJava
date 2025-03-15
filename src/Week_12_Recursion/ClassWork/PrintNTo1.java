package Week_12_Recursion.ClassWork;

import java.util.Scanner;

public class PrintNTo1 {
    public static void print(int n){
        // print(n) says that if n<1 please just return do not need to do anything
        // base case
        if(n<1) return;
        // print(n) says that i don't need to do the entire task
        // what i will do is that i will print n only
        // please ask print(n-1) to print 1 to n-1
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // calling the method print(n) whose task is to print 1 to n
        print(n);
    }
}
