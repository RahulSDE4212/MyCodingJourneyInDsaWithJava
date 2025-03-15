package Week_12_Recursion.ClassWork;

import java.util.Scanner;

public class PowerLogarithmic {
    public static int pow(int a, int b) throws Error{
        // pow(a,b) task is to calculate the a^b
        // this method tells that i don't know the exact answer
        // if pow(a,b/2) will tell me his exact answer then i will find mine
        // there are some cases where i know my exact answer
        if(a==0 && b==0){
            throw new Error("not defined ...........");
        }
        if(b==0) return 1;
        int ans = pow(a,b/2);
        if(b%2==0) return ans*ans;
        return ans*ans*a;
    }
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int ans = pow(a,b);
        System.out.println(a+" raised to power "+b+" is: "+ans);
    }
}
