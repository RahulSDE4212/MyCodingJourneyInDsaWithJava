package BASICS;
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);

        System.out.println("Enter the principal amount: ");
        int principal = sc.nextInt();
        System.out.println("Enter the rate: ");
        int rate = sc.nextInt();
        System.out.println("Enter time: ");
        int time = sc.nextInt();

        double si = (double) (principal * rate * time) / 100;
        System.out.println(si);
    }
}
