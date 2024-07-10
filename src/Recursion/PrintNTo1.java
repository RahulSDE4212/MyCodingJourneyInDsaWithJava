package Recursion;

import java.util.Scanner;

public class PrintNTo1 {
    public static void printing(int n){
        if(n==0) return;
        System.out.print(n + " ");
        printing(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printing(n);
    }
}
