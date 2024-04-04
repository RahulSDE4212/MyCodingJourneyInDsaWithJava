package Conditional.Assignment;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1<=num2){
            if(num1<=num3) System.out.println(num1);
            else System.out.println(num3);
        }
        else {
            if(num2<=num3) System.out.println(num2);
            else System.out.println(num3);
        }
    }
}
