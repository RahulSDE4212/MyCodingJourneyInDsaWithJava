package Looping;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        int lcm = max;
        int i = 2;

        while(lcm % min != 0) {
            lcm = max * i;
            i++;
        }

        System.out.println("the lcm is : " + lcm);
    }
}
