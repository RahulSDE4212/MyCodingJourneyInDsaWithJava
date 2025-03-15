package Week_2_Conditional;
import java.util.*;
public class SidesOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle: ");
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        boolean triangle = !((side1+side2) > side3 && (side1+side3) > side2 && (side3+side2) > side1);
        if(triangle) System.out.println("Triangle not possible");

        else if(side1 == side2 && side2 == side3) System.out.println("Equilateral triangle: ");
        else if(side1 == side2 || side2 == side3 || side3 == side1) System.out.println("isosceles triangle");
        else System.out.println("Scalene triangle: ");

    }
}
