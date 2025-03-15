package Week_2_Conditional.Assignment;
import java.util.*;
public class Ques6 {
    public static void main(String[] args) {
        System.out.println("Enter the sides of the triangle: ");
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if(!(side1+side2>side3 && side1+side3>side2 && side2+side3>side1)){
            System.out.println("enter the valid triangle ");
        }
        else 
        {
            if (side1 == side2 && side1 == side3) System.out.println("equilateral triangle");
            else if (side1 != side2 && side1 != side3) System.out.println("scalene triangle");
            else System.out.println("Isoceles triangle");
        }
    }
}
