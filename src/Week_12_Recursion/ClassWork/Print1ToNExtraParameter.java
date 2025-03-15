package Week_12_Recursion.ClassWork;

import java.util.Scanner;

public class Print1ToNExtraParameter {
    public static void print(int x, int n){
        // print(x,n) is saying that if x > n just return do not need to do any task
        // base case
        if(x>n) return;
        // print(x,n) task is to print 1 to n
        // print(x,n) is saying that what i am going to do is
        // i am going to print x
        // ans ask recursion to print form x+1 to n
        System.out.print(x + " ");
        print(x+1,n);
    }
    public static void main(String[] args) {
        System.out.println("Enter the n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // calling the method whose task is to print 1 to n
        print(1,n);
    }
}
