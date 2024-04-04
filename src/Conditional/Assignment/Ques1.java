package Conditional.Assignment;

import java.util.Scanner;

public class Ques1 {
    public static void evenOrOdd(int num){
        if((num%2==0)) System.out.println("Even number");
        else System.out.println("Odd number: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenOrOdd(num);
    }
}
