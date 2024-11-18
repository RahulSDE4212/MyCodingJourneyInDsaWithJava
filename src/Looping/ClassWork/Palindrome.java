package Looping;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int n = num;

        int revNum = 0;
        int rem;
        while(num != 0){
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }

        if(revNum == n) System.out.println("Palindrome number: ");
        else System.out.println("Not a palindrome number: ");

    }
}
