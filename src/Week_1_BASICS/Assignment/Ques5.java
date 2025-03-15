package Week_1_BASICS.Assignment;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float radius = sc.nextFloat();
        double area = 3.14 * radius * radius;
        System.out.println(area);
        System.out.println();

        System.out.print("Enter the principal amount");
        int p = sc.nextInt();
        System.out.print("Enter the time: ");
        int t = sc.nextInt();
        System.out.print("Enter the rate : ");
        int r = sc.nextInt();
        double si = (double) (p * r * t) /100;
        System.out.println(si);
    }
}
