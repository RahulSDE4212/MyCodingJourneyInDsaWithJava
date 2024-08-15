package BASICS.Assignment;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rahul singh");
        System.out.println("Enter a number: ");
        String a = sc.next();
        System.out.println("Enter another number: ");
        String b = sc.next();
        String c = a+b;
        System.out.println("The sum of "+ a + " and "+ b + " is: " + c);
    }
}
