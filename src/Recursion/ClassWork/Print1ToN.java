package Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void printing(int x, int n){
        if(x>n) return;
        System.out.print(x + " ");
        printing(x+1,n);
    }
//    public static void printing(int n){
//        if(n==0) return;
//        printing(n-1);
//        System.out.print(n + " ");
//    }
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printing(1,n);
    }
}
