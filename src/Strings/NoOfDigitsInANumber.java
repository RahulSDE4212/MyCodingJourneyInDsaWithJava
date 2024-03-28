package Strings;

import java.util.Scanner;

public class NoOfDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        String s = n + "";
        System.out.println("The no of digits: " + s.length());
    }
}
