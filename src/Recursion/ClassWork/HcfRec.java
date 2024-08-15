package Recursion.ClassWork;

import java.util.Scanner;

public class HcfRec {
    public static int hcf(int a, int b){
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
    public static int gcd(int a, int b){
        int rem = a % b;
        if(rem==0) return b;
        return gcd(b,rem);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(gcd(max,min));
    }
}
