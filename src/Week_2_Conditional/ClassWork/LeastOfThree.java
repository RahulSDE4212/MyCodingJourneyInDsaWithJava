package Week_2_Conditional;
import java.util.*;
public class LeastOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        if(num1 <= num2)
        {
            if(num1 <= num3) System.out.println("the least  number is: " + num1);
            else System.out.println("the least number is: " + num3);
        }
        else {
            if(num2 <= num3 ) System.out.println("the least number is: " + num2);
            else System.out.println("the least number is: " + num3);
        }
    }
}
