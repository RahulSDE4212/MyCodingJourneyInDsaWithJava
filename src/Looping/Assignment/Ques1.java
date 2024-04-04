package Looping.Assignment;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        System.out.println("Sum of natural numbers upto n ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
